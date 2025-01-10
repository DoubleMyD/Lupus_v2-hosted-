package com.example.lupus_hosted_v2_1.data.repository

import com.example.lupus_hosted_v2_1.data.database.entity.Player
import kotlinx.coroutines.flow.Flow

interface PlayersRepository {

    fun getAllPlayersStream(): Flow<List<Player>>

    fun getPlayerStream(id: Int): Flow<Player?>

    suspend fun insertPlayer(player: Player)

    suspend fun deletePlayer(player: Player)

    suspend fun updatePlayer(player: Player)


    fun getPlayerByName(name: String): Flow<Player?>

    suspend fun getPlayersByIds(playerIds: List<Int>): List<Player>

}