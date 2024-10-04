package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Text(text = "Hello Compose Text")
        }
    }
}

@Preview(showBackground = true, name = "First Preview ", heightDp = 20, widthDp = 80)
@Composable
fun ShowText(name: String = "Sarfraz") {
    Text(
        text = "Hello $name",
        fontStyle = FontStyle.Italic,
        fontSize = 12.sp,
        fontWeight = FontWeight.ExtraBold,
        color = Color.Blue

    )
}

@Preview(showBackground = true, name = "Second Preview")
@Composable
private fun ShowAnotherText(name: String = "Compose Tutorila") {
    Text(
        text = "Hello $name",
        fontStyle = FontStyle.Italic,
        fontSize = 12.sp,
        fontWeight = FontWeight.ExtraBold,
        color = Color.Magenta

    )
}
@Preview
@Composable
private fun EnableButton() {
   Button(onClick = { }) {
       Text(text = "Click")
   }
}

@Preview
@Composable
private fun EnableButton2() {
    Button(onClick = { }) {
        Text(text = "Click")
    }
}
