package com.e.learningcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.e.learningcompose.ui.theme.LearningComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column(
                    modifier = Modifier
                        .clickable {
                            Toast
                                .makeText(this, "Block", Toast.LENGTH_SHORT)
                                .show()
                        }
                        .background(Color.Green)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .padding(40.dp, 60.dp, 80.dp, 100.dp)
                        .border(5.dp, Color.Red),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Hello", modifier = Modifier
                        .clickable {
                            Toast
                                .makeText(this@MainActivity, "Hello", Toast.LENGTH_SHORT)
                                .show()
                        }
                        .background(Color.White)
                        .border(2.dp, Color.Black)
                        .padding(20.dp)
                    )
                    Text(text = "Hola", modifier = Modifier

                        .clickable {
                            Toast
                                .makeText(this@MainActivity, "Hola", Toast.LENGTH_SHORT)
                                .show()
                        }
                        .background(Color.White)
                        .border(2.dp, Color.Black)
                        .padding(20.dp)
                    )
                    Text(
                        text = "Bonjour",
                        color = Color.Black,
                        modifier = Modifier
                            .clickable {
                                Toast
                                    .makeText(this@MainActivity, "Bonjour", Toast.LENGTH_SHORT)
                                    .show()
                            }
                            .background(Color.White)
                            .border(2.dp, Color.Black)
                            .padding(20.dp)

                    )
                    Text(text = "Dattebayo", modifier = Modifier
                        .clickable {
                            Toast
                                .makeText(this@MainActivity, "Dattebayo", Toast.LENGTH_SHORT)
                                .show()
                        }
                        .background(Color.White)
                        .border(2.dp, Color.Black)
                        .padding(20.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearningComposeTheme {
        Greeting("Android")
    }

}
