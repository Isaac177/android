package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.magnifier
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), 
                    color = MaterialTheme.colorScheme.background) {
                    ComposeArticleView(
                        title = stringResource(id = R.string.article_title),
                        firstParagraph = stringResource(id = R.string.first_paragraph),
                        secondParagraph = stringResource(id = R.string.second_paragraph),
                        firstParagraphModifier = Modifier.padding(16.dp),
                        secondParagraphModifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun FirstParagraph(firstParagraph: String, modifier: Modifier) {
    Box {
        Text(
            text = firstParagraph,
            modifier = modifier,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun ArticleTitle(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        modifier = Modifier.padding(16.dp),
        fontSize = 24.sp,
        textAlign = TextAlign.Start,
    )
}

@Composable
fun SecondParagraph(secondParagraph: String, modifier: Modifier) {
    Text(
        text = secondParagraph,
        modifier = modifier,
        color = MaterialTheme.colorScheme.onBackground,
        textAlign = TextAlign.Justify,
    )
}

@Composable
fun ArticleImage() {
    Image(
        painter = painterResource(id = R.drawable.bg_compose_background),
        contentDescription = null,
    )
}

@Composable
fun ComposeArticleView(
    title: String,
    firstParagraph: String,
    secondParagraph: String,
    firstParagraphModifier: Modifier,
    secondParagraphModifier: Modifier
) {
    Column {
        ArticleImage()
        ArticleTitle(title = title, modifier = Modifier.padding(16.dp))
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FirstParagraph(firstParagraph = firstParagraph, modifier = firstParagraphModifier)
        SecondParagraph(secondParagraph = secondParagraph, modifier = secondParagraphModifier)
    }
}