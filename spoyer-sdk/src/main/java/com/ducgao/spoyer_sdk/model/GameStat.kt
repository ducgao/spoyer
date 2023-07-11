package com.ducgao.spoyer_sdk.model

import java.sql.Date

data class GameStat(
    val league: League,
    val home: Team,
    val away: Team,
    val time: Date,
    val score: String,
    val scoreDetails: List<Score>,
    val stats: List<State>
)
