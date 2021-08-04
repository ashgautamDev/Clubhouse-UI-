package com.example.clubhouseuiclone.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clubhouseuiclone.component.BottomBar
import com.example.clubhouseuiclone.component.OnlineClubCard
import com.example.clubhouseuiclone.component.TopAppbar
import com.example.clubhouseuiclone.data.images
import com.example.clubhouseuiclone.model.LiveClub
import com.example.clubhouseuiclone.model.liveClubList
import com.example.clubhouseuiclone.ui.theme.AccentBrown

@Composable
fun HomeScreen() {

    Scaffold(modifier = Modifier
        .fillMaxSize()
        .background(color = AccentBrown),
        topBar = { TopAppbar() },
        bottomBar = { BottomBar() },
        content = { MainContent(liveClubList) }
    )

}

@Composable
fun MainContent(activeClubs: List<LiveClub> ) {

    LazyColumn(
        modifier = Modifier
            .background(color = AccentBrown)
            .padding(start = 16.dp ,end = 16.dp

            ),
    ) {
        items(activeClubs) {
            activeClubs.forEach {
                Spacer(modifier = Modifier.height(16.dp))
                OnlineClubCard(
                    clubName = it.clubName,
                    title = it.clubTitle,
                    modCount = it.modCount,
                    audienceCount = it.audCount,
                    images
                )
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}