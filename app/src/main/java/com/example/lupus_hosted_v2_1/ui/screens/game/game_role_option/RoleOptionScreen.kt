package com.example.lupus_hosted_v2_1.ui.screens.game.game_role_option

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.lupus_hosted_v2_1.R
import com.example.lupus_hosted_v2_1.model.roles.RoleType
import com.example.lupus_hosted_v2_1.ui.commonui.LupusTopAppBar

@Composable
fun RoleOptionScreen(
    role: RoleType,
    modifier: Modifier = Modifier,
    canNavigateBack: Boolean = true,
    navigateUp: () -> Unit = {},
){
    Scaffold(
        modifier = modifier,
        topBar = {
            LupusTopAppBar(
                title = stringResource(id = R.string.role_reveal),
                canNavigateBack = canNavigateBack,
                navigateUp = navigateUp
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
        ){

        }
    }
}