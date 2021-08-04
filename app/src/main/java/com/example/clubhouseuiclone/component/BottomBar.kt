package com.example.clubhouseuiclone.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clubhouseuiclone.R

@Composable
fun BottomBar() {

    Row(
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth()
            .background(Brush.verticalGradient(
                listOf(Color.Transparent, Color.White),
                0f ,
                300f
            )),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Top
    ) {
        Spacer(modifier = Modifier.width(30.dp))
        RoundedButton(onClick = {})
        Image(
            painter = painterResource(id = R.drawable.ic_slider_menu),
            contentDescription = "",
            modifier = Modifier.padding(end = 32.dp)
        )


    }
}

@Preview
@Composable
fun BottomBarP() {
    BottomBar()
}