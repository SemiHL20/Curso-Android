package com.example.heroes

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.heroes.model.Hero
import com.example.heroes.model.heroes
import com.example.heroes.ui.theme.HeroesTheme
import com.example.heroes.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeroesTheme {
                HeroesApp()
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeroesApp(){
    Scaffold(
        topBar = { HeroesTopAppBar() }
    ){ contentPadding ->
        LazyColumn(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .padding(contentPadding)
        ){
            items(heroes){
                HeroCard(hero = it)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun HeroCard(hero: Hero, modifier: Modifier = Modifier){
    Card (
        modifier = modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.surface)
    ){
        Row (modifier = Modifier.padding(16.dp, 12.dp)){
            Column (modifier = Modifier.weight(2f)){
                Text(
                    text = stringResource(hero.nameRes),
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text = stringResource(hero.descriptionRes),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.weight(0.5f))
            Image(
                painter = painterResource(hero.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .clip(shape = Shapes.small)
                    .weight(1f),
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Composable
fun HeroesTopAppBar(modifier: Modifier = Modifier){
    Row(
        modifier = modifier
            .height(56.dp)
            .background(MaterialTheme.colorScheme.background)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Superheroes",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.fillMaxWidth(),
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HeroesTheme (darkTheme = true){
        HeroesApp()
    }
}