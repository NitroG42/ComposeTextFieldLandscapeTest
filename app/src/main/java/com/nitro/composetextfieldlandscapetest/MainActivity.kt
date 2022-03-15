package com.nitro.composetextfieldlandscapetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.nitro.composetextfieldlandscapetest.ui.theme.ComposeTextFieldLandscapeTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTextFieldLandscapeTestTheme {
                Screen()
            }
        }
    }
}

@Composable
private fun Screen() {
    var textValue by remember {
        mutableStateOf("")
    }
    Surface(Modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "Title",
                style = MaterialTheme.typography.h4,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.3f)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Text\nTwo line",
                style = MaterialTheme.typography.body2,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.2f)
            )
            Spacer(modifier = Modifier.height(16.dp))
            TextField(
                textStyle = MaterialTheme.typography.body2,
                value = textValue,
                onValueChange = {
                    textValue = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Blue,
                    textColor = MaterialTheme.colors.onSurface,
                    focusedIndicatorColor = MaterialTheme.colors.onSurface,
                    unfocusedIndicatorColor = Color.Transparent,
                    cursorColor = MaterialTheme.colors.onSurface
                )
            )
        }
    }
}