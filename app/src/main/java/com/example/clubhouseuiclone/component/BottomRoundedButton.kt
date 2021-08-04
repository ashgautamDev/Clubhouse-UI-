package com.example.clubhouseuiclone.component

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clubhouseuiclone.ui.theme.AccentGreen


@Composable
fun RoundedButton(onClick: () -> Unit) {

    Row(horizontalArrangement = Arrangement.Center) {
        Button(
            modifier = Modifier.wrapContentWidth(),
            onClick = onClick,
            shape = RoundedCornerShape(24.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = AccentGreen, contentColor = Color.White
            ),
            elevation = ButtonDefaults.elevation(6.dp, 8.dp) ,
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "")
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Start Room",
                style = MaterialTheme.typography.h6
            )

        }

    }
}

@Preview
@Composable
fun ButtomPreview() {
    RoundedButton {

    }
}