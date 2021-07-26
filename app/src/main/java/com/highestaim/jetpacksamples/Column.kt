package com.highestaim.jetpacksamples

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Column(name: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green)
            .padding(start = 15.dp, end = 25.dp)
            .border(width = 5.dp, color = Color.Magenta),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = " Column. Hello $name!", modifier = Modifier
                .offset(x = 50.dp, y = 20.dp)
        )
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "Column. Hi $name!")
        Text(text = "Column. How are you $name!")
    }
}