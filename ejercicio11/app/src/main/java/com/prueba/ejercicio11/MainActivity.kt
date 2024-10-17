package com.prueba.ejercicio11

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    TutorialScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }



@Composable
fun TutorialScreen(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize() // La columna ocupa todo el espacio disponible
            .verticalScroll(rememberScrollState())
    ) {

        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = "Jetpack Compose tutorial image",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp),
            contentScale = ContentScale.Crop
        )


        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp),
            style = MaterialTheme.typography.bodyLarge
        )


        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.", // Descripción
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
            style = MaterialTheme.typography.bodyMedium
        )


        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.", // Explicación
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}


