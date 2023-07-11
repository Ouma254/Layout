package com.deknowh.rowlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.deknowh.rowlayout.ui.theme.RowLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   Layout()
                }
            }
        }
    }
}

@Composable
fun Layout() {
   Column(
       modifier = Modifier
           .fillMaxSize()
           .padding(10.dp)
   ) {
        Image(
            painter = painterResource(id = R.drawable.mercedes),
            contentDescription = null
        )
       Row(
           modifier = Modifier
               .padding(1.dp)
               .fillMaxWidth(),
           horizontalArrangement = Arrangement.SpaceBetween
       ) {
           Text(
               text = "Mercedes Car",
               fontWeight = FontWeight.Bold,
           )
           Spacer(
               modifier = Modifier
                   .padding(8.16.dp)
           )
           Text(
               text = "Ksh. 3.5M",
               color = Color.Green
           )
       }
       Text(
           text = "Latest Version of the vehicle", color = Color.Blue
       )

    }

}