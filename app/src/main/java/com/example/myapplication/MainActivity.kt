package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.*


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
// сделать две строчки для ввода чисел
//
// var p: String = "+"
// var st = mutableListOf<Int>()
// val sum = remember{mutableStateOf(0)}
// val current_num = remember{mutableStateOf("")}
// var firstEnter:Boolean = false
// var lastMathDo:MathDo = MathDo.None
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Gray)
            ) {
                val message = remember { mutableStateOf("") }
                val res = remember { mutableStateOf(0) }

                TextField(
                    message.value,
                    { message.value = it },
                    textStyle = TextStyle(fontSize = 50.sp), enabled = false,
                    colors = TextFieldDefaults.textFieldColors(
                        disabledTextColor = Color.Yellow,
                        containerColor = Color.Gray
                    ), modifier = Modifier.padding(start = 50.dp)
                )
                Text(
                    " "+ res.value,
                    modifier = Modifier.padding(start = 250.dp, top = 130.dp),
                    fontSize = 70.sp,
                    color = Color.Yellow
                )
                Box(
                    modifier = Modifier,
                ) {
                    Row(
                        modifier = Modifier
                            .padding(top = 250.dp)
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    )
                    {
                        Column {
                            Button(
                                onClick = {
                                    message.value += "+"
                                },
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                )
                            )
                            {
                                Text("+", fontSize = 50.sp)
                            }
                            Button(
                                onClick = { message.value += "1" },
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                modifier = Modifier.padding(top = 20.dp)
                            )
                            {
                                Text("1", fontSize = 50.sp)
                            }
                            Button(
                                onClick = { message.value += "4" },
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                modifier = Modifier.padding(top = 20.dp)
                            )
                            {
                                Text("4", fontSize = 50.sp)
                            }
                            Button(
                                onClick = { message.value += "7" },
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                modifier = Modifier.padding(top = 20.dp)
                            )
                            {
                                Text("7", fontSize = 50.sp)
                            }
                        }
                        Column() {
                            Button(
                                onClick = { message.value += "-" },
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                )
                            )
                            {
                                Text("-", fontSize = 50.sp)
                            }
                            Button(
                                onClick = { message.value += "2" },
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ), modifier = Modifier.padding(top = 20.dp)
                            )
                            {
                                Text("2", fontSize = 50.sp)
                            }
                            Button(
                                onClick = { message.value += "5" },
                                colors = ButtonDefaults.buttonColors(
                                    Color.White, contentColor = Color.Black
                                ), modifier = Modifier.padding(top = 20.dp)
                            )
                            {
                                Text("5", fontSize = 50.sp)
                            }
                            Button(
                                onClick = { message.value += "8" },
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ), modifier = Modifier.padding(top = 20.dp)
                            )
                            {
                                Text("8", fontSize = 50.sp)
                            }
                        }
                        Column() {
                            Button(
                                onClick = { message.value += "*" },
                                    colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                )
                            )
                            {
                                Text("*", fontSize = 50.sp)
                            }
                            Button(
                                onClick = { message.value += "3" },
                                colors = ButtonDefaults.buttonColors(
                                    Color.White, contentColor = Color.Black
                                ), modifier = Modifier.padding(top = 20.dp)
                            )
                            {
                                Text("3", fontSize = 50.sp)
                            }
                            Button(
                                onClick = { message.value += "6" },
                                colors = ButtonDefaults.buttonColors(
                                    Color.White, contentColor = Color.Black
                                ), modifier = Modifier.padding(top = 20.dp)
                            )
                            {
                                Text("6", fontSize = 50.sp)
                            }
                            Button(
                                onClick = { message.value += "9" },
                                colors = ButtonDefaults.buttonColors(
                                    Color.White, contentColor = Color.Black
                                ), modifier = Modifier.padding(top = 20.dp)
                            )
                            {
                                Text("9", fontSize = 50.sp)
                            }
                        }
                        Column() {
                            Button(
                                onClick = { message.value += "/" },
                                colors = ButtonDefaults.buttonColors(
                                    Color.White, contentColor = Color.Black
                                )
                            )
                            {
                                Text("/", fontSize = 50.sp)
                            }
                            Button(
                                onClick = { message.value = "" },
                                colors = ButtonDefaults.buttonColors(
                                    Color.Yellow, contentColor = Color.Black
                                ), modifier = Modifier.padding(top = 20.dp)
                            )
                            {
                                Text("С", fontSize = 50.sp)
                            }
                            Button(
                                onClick = {
                                    message.value += " "
                                    var a = message.value
                                    var sample = ""
                                    val samples = mutableListOf<String>()
                                    val nums = mutableListOf<Int>()
                                    for (i in 0 until a.length) {
                                        if (a[i] != ' ') {
                                            if ((a[i] >= '0') && (a[i] <= '9')) {
                                                sample += a[i]
                                            } else {
                                                if (sample.isNotEmpty()) {
                                                    samples.add(sample)
                                                    sample = ""
                                                }
                                                samples.add(a[i].toString())
                                            }
                                        } else {
                                            if (sample.isNotEmpty()) {
                                                samples.add(sample)
                                                sample = ""
                                            }
                                        }
                                    }
                                    for (i in 0 until samples.size) {
                                        if ((samples[i][0] >= '0') && (samples[i][0] <= '9')) {
                                            nums.add(samples[i].toInt())
                                        }
                                    }
                                    val x = nums[1]
                                    nums.remove(0)
                                    var result = 0
                                    var k = 0
                                    for (i in 0 until samples.size) {
                                        if ((samples[i][0] == '*') || (samples[i][0] == '+') || (samples[i][0] == '-') || (samples[i][0] == '/')) {
                                            k++
                                            if (k == 1) {
                                                val y = nums[nums.size - 2]
                                                nums.removeAt(nums.size - 2);
                                                if (samples[i][0] == '*') {
                                                    result = (x * y)
                                                    nums.add(result)
                                                } else if (samples[i][0] == '+') {
                                                    result = (x + y)
                                                    nums.add(result)
                                                } else if (samples[i][0] == '-') {
                                                    result = (x - y)
                                                    nums.add(result)
                                                }
                                            }
                                            if (k > 1) {
                                                val y = nums[nums.size - 1]
                                                nums.removeAt(nums.size - 1);
                                                if (samples[i][0] == '*') {
                                                    result = (nums[0] * y)
                                                    nums.add(result)
                                                } else if (samples[i][0] == '+') {
                                                    result = (nums[0] + y)
                                                    nums.add(result)
                                                } else if (samples[i][0] == '-') {
                                                    result = (nums[0] - y)
                                                    nums.add(result)
                                                }
                                            }
                                        }
                                    }
                                    res.value = result
                                },
                                colors = ButtonDefaults.buttonColors(
                                    Color.Yellow, contentColor = Color.Black
                                ), modifier = Modifier.padding(top = 20.dp)
                            )
                            {
                                Text("=", fontSize = 50.sp)
                            }
                            Button(
                                onClick = { message.value += "0" },
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                modifier = Modifier.padding(top = 20.dp)
                            )
                            {
                                Text("0", fontSize = 50.sp)
                            }
                        }
                    }
                }
            }
        }
    }
}

