package com.example.lupus_hosted_v2_1.data.fake

import com.example.lupus_hosted_v2_1.data.database.entity.PlayersList

object FakePlayersListRepository {
    private var i = 1
    val playersLists = listOf(
        PlayersList(
            id = i++,
            name = "Lista giocatori $i",
            playersId = FakePlayersRepository.playerDetails.map { it.id }
        ),

    )
}