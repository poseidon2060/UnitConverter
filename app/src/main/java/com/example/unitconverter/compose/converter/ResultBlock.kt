package com.example.unitconverter.compose.converter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ResultBlock(
    message1 : String,
    message2 : String,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = 20.dp,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = message1,
                fontSize = 28.sp,
//                textAlign = TextAlign.Center
            )
            Text(
                text = message2,
                fontSize = 28.sp,
                color = Color.LightGray,
                fontWeight = FontWeight.Bold,
//                textAlign = TextAlign.Center
            )
        }
    }
}