package com.ducgao.spoyer_sdk.model

import java.util.*

data class PreGame(
    val id: String,
    val time: Date,
    val home: Team,
    val away: Team,
    val league: League
)
