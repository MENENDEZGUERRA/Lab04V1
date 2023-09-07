package com.example.lab04v1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab04v1.ui.theme.Lab04V1Theme


class InfoMatch : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab04V1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MySpace()
                }
            }
        }
    }
}
@Composable
fun MyMatchInfo(){
    Column() {
        Image(
            painter = painterResource(id = R.drawable.pt_1),
            contentDescription = "Match-1",
            modifier = Modifier
                .width(500.dp)
                .height(500.dp)
        )
        Text(text = "Match name", fontSize = 40.sp)
        Text(text = "Match information", fontSize = 20.sp, modifier = Modifier.fillMaxSize())

    }
}

@Preview
@Composable
fun InfoMatchPreview() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray)) {
        Column {
            MyHeader()
            MyMatchInfo()
        }

    }
}