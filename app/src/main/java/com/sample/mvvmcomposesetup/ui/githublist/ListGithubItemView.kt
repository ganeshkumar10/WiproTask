package com.sample.mvvmcomposesetup.ui.githublist

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sample.mvvmcomposesetup.model.response.UserListResponseItem

@Composable
fun ListGithubItemView(item: UserListResponseItem, onItemClick: (UserListResponseItem) -> Unit) {

    val loginName = item.login?.let {
        it.replaceFirstChar { char -> char.titlecaseChar() }
    } ?: ""
    val userId = item.userViewType ?: "N/A"


    Card(
        modifier = Modifier
            .padding(top = 5.dp, bottom = 5.dp, start = 5.dp, end = 5.dp)
            .fillMaxWidth()
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) { onItemClick(item) },
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        ),
    ) {
        Row(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(10.dp),
        ) {
            Text(
                text = loginName,
                modifier = Modifier.absolutePadding(
                    left = 5.dp, right = 5.dp, top = 5.dp, bottom = 5.dp
                ),
                style = typography.labelMedium.copy(color = Color.Black)
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = userId, modifier = Modifier.absolutePadding(
                    left = 5.dp, right = 5.dp, top = 5.dp, bottom = 5.dp
                ), style = typography.labelMedium.copy(color = Color.DarkGray)
            )
        }
    }
}
