package com.ducgao.spoyer_sdk.model

data class LeaderboardTeam(
    val team: Team,
    val position: Int,
    val win: Int,
    val lose: Int,
    val points: Double,
)