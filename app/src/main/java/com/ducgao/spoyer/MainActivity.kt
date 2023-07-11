package com.ducgao.spoyer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ducgao.spoyer_sdk.Spoyer
import com.ducgao.spoyer_sdk.model.Sport

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
    }


    fun test() {
//        testLive()
//        testPre()
//        testTable()
//        testState()
        testOdd()
    }


    fun testLive() {
        Spoyer().getLiveGames(Sport.Volleyball) {
            Log.d("DUCGAO", "---------------")
            println(it)
        }
    }

    fun testPre() {
        Spoyer().getUpcomingGames(Sport.Volleyball) {
            Log.d("DUCGAO", "---------------")
            println(it)
        }
    }

    fun testTable() {
        Spoyer().getLeaderboard(Sport.Volleyball, leagueId = "1592") {
            Log.d("DUCGAO", "---------------")
            println(it)
        }
    }

    fun testState() {
        Spoyer().getGameStat(Sport.Volleyball, gameId = "6256569") {
            Log.d("DUCGAO", "---------------")
            println(it)
        }
    }

    fun testOdd() {
        Spoyer().getGameOdd(gameId = "6889257", true) {
            Log.d("DUCGAO", "---------------")
            println(it)
        }
    }

}