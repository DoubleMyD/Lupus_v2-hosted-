package com.example.lupus_hosted_v2_1.model.validatorStrategy

import com.example.lupus_hosted_v2_1.model.PlayerDetails
import com.example.lupus_hosted_v2_1.model.manager.RoleVotes

class DuplicateVoteNotValid : ValidatorStrategy(
    types = listOf(ValidatorStrategyType.DuplicateVoteNotValid)
){

    /**
     * return true if the voter did not already vote this player, false otherwise
     */
    override fun validateVote(lastVotingState: RoleVotes, voter: PlayerDetails, votedPlayer: PlayerDetails): Boolean {
        if(!lastVotingState.votesPairPlayers.any { it.voter == voter && it.votedPlayer == votedPlayer })
            return true
        throwValidationException(types.first())
    }
}