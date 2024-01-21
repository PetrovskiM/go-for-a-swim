package data

import com.gfas.core.network.NetworkClient
import io.ktor.client.request.get

internal class SwimApi constructor(private val networkClient: NetworkClient) {

    suspend fun getMap() = networkClient.client.get("")

}