package com.ducgao.spoyer_sdk

import com.ducgao.spoyer_sdk.model.*
import org.json.JSONObject
import java.sql.Date

object Parser {
    fun parseLive(data: JSONObject, sport: Sport): List<LiveGame> {
        try {
            val returnValue = mutableListOf<LiveGame>()
            val games = data.getJSONArray("games_live")
            for (i in 0 until games.length()) {
                val game = games.getJSONObject(i)
                val league = parseLeague(game.getJSONObject("league")) ?: throw Exception()
                returnValue.add(
                    LiveGame(
                        id = game.getString("game_id"),
                        time = Date(game.getString("time").toLong() * 1000),
                        home = parseTeam(game.getJSONObject("home"), sport) ?: throw Exception(),
                        away = parseTeam(game.getJSONObject("away"), sport) ?: throw Exception(),
                        timer = game.getString("timer"),
                        score = game.getString("score"),
                        league = league
                    )
                )
            }
            return returnValue
        } catch (e: Exception) {
            e.printStackTrace()
            return listOf()
        }
    }

    fun parseLiveWithLeagueId(data: JSONObject, sport: Sport, leagueId: String): List<LiveGame> {
        try {
            val returnValue = mutableListOf<LiveGame>()
            val games = data.getJSONArray("games_live")
            for (i in 0 until games.length()) {
                val game = games.getJSONObject(i)
                val league = parseLeague(game.getJSONObject("league")) ?: throw Exception()
                if (league.id.equals(leagueId, true)) {
                    returnValue.add(
                        LiveGame(
                            id = game.getString("game_id"),
                            time = Date(game.getString("time").toLong() * 1000),
                            home = parseTeam(game.getJSONObject("home"), sport)
                                ?: throw Exception(),
                            away = parseTeam(game.getJSONObject("away"), sport)
                                ?: throw Exception(),
                            timer = game.getString("timer"),
                            score = game.getString("score"),
                            league = league
                        )
                    )
                }
            }
            return returnValue
        } catch (e: Exception) {
            e.printStackTrace()
            return listOf()
        }
    }

    fun parseUpcoming(data: JSONObject, sport: Sport): List<PreGame> {
        try {
            val returnValue = mutableListOf<PreGame>()
            val games = data.getJSONArray("games_pre")
            for (i in 0 until games.length()) {
                val game = games.getJSONObject(i)
                val league = parseLeague(game.getJSONObject("league")) ?: throw Exception()
                returnValue.add(
                    PreGame(
                        id = game.getString("game_id"),
                        time = Date(game.getString("time").toLong() * 1000),
                        home = parseTeam(game.getJSONObject("home"), sport) ?: throw Exception(),
                        away = parseTeam(game.getJSONObject("away"), sport) ?: throw Exception(),
                        league = league
                    )
                )
            }
            return returnValue
        } catch (e: Exception) {
            e.printStackTrace()
            return listOf()
        }
    }

