package com.example.lupus_hosted_v2_1.model.validatorStrategy

import com.example.lupus_hosted_v2_1.model.PlayerDetails
import com.example.lupus_hosted_v2_1.model.manager.RoleVotes

class DeadPlayerNotValid : ValidatorStrategy(
    types = listOf(ValidatorStrategyType.DeadPlayerNotValid)
) {

    /**
     * return true if the player is alive, false otherwise
     */
    override fun validateVote(lastVotingState: RoleVotes, voter: PlayerDetails, votedPlayer: PlayerDetails): Boolean {
        if(votedPlayer.alive)
            return true
        throwValidationException(types.first())
    }

}