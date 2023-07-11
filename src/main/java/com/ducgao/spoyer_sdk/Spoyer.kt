package com.ducgao.spoyer_sdk

import com.ducgao.spoyer_sdk.Parser.parseGameResult
import com.ducgao.spoyer_sdk.Parser.parseGameState
import com.ducgao.spoyer_sdk.Parser.parseLeaderboard
import com.ducgao.spoyer_sdk.Parser.parseLive
import com.ducgao.spoyer_sdk.Parser.parseLiveWithLeagueId
import com.ducgao.spoyer_sdk.Parser.parseOdd
import com.ducgao.spoyer_sdk.Parser.parseUpcoming
import com.ducgao.spoyer_sdk.model.*
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@OptIn(DelicateCoroutinesApi::class)
class Spoyer {
    private val client = NetworkClient()

    private val login = "ayna"
    private val token = "12784-OhJLY5mb3BSOx0O"

    private var isUseEnglish = true

    fun getLiveGames(sport: Sport, onComplete: (List<LiveGame>) -> Unit) {
        GlobalScope.launch {
            val data =
                client.call("https://spoyer.com/api/${if (isUseEnglish) "en/" else ""}get.php?login=${login}&token=${token}&task=livedata&sport=" + sport.param)
            if (data.first != null) {
                onComplete(parseLive(data.first!!, sport))
            } else {
                onComplete(listOf())
            }
        }
    }

    fun getLiveGamesWithLeagueId(
        sport: Sport,
        leagueId: String,
        onComplete: (List<LiveGame>) -> Unit
    ) {
        GlobalScope.launch {
            val data =
                client.call("https://spoyer.com/api/${if (isUseEnglish) "en/" else ""}get.php?login=${login}&token=${token}&task=livedata&sport=" + sport.param)
            if (data.first != null) {
                onComplete(parseLiveWithLeagueId(data.first!!, sport, leagueId))
            } else {
                onComplete(listOf())
            }
        }
    }

    fun getUpcomingGames(sport: Sport, onComplete: (List<PreGame>) -> Unit) {
        GlobalScope.launch {
            val data =
                client.call("https://spoyer.com/api/${if (isUseEnglish) "en/" else ""}get.php?login=${login}&token=${token}&task=predata&league=0&sport=" + sport.param)
            if (data.first != null) {
                onComplete(parseUpcoming(data.first!!, sport))
            } else {
                onComplete(listOf())
            }
        }
    }

    fun getUpcomingGamesWithLeagueId(
        sport: Sport,
        leagueId: String,
        onComplete: (List<PreGame>) -> Unit
    ) {
        GlobalScope.launch {
            val data =
                client.call("https://spoyer.com/api/${if (isUseEnglish) "en/" else ""}get.php?login=${login}&token=${token}&task=predata&league=${leagueId}&sport=" + sport.param)
            if (data.first != null) {
                onComplete(parseUpcoming(data.first!!, sport))
            } else {
                onComplete(listOf())
            }
        }
    }

    fun getLeaderboard(sport: Sport, leagueId: String, onComplete: (Leaderboard?) -> Unit) {
        GlobalScope.launch {
            val data =
                client.call("https://spoyer.com/api/${if (isUseEnglish) "en/" else ""}get.php?login=${login}&token=${token}&task=tabledata&league=" + leagueId)
            if (data.first != null) {
                onComplete(parseLeaderboard(data.first!!, sport))
            } else {
                onComplete(null)
            }
        }
    }

    fun getGameStat(sport: Sport, gameId: String, onComplete: (GameStat?) -> Unit) {
        GlobalScope.launch {
            val data =
                client.call("https://spoyer.com/api/${if (isUseEnglish) "en/" else ""}get.php?login=${login}&token=${token}&task=eventdata&game_id=" + gameId)
            if (data.first != null) {
                onComplete(parseGameState(data.first!!, sport))
            } else {
                onComplete(null)
            }
        }
    }

    fun getGameOdd(gameId: String, requireDraw: Boolean, onComplete: (Odd?) -> Unit) {
        GlobalScope.launch {
            val data =
                client.call("https://spoyer.com/api/${if (isUseEnglish) "en/" else ""}get.php?login=${login}&token=${token}&task=allodds&game_id=" + gameId)
            if (data.first != null) {
                onComplete(parseOdd(data.first!!, requireDraw))
            } else {
                onComplete(null)
            }
        }
    }

    fun getGameResult(sport: Sport, gameId: String, onComplete: (GameResult?) -> Unit) {
        GlobalScope.launch {
            val data = client.call("https://spoyer.com/api/${if (isUseEnglish) "en/" else ""}get.php?login=${login}&token=${token}&task=eventdata&game_id=" + gameId)
            if (data.first != null) {
                onComplete(parseGameResult(data.first!!, sport))
            } else {
                onComplete(null)
            }
        }
    }
}