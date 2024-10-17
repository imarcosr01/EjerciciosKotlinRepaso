package com.prueba.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prueba.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BirthdayGreetingWithText(
                        message = stringResource(R.string.happy_birthday),
                        modifier = Modifier.padding(innerPadding),
                        from = stringResource(R.string.from_antonio),
                    )
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(
    message: String,
    from: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = message,
            modifier = modifier,
            fontSize = 36.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            text = from,
            modifier = modifier,
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
        )

        BirthdayGreetingWithImage("Holaaaa")
    }
}

@Composable
fun BirthdayGreetingWithImage(
    message: String,
    modifier: Modifier = Modifier,
) {
    Box {
        Image(
            painter = painterResource(id = R.drawable./),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier,
        )
        Text(
            text = message,
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(16.dp),

            )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithText("Hola", " Antonio Lulú")
    }
}