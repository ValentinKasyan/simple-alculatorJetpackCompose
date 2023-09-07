package com.example.calculatorjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scope = rememberCoroutineScope()
            //import androidx.compose.runtime.*
            var textFieldState by remember {
                mutableStateOf("")
            }

            var textFieldCalculation by remember {
                mutableStateOf("")
            }
            Column(
                modifier = Modifier
//                    .background(Color.Gray)
                    .fillMaxHeight(1f)
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                TextField(value = textFieldState, label = {
//                       Text("0")
                }, onValueChange = {
                    textFieldState = it
                }, singleLine = true, modifier = Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(50.dp))
                TextField(
                    value = textFieldCalculation,
                    label = {},
                    onValueChange = { textFieldCalculation = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(text = "Text2", modifier = Modifier.offset(50.dp, 20.dp))
                Spacer(modifier = Modifier.height(50.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,

                    ) {
                    Button(onClick = { scope.launch { textFieldCalculation.plus("7")
                    } }) {
                        Text(text = " 7 ")
                    }
                    Button(onClick = { scope.launch { TODO() } }) {
                        Text(text = " 8 ")
                    }
                    Button(onClick = { scope.launch { TODO() } }) {
                        Text(text = " 9 ")
                    }
                    Button(onClick = { scope.launch { TODO() } }) {
                        Text(text = " * ")

                    }

                }
                Spacer(modifier = Modifier.height(30.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(110.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,

                    ) {
                    Button(onClick = { scope.launch { TODO() } }) {
                        Text(text = " 4 ")
                    }
                    Button(onClick = { scope.launch { TODO() } }) {
                        Text(text = " 5 ")
                    }
                    Button(onClick = { scope.launch { TODO() } }) {
                        Text(text = " 6 ")
                    }
                    Button(onClick = { scope.launch { TODO() } }) {
                        Text(text = " - ")

                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(110.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,

                    ) {
                    Button(onClick = { scope.launch { TODO() } }) {
                        Text(text = " 1 ")
                    }
                    Button(onClick = { scope.launch { TODO() } }) {
                        Text(text = " 2 ")
                    }
                    Button(onClick = { scope.launch { TODO() } }) {
                        Text(text = " 3 ")
                    }
                    Button(onClick = { scope.launch { TODO() } }) {
                        Text(text = " + ")

                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Button(onClick = { scope.launch { TODO() } }) {
                    Text(text = " = ")

                }
            }
        }

        @Composable
        fun Greeting(name: String, modifier: Modifier = Modifier) {
            Text(
                text = "Hello $name!",
                modifier = modifier
            )
        }
    }
}
