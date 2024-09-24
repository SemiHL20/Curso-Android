package com.example.yoga30days

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.yoga30days.data.Yoga
import com.example.yoga30days.data.yogaList
import com.example.yoga30days.ui.theme.Yoga30DaysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Yoga30DaysTheme {
                YogaApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YogaApp() {
    Scaffold (
        topBar = { TopAppBar() }
            ){ contentPadding ->
        LazyColumn(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .padding(contentPadding)
        ){
            items(yogaList){
                YogaCard(yoga = it)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun YogaCard(yoga: Yoga, modifier: Modifier = Modifier){
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.surface)
    ) {
        Column (
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioLowBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
                .fillMaxWidth()
        ){
            Text(
                text = stringResource(yoga.asanaName),
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(start = 8.dp)
            )
            Image(
                painter = painterResource(yoga.asanaImg),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.align(CenterHorizontally)
            )
            Row() {
                Text(
                    text = stringResource(yoga.yogaDay),
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(start = 8.dp)
                )
                Spacer(modifier = Modifier.weight(1f))
                ExpandIcon(
                    expanded = expanded,
                    onClick = { expanded = !expanded }
                )
            }
            if (expanded){
                ShowExpanded(yoga.asanaDesc, yoga.asanaBenef, yoga.asanaNotFor)
            }
        }
    }
}

@Composable
private fun ExpandIcon(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    IconButton(onClick = onClick) {
        Icon(
            imageVector = if (expanded) Icons.Filled.KeyboardArrowUp
                else Icons.Filled.KeyboardArrowDown,
            tint = MaterialTheme.colorScheme.onSurface,
            contentDescription = stringResource(R.string.expand_button_content_description)
        )
    }
}

@Composable
private fun ShowExpanded(
    @StringRes yogaDesc: Int,
    @StringRes yogaBenef: Int,
    @StringRes yogaNot: Int,
    modifier: Modifier = Modifier
){
    Column (
        modifier = modifier.padding(8.dp)
            ){
        Text(
            text = stringResource(R.string.description),
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = stringResource(yogaDesc),
            style = MaterialTheme.typography.bodyMedium,
            modifier = modifier.padding(bottom = 8.dp)
        )
        Text(
            text = stringResource(R.string.benefits),
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = stringResource(yogaBenef),
            style = MaterialTheme.typography.bodyMedium,
            modifier = modifier.padding(bottom = 8.dp)
        )
        Text(
            text = stringResource(R.string.notfor),
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = stringResource(yogaNot),
            style = MaterialTheme.typography.bodyMedium,
            modifier = modifier.padding(bottom = 8.dp)
        )
    }
}

@Composable
private fun TopAppBar(modifier: Modifier = Modifier){
    Row (
        modifier = modifier
            .background(color = MaterialTheme.colorScheme.secondary)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(
            painter = painterResource(R.drawable.lotus_flower),
            contentDescription = null,
            modifier = Modifier
                .size(64.dp)
                .padding(8.dp)
        )
        Text(
            text = stringResource(R.string.title),
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center
        )
        Image(
            painter = painterResource(R.drawable.lotus_flower),
            contentDescription = null,
            modifier = Modifier
                .size(64.dp)
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Yoga30DaysTheme(darkTheme = false) {
        YogaApp()
    }
}