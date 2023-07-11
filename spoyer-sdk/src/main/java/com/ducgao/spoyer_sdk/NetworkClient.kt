package com.ducgao.spoyer_sdk

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.json.JSONObject
import java.io.IOException
import java.util.*
import java.util.concurrent.TimeUnit

class NetworkClient {
    private var client: OkHttpClient = OkHttpClient.Builder()
        .connectTimeout(20, TimeUnit.SECONDS)
        .writeTimeout(20, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .build()

    fun cancelCall(token: String) {
        for (call in client.dispatcher().runningCalls()) {
            if (call.request().tag().equals(token)) call.cancel()
        }

        for (call in client.dispatcher().queuedCalls()) {
            if (call.request().tag().equals(token)) call.cancel()
        }
    }

    fun call(url: String): Pair<JSONObject?, String> {
        val time = Date().time.toString()

        try {
            val request = Request.Builder()
                .url(url)
                .header("Package", "KlUet6y43te8Jg6G9bkDxN36f9X9ZiTkm")
                .tag("requestKey")
                .build()
            var responses: Response? = null

            try {
                responses = client.newCall(request).execute()
            } catch (e: IOException) {
                e.printStackTrace()
                return null to time
            }

            val jsonData = responses?.body()?.string()
            return if (jsonData != null) {
                val jObject = JSONObject(jsonData)
                jObject to time
            } else {
                null to time
            }
        } catch (e: Exception) {
            e.printStackTrace()
            return null to time
        }
    }
}