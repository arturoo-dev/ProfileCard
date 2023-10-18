package com.arturodev.profilecard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CounterApp() {
    var counter by remember { mutableStateOf(0) }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Button(onClick = { counter++ }) {
            Text(text = "+")
        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "$counter", fontSize = 20.sp)
        Spacer(modifier = Modifier.width(10.dp))
        Button(onClick = { counter-- }) {
            Text(text = "-")
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun CounterAppPreview() {
    CounterApp()
}