    fun parseLeaderboard(data: JSONObject, sport: Sport): Leaderboard? {
        try {
            val returnValue = mutableListOf<LeaderboardTeam>()
            val results = data.getJSONObject("results")
            val seasonName = results.getJSONObject("season").getString("name")
            val tables = results.getJSONObject("overall").getJSONArray("tables")
            for (i in 0 until tables.length()) {
                val table = tables.getJSONObject(i)
                val tableName = table.getString("name")
                if (tableName.equals(seasonName, true) || table.isNull("groupname")) {
                    val rows = table.getJSONArray("rows")

                    for (j in 0 until rows.length()) {
                        val row = rows.getJSONObject(j)

                        val pos = row.getString("sort_pos")
                        val win = row.getString("win")
                        val lose = row.getString("loss")
                        val points = row.getString("points")
                        val team = parseTeam(row.getJSONObject("team"), sport) ?: throw Exception()

                        returnValue.add(
                            LeaderboardTeam(
                                team, pos.toInt(), win.toInt(), lose.toInt(), points.toDouble()
                            )
                        )
                    }
                }
            }

            return Leaderboard(returnValue)
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }

    fun parseGameState(data: JSONObject, sport: Sport): GameStat? {
        try {
            val results = data.getJSONArray("results")
            val result = results.getJSONObject(0)
            val league = parseLeague(result.getJSONObject("league")) ?: throw Exception()
            val time = Date(result.getString("time").toLong() * 1000)
            val home = parseTeam(result.getJSONObject("home"), sport) ?: throw Exception()
            val away = parseTeam(result.getJSONObject("away"), sport) ?: throw Exception()
            val score = result.getString("ss")
            val scoreDetails = mutableListOf<Score>()
            val stats = mutableListOf<State>()

            with(result.getJSONObject("scores")) {
                keys().forEach { k ->
                    getJSONObject(k).let {
                        scoreDetails.add(
                            Score(
                                section = k,
                                home = it.getString("home"),
                                away = it.getString("away")
                            )
                        )
                    }
                }
            }

            with(result.getJSONObject("stats")) {
                keys().forEach { k ->
                    getJSONArray(k).let {
                        stats.add(State(name = k, home = it.getString(0), away = it.getString(1)))
                    }
                }
            }

            return GameStat(league, home, away, time, score, scoreDetails, stats)
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }

    fun parseGameResult(data: JSONObject, sport: Sport): GameResult? {
        try {
            val results = data.getJSONArray("results")
            val result = results.getJSONObject(0)
            val isFinish = result.getString("time_status").equals("3")
            if (!isFinish) {return null}

            val home = parseTeam(result.getJSONObject("home"), sport) ?: throw Exception()
            val away = parseTeam(result.getJSONObject("away"), sport) ?: throw Exception()
            val score = result.getString("ss")

            val homeScore = score.split("-")[0].toInt()
            val awayScore = score.split("-")[1].toInt()

            return GameResult(home, away, score, homeScore > awayScore)
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }

    fun parseOdd(data: JSONObject, requireDraw: Boolean): Odd? {
        try {
            val results = data.getJSONObject("results")
            results.keys().forEach { pk ->
                val p = results.getJSONObject(pk)
                val odd = p.getJSONObject("odds")
                odd.keys().forEach { ok ->
                    val period = odd.getJSONObject(ok)
                    period.keys().forEach { pek ->
                        val item = period.getJSONObject(pek)

                        if (requireDraw) {
                            if (item.has("home_od") && item.has("away_od") && item.has("draw_od")) {
                                if (!item.isNull("home_od") && !item.isNull("away_od") && !item.isNull("draw_od")) {
                                    return Odd(home = item.getString("home_od"), away = item.getString("away_od"), draw = item.getString("draw_od"))
                                }
                            }
                        } else {
                            if (item.has("home_od") && item.has("away_od")) {
                                if (!item.isNull("home_od") && !item.isNull("away_od")) {
                                    return Odd(home = item.getString("home_od"), away = item.getString("away_od"), draw = null)
                                }
                            }
                        }
                    }
                }
            }
            return null
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }

    private fun parseLeague(data: JSONObject): League? {
        return try {
            val name = data.getString("name")
            val id = data.getString("id")
            val cc = data.getString("cc")

            League(id = id, name = name, country = CountriesHelper.getCountry(cc))
        } catch (e: Exception) {
            null
        }
    }

    private fun parseTeam(data: JSONObject, sport: Sport): Team? {
        return try {
            val name = data.getString("name")
            val id = data.getString("id")
            val cc = data.getString("cc")

            return Team(
                id = id,
                name = name,
                country = CountriesHelper.getCountry(cc),
                image = "https://spoyer.com/api/team_img/${sport.param}/$id.png"
            )
        } catch (e: Exception) {
            null
        }
    }
}