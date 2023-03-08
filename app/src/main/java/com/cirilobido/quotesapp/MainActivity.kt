package com.cirilobido.quotesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cirilobido.quotesapp.ui.theme.Poppins
import com.cirilobido.quotesapp.ui.theme.QuotesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuotesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Header()
                }
            }
        }
    }
}

@Composable
fun Header() {
    Column(
        modifier = Modifier
            .padding(vertical = 40.dp, horizontal = 20.dp)
    ) {
        Text(
            "Quotes",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 2.dp),
            style = TextStyle(
                fontFamily = Poppins,
                fontWeight = FontWeight.Medium,
                fontSize = 28.sp,
                color = Color(0XFF4d5489),
            )
        )
        Text(
            "Las mejores citas",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 2.dp),
            style = TextStyle(
                fontFamily = Poppins,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                color = Color(0XFF4d5489),
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    QuotesAppTheme {
        Header()
    }
}