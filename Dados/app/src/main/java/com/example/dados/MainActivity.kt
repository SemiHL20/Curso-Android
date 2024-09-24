package com.example.dados

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dados.ui.theme.DadosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DadosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Screen()
                }
            }
        }
    }
}

@Composable
fun Screen() {
    var numberDices by remember { mutableStateOf("") }
    var numberSides by remember { mutableStateOf("") }
    var result1 by remember { mutableStateOf(1) }
    var result2 by remember { mutableStateOf(1) }
    var result3 by remember { mutableStateOf(1) }
    var result4 by remember { mutableStateOf(1) }
    var result5 by remember { mutableStateOf(1) }
    var result6 by remember { mutableStateOf(1) }

    var numberDicesInt = numberDices.toIntOrNull() ?: 1
    var numberSidesInt = numberSides.toIntOrNull() ?: 2

    val focusManager = LocalFocusManager.current
    val myFontSize = 50.sp
    val myColor = Color.DarkGray
    val myTitleColor = Color.Blue
    val myWeight = 0.5f
    val myAlign = TextAlign.Center
    val myFontWeight = FontWeight.Bold

    Column(
        modifier = Modifier.padding(22.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            stringResource(R.string.app_name),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontSize = 40.sp,
            fontFamily = FontFamily.Serif,
            color = myTitleColor,
            fontWeight = myFontWeight
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            TextField(
                label = { Text(stringResource(R.string.number_dices)) },
                value = numberDices,
                onValueChange = { numberDices = it },
                modifier = Modifier
                    .weight(myWeight)
                    .padding(0.dp, 0.dp, 5.dp, 0.dp),
                colors = TextFieldDefaults.textFieldColors(myTitleColor),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Phone,
                    imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions(
                    onNext = { focusManager.moveFocus(FocusDirection.Right) }
                )
            )
            TextField(
                label = { Text(stringResource(R.string.number_sides)) },
                value = numberSides,
                onValueChange = { numberSides = it },
                modifier = Modifier.weight(myWeight),
                colors = TextFieldDefaults.textFieldColors(myTitleColor),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Phone,
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions(
                    onDone = { focusManager.clearFocus() }
                )
            )
        }
        if(numberDicesInt < 1) numberDicesInt = 1
        when (numberDicesInt){
            1 -> Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.8f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = result1.toString(),
                        fontSize = myFontSize,
                        color = myColor
                    )
                }
            2 -> Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.8f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
                ){
                    Row() {
                        Text(
                            text = result1.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            modifier = Modifier.weight(myWeight),
                            textAlign = myAlign
                        )
                        Text(
                            text = result2.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            modifier = Modifier.weight(myWeight),
                            textAlign = myAlign
                        )
                    }
                }
            3 -> Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.8f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Row(
                        modifier = Modifier.weight(myWeight),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = result1.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            modifier = Modifier.weight(myWeight),
                            textAlign = myAlign
                        )
                        Text(
                            text = result2.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            modifier = Modifier.weight(myWeight),
                            textAlign = myAlign
                        )
                    }
                    Row(
                        modifier = Modifier.weight(myWeight),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = result3.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            textAlign = myAlign
                        )
                    }
                }
            4 -> Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.8f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Row(
                        modifier = Modifier.weight(myWeight),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = result1.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            modifier = Modifier.weight(myWeight),
                            textAlign = myAlign
                        )
                        Text(
                            text = result2.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            modifier = Modifier.weight(myWeight),
                            textAlign = myAlign
                        )
                    }
                    Row(
                        modifier = Modifier.weight(myWeight),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = result3.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            modifier = Modifier.weight(myWeight),
                            textAlign = myAlign
                        )
                        Text(
                            text = result4.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            modifier = Modifier.weight(myWeight),
                            textAlign = myAlign
                        )
                    }
                }
            5 -> Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.8f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Row(
                        modifier = Modifier.weight(0.33f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = result1.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            modifier = Modifier.weight(myWeight),
                            textAlign = myAlign
                        )
                        Text(
                            text = result2.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            modifier = Modifier.weight(myWeight),
                            textAlign = myAlign
                        )
                    }
                    Row(
                        modifier = Modifier.weight(0.33f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = result5.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            textAlign = myAlign
                        )
                    }
                    Row(
                        modifier = Modifier.weight(0.33f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = result3.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            modifier = Modifier.weight(myWeight),
                            textAlign = myAlign
                        )
                        Text(
                            text = result4.toString(),
                            fontSize = myFontSize,
                            color = myColor,
                            modifier = Modifier.weight(myWeight),
                            textAlign = myAlign
                        )
                    }
                }
            else -> Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.8f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Row(
                    modifier = Modifier.weight(0.33f),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = result1.toString(),
                        fontSize = myFontSize,
                        color = myColor,
                        modifier = Modifier.weight(myWeight),
                        textAlign = myAlign
                    )
                    Text(
                        text = result2.toString(),
                        fontSize = myFontSize,
                        color = myColor,
                        modifier = Modifier.weight(myWeight),
                        textAlign = myAlign
                    )
                }
                Row(
                    modifier = Modifier.weight(0.33f),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = result3.toString(),
                        fontSize = myFontSize,
                        color = myColor,
                        modifier = Modifier.weight(myWeight),
                        textAlign = myAlign
                    )
                    Text(
                        text = result4.toString(),
                        fontSize = myFontSize,
                        color = myColor,
                        modifier = Modifier.weight(myWeight),
                        textAlign = myAlign
                    )
                }
                Row(
                    modifier = Modifier.weight(0.33f),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = result5.toString(),
                        fontSize = myFontSize,
                        color = myColor,
                        modifier = Modifier.weight(myWeight),
                        textAlign = myAlign
                    )
                    Text(
                        text = result6.toString(),
                        fontSize = myFontSize,
                        color = myColor,
                        modifier = Modifier.weight(myWeight),
                        textAlign = myAlign
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.2f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    if(numberSidesInt < 2) numberSidesInt = 2
                    result1 = (1..numberSidesInt).random()
                    result2 = (1..numberSidesInt).random()
                    result3 = (1..numberSidesInt).random()
                    result4 = (1..numberSidesInt).random()
                    result5 = (1..numberSidesInt).random()
                    result6 = (1..numberSidesInt).random()
                },
                colors = ButtonDefaults.buttonColors(myTitleColor),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp, 0.dp)
            ) {
                Text(
                    stringResource(R.string.roll),
                    fontSize = 25.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DadosTheme {
        Screen()
    }
}