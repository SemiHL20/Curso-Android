package com.example.compose_2nd_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_2nd_project.ui.theme.Compose_2nd_projectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_2nd_projectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TvShows()
                }
            }
        }
    }
}

@Composable
fun TvShows(modifier: Modifier = Modifier) {
    var screen by remember { mutableIntStateOf( 0) }

    val imageArray = arrayOf(R.drawable.futurama, R.drawable.simpsons, R.drawable.family_guy)
    val titleArray = arrayOf(R.string.futurama_title, R.string.simpsons_title, R.string.family_guy_title)
    val dataArray = arrayOf(R.string.futurama_data, R.string.simpsons_data, R.string.family_guy_data)

    val image = imageArray[screen]
    val title = titleArray[screen]
    val data = dataArray[screen]

    Column (
        modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ){
        Row(
            modifier.weight(0.6f),
            verticalAlignment = Alignment.Bottom
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp, 350.dp)
            )
        }
        Spacer(modifier = Modifier.size(16.dp))
        Row(modifier.weight(0.3f)) {
            Column(
                modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = title),
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp
                )
                Text(
                    text = stringResource(id = data)
                )
            }
        }
        Row(
            modifier
                .fillMaxWidth()
                .weight(0.1f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            Button(
                onClick = {
                    screen--
                    if (screen == -1){
                        screen = imageArray.size-1
                    }
                          },
                modifier
                    .padding(24.dp, 16.dp)
                    .size(130.dp, 40.dp)
            ) {
                Text(text = "Previous")
            }
            Button(
                onClick = {
                    screen++
                    if (screen == imageArray.size){
                        screen = 0
                    }
                          },
                modifier
                    .padding(24.dp, 16.dp)
                    .size(130.dp, 40.dp)
            ) {
                Text(text = "Next")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_2nd_projectTheme {
        TvShows()
    }
}