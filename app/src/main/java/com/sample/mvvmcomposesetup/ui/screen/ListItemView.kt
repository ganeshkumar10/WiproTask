package com.sample.mvvmcomposesetup.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sample.mvvmcomposesetup.model.SchoolListResponse


@Composable
fun ListItemView(item: SchoolListResponse, onItemClick: (SchoolListResponse) -> Unit) {

    Card(
        modifier = Modifier
            .padding(top = 5.dp, bottom = 5.dp, start = 5.dp, end = 5.dp)
            .fillMaxWidth()
            .clickable { onItemClick(item) },
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
            Column(
                modifier = Modifier
                    .background(Color.Black)
                    .fillMaxWidth()
            ) {
                Text(
                    text = item.school_name.toString(),
                    color = Color.White,
                    style = typography.labelMedium,
                    modifier = Modifier.absolutePadding(
                        left = 5.dp, right = 5.dp, top = 5.dp, bottom = 5.dp
                    ), fontSize = 16.sp
                )
            }
        }
    }
}


