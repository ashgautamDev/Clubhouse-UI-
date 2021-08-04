package com.example.clubhouseuiclone.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clubhouseuiclone.LoadingNetworkImage
import com.example.clubhouseuiclone.ui.theme.AccentGrey
import com.example.clubhouseuiclone.ui.theme.ClubhouseUiCloneTheme
import com.example.clubhouseuiclone.ui.theme.LightGrey

@Composable
fun BoxScope.DpPlaceholder(firstLetter: Char, secondLetter: Char, aligment: Alignment , dpUrl : String) {
    Box(
        modifier = Modifier
            .background(
                color = LightGrey,
                shape = RoundedCornerShape(42)
            )
            .height(40.dp)
            .width(40.dp)
            .align(aligment),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "$firstLetter$secondLetter",
            style = MaterialTheme.typography.body1
        )
        LoadingNetworkImage(url = dpUrl)
    }
}


@Preview
@Composable
fun DpCardPreview() {
    ClubhouseUiCloneTheme {
    }

}