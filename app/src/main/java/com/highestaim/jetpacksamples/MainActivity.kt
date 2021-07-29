package com.highestaim.jetpacksamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.highestaim.jetpacknewsapp.ui.theme.JetpackNewsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackNewsAppTheme {
                /*val painter = painterResource(id = R.drawable.kermit)
                val description = "Kermit playing in the snow"
                val title = "kermit is playing in th snow"
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)
                ) {
                    ImageCard(
                        painter = painter, title = title, description = description
                    )
                }*/
                //TextViewExample(this)

            }
            /*Column(Modifier.fillMaxSize()) {
                val color = remember {
                    mutableStateOf(Color.Yellow)
                }
                ColorBox(
                    Modifier
                        .weight(1F)
                        .fillMaxSize()
                ) {
                    color.value = it
                }
                Box(
                    modifier = Modifier
                        .background(color.value)
                        .weight(1F)
                        .fillMaxSize()
                )
            }*/

           // SnackBarWithText()
            //ListView()
            //Constrain()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackNewsAppTheme {
        Column("Android")
    }
}