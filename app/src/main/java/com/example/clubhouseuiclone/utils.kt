package com.example.clubhouseuiclone

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.google.accompanist.coil.rememberCoilPainter
import com.squareup.picasso.Picasso


@Composable
fun LoadingNetworkImage(url: String) {

    val painter = rememberCoilPainter(
        request = url
    )
    Image(painter = painter, contentDescription = "" , contentScale = ContentScale.Fit)
}