package com.example.lupus_hosted_v2_1.model.manager

import com.example.lupus_hosted_v2_1.model.roles.RoleType

object GameRules {
    const val MAX_PLAYERS: Int = 30
    const val MIN_PLAYERS: Int = 6

    val ESSENTIAL_ROLES : List<RoleType> = listOf(
        RoleType.Assassino,
        RoleType.Medium,
        RoleType.Seduttrice,
        RoleType.Veggente,
        RoleType.Cittadino
    )
    val IDEAL_ROLE_DISTRIBUTION : Map<RoleType, Int> = mapOf(
        RoleType.Assassino to 3,
        RoleType.Medium to 1,
        RoleType.Seduttrice to 2,
        RoleType.Cupido to 1,
        RoleType.Veggente to 1,
        RoleType.Cittadino to 7
    )
}