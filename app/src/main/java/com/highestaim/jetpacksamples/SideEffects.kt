package com.highestaim.jetpacksamples

import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay

@Composable
@Preview
fun SideEffects() {
    val scaffoldState = rememberScaffoldState()

    Scaffold(scaffoldState = scaffoldState) {
        val counter  = produceState(initialValue = 0) {
            delay(3000L)
            value = 4
        }

        if (counter.value % 5 == 0 && counter.value > 0) {
            LaunchedEffect(key1 = scaffoldState.snackbarHostState) {
                scaffoldState.snackbarHostState.showSnackbar("Hello")
            }
        }

        Button(onClick = { }) {
            Text("Click me: ${counter.value}")
        }
    }
}