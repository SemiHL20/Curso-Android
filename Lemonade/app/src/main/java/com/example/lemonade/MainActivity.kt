package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LemonApp()
                }
            }
        }
    }
}

@Composable
fun LemonApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        var taps = (2..4).random()
        var count by remember { mutableIntStateOf(1) }
        val imageResource = when(count) {
            1 -> R.drawable.lemon_tree
            2 -> R.drawable.lemon_squeeze
            3 -> R.drawable.lemon_drink
            else -> R.drawable.lemon_restart
        }
        val contentDescResource = when(count) {
            1 -> R.string.lemon_tree
            2 -> R.string.lemon
            3 -> R.string.glass_lemonade
            else -> R.string.empty_glass
        }
        val screenText = when(count) {
            1 -> R.string.lemon_tree_text
            2 -> R.string.lemon_text
            3 -> R.string.lemonade_text
            else -> R.string.empty_glass_text
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            Arrangement.Center,
            Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(imageResource),
                contentDescription = stringResource(contentDescResource),
                Modifier
                    .background(
                        Color(190, 230, 190),
                        shape = RoundedCornerShape(20.dp)
                    )
                    .clickable(
                    onClick = {
                        if(count == 2){
                            taps--
                            if(taps == 0){
                                count++
                            }
                        } else if(count == 4) {
                            count = 1
                        } else {
                            count++
                        }
                    }
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(screenText),
                fontSize = 18.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LemonadePreview() {
    LemonadeTheme {
        LemonApp()
    }
}