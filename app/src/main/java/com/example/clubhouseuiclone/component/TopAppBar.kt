package com.example.clubhouseuiclone.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clubhouseuiclone.LoadingNetworkImage
import com.example.clubhouseuiclone.R
import com.example.clubhouseuiclone.ui.theme.AccentBrown
import com.example.clubhouseuiclone.ui.theme.AccentGrey


@Composable
fun TopAppbar() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(color = AccentBrown)
        .padding(16.dp) ,
    horizontalArrangement = Arrangement.SpaceBetween) {
        Image(imageVector = Icons.Default.Search,modifier = Modifier.size(36.dp), contentDescription = null)
        Row( horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Image(painter = painterResource(id = R.drawable.ic_mailbox), contentDescription = null)
            Image(painter = painterResource(id = R.drawable.ic_calculator), contentDescription = null)
            Image(painter = painterResource(id = R.drawable.ic_bell), contentDescription = null)

            Box(
                modifier = Modifier
                    .background(
                        color = AccentGrey,
                        shape = RoundedCornerShape(40)
                    )
                    .height(32.dp)
                    .width(32.dp)
            ) {
LoadingNetworkImage(url = "https://userstock.io/photo/449")
            }
        }

    }
}

@Preview
@Composable
fun TopAppBarPreview() {
    TopAppbar()
}


