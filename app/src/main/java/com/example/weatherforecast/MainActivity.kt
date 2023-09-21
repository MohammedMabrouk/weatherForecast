package com.example.weatherforecast

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.weatherforecast.ui.theme.DarkBlue
import com.example.weatherforecast.ui.theme.LightBlue
import com.example.weatherforecast.ui.theme.WeatherForecastTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherForecastTheme {
                HomeScreen()
            }
        }
    }
}

// todo: place colors and text in separate places

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        LightBlue,
                        DarkBlue
                    )
                )
            )
    ) {
        Text(
            text = "Hello!",
            fontSize = 16.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.White
        )
    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    WeatherForecastTheme {
        HomeScreen()
    }
}