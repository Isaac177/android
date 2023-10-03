package com.example.composequadrant

import android.os.Bundle
import android.widget.GridLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeGridLayout()
                }
            }
        }
    }
}

@Composable
fun FirstComponent(title: String, description: String, modifier: Modifier) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color(0xFFEADDFF)),
        ) {
            Text(
                text = title,
                modifier = modifier
            )
            Text(
                text = description,
                modifier = modifier
            )
        }
}

@Composable
fun SecondComponent(title: String, description: String, modifier: Modifier) {
        Column (
            modifier = Modifier
                .fillMaxHeight()
                .background(Color(0xFFD0BCFF)),
        ){
            Text(
                text = title,
                modifier = modifier
            )

            Text(
                text = description,
                modifier = modifier
            )
        }
}


@Composable
fun ThirdComponent(title: String, description: String, modifier: Modifier) {
        Column (
            modifier = Modifier
                .fillMaxHeight()
                .background(Color(0xFFD0BCFF)),
        ){
            Text(
                text = title,
                modifier = modifier
            )

            Text(
                text = description,
                modifier = modifier
            )
        }
}

@Composable
fun FourthComponent(title: String, description: String, modifier: Modifier) {
        Column (
            modifier = Modifier
                .fillMaxHeight()
                .background(Color(0xFFEADDFF)),
        ){
            Text(
                text = title,
                modifier = modifier
            )

            Text(
                text = description,
                modifier = modifier
            )
        }
}

@Composable
fun ComposeGridLayout() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            FirstComponent(
                title = "First Title",
                description = "First Description",
                modifier = Modifier.width(200.dp)
            )
            SecondComponent(
                title = "Second Title",
                description = "Second Description",
                // width of half of the screen
                modifier = Modifier.width(200.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            ThirdComponent(
                title = "Third Title",
                description = "Third Description",
                modifier = Modifier.weight(1f)
            )
            FourthComponent(
                title = "Fourth Title",
                description = "Fourth Description",
                modifier = Modifier.weight(1f)
            )
        }
    }
}


