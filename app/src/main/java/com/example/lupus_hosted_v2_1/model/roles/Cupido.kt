package com.example.lupus_hosted_v2_1.model.roles

import androidx.compose.ui.graphics.Color
import com.example.lupus_hosted_v2_1.R
import com.example.lupus_hosted_v2_1.model.manager.RoundResult
import com.example.lupus_hosted_v2_1.model.validatorStrategy.ValidatorFactoryDeadPlayerNotValid
import com.example.lupus_hosted_v2_1.model.voteStrategy.MostVotedPlayer
import com.example.lupus_hosted_v2_1.model.voteStrategy.PairVote

class Cupido : Role(
    roleType = RoleType.Cupido,
    image = R.drawable.cupido,
    color = Color.Green,
    voteRoundExclusion = listOf(2..100),
    voteStrategy = PairVote(),
    validatorStrategy = ValidatorFactoryDeadPlayerNotValid.getValidatorDuplicateVote()
) {

    override fun roleRoundResult(mostVotedPlayers: Map<RoleType, MostVotedPlayer>): RoundResult {
        //delegate the result to the other classes
        return RoundResult(emptyList(), emptyList())
    }

}