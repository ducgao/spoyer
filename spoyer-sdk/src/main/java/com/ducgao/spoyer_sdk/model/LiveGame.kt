package com.ducgao.spoyer_sdk.model

import java.util.*

data class LiveGame(
    val id: String,
    val time: Date,
    val home: Team,
    val away: Team,
    val score: String,
    val timer: String,
    val league: League
)
