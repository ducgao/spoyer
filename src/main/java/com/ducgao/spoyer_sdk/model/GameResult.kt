package com.ducgao.spoyer_sdk.model

data class GameResult(
    val home: Team,
    val away: Team,
    val score: String,
    val isHomeWin: Boolean
)