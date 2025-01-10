package com.example.lupus_hosted_v2_1.model.validatorStrategy

import com.example.lupus_hosted_v2_1.model.PlayerDetails
import com.example.lupus_hosted_v2_1.model.manager.RoleVotes

class CombinedVoteValidator(
    private val validators: List<ValidatorStrategy>
) : ValidatorStrategy(
    types = validators.flatMap { it.types }
){

    override fun validateVote(lastVotingState: RoleVotes, voter: PlayerDetails, votedPlayer: PlayerDetails): Boolean {
        // Return true only if all strategies validate the vote
        return validators.all { it.validateVote(lastVotingState, voter, votedPlayer) }
    }
}