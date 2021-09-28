package com.e.learningcompose

import android.graphics.drawable.shapes.OvalShape
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
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.state.ToggleableState
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
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .padding(40.dp, 60.dp, 80.dp, 100.dp)
                        .border(5.dp, Color.Red)
                        .background(Color.Green),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Hello", modifier = Modifier.clickable {
                        Toast.makeText(this@MainActivity, "Hello", Toast.LENGTH_SHORT).show()
                    })
                    Text(text = "Hola", modifier = Modifier.clickable {
                        Toast.makeText(this@MainActivity, "Hola", Toast.LENGTH_SHORT).show()
                    })
                    Text(
                        text = "Bonjour",
                        color = Color.White,
                        modifier = Modifier
                            .background(Color.Red)
                            .border(2.dp, Color.Black)
                            .padding(20.dp)
                            .clickable {
                                Toast
                                    .makeText(this@MainActivity, "Bonjour", Toast.LENGTH_SHORT)
                                    .show()
                            }
                    )
                    Spacer(modifier = Modifier.height(100.dp))
                    Text(text = "Dattebayo", modifier = Modifier.clickable {
                        Toast.makeText(this@MainActivity, "Dattebayo", Toast.LENGTH_SHORT).show()
                    })
                }
            }
        }
    }
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