package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NotificationView(
                        notificationText = stringResource(id = R.string.notificationText),
                        notificationSubtext = stringResource(id = R.string.notificationSubtext)
                    )
                }
            }
        }
    }
}

@Composable
fun ComponentLayout(notificationText: String, modifier: Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp),
        modifier = modifier
    ){
        Image(
            painter = painterResource(id = R.drawable.manager),
            contentDescription = null
        )
        Text(
            text = notificationText,
            modifier = modifier,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
            fontSize = 24.sp,
        )
    }
}

@Composable
fun NotificationSub(notificationSubtext: String, modifier: Modifier) {
    Text(
        text = notificationSubtext,
        modifier = modifier,
        color = MaterialTheme.colorScheme.onBackground,
        textAlign = TextAlign.Center,
        fontSize = 16.sp,
    )
}

@Composable
fun NotificationView(
    notificationText: String,
    notificationSubtext: String,
    modifier: Modifier = Modifier)
    {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ){
            ComponentLayout(
                notificationText = notificationText,
                modifier = modifier,
            )
            Spacer(modifier = Modifier.height(8.dp))
            NotificationSub(
                notificationSubtext = notificationSubtext,
                modifier = modifier,
            )
        }
}

