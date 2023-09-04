package com.example.lab04v1

import android.graphics.drawable.VectorDrawable
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
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
import com.example.lab04v1.ui.theme.Lab04V1Theme


@Composable
fun MyHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Red)
            .padding(10.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Todo eventos+", fontSize = 30.sp, textAlign = TextAlign.Center)
            Image(
                painter = painterResource(id = R.drawable.app_menu_icon),
                contentDescription = "algo",
                modifier = Modifier.size(50.dp)
            )
        }


    }
}

@Composable
fun MyFavorites() {
    Column() {
        Text(text = "Your favorites")
        Box(
            modifier = Modifier
                .background(Color.Gray)
                .fillMaxWidth()
                .height(375.dp)
        ) {

            Row(modifier = Modifier) {
                MyMatchCard()
                MyMatchCard()
            }
        }
    }
}

@Composable
fun MyMatchCard(){
    //Card 1
    Box(
        modifier = Modifier
            .size(150.dp, 200.dp)
            .background(Color.Green)
    ) {
        Column() {
            Image(
                painter = painterResource(id = R.drawable.pt_1),
                contentDescription = "Match-1",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            Text(text = "Title")
            Text(text = "Description")
        }

    }
}

@Preview
@Composable
fun MySpace() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column() {
            MyHeader()
            MyFavorites()
        }

    }
}
