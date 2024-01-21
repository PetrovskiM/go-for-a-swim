package com.gfas.core.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class NetworkClient {
    val client = HttpClient {
        install(ContentNegotiation) {
            json(Json { prettyPrint = true })
        }
        install(Logging)
    }
}