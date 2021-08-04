package com.example.clubhouseuiclone.component


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.People
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clubhouseuiclone.R
import com.example.clubhouseuiclone.data.nameList
import com.example.clubhouseuiclone.ui.theme.AccentGrey
import com.example.clubhouseuiclone.ui.theme.ClubhouseUiCloneTheme


@Composable
fun OnlineClubCard(
    clubName: String,
    title: String,
    modCount: Int,
    audienceCount: Int,
    imageList: List<String>
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(6.dp, shape = RoundedCornerShape(12.dp))
            .background(color = Color.White)
            .padding(start = 16.dp, top = 16.dp, bottom = 16.dp, end = 26.dp)


    ) {
        ClubName(clubName)
        Spacer(modifier = Modifier.height(6.dp))
        Text(text = title, style = MaterialTheme.typography.body2)
        Spacer(modifier = Modifier.height(8.dp))
        ModeDisplay(nameList, imageList, audienceCount, modCount)

    }

}

@Composable
fun ModeDisplay(names: List<String>, imageList: List<String>, modCount: Int, audienceCount: Int) {

    Row {
        ModeratorsDp(imageList = imageList)
        Spacer(modifier = Modifier.width(16.dp))
        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
          NameCard(name = "Leah Chatman")
          NameCard(name = "Meisa Swan")
          NameCard(name = "Veeti Seppanen")
          NameCard(name = "Matalia Sanz")

            ModeratorInfo(modCount, audienceCount) {}
        }
    }


}


@Composable
fun ModeratorInfo(modCount: Int, audienceCount: Int, content: @Composable () -> Unit) {
    val modCount = modCount.toString()
    val audienceCount = audienceCount.toString()

    Row(modifier = Modifier.wrapContentWidth(), verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = audienceCount,
            style = MaterialTheme.typography.h6,
            color = AccentGrey
        )
        Spacer(modifier = Modifier.width(6.dp))
        Icon(imageVector = Icons.Default.People, contentDescription = null ,
            modifier = Modifier.size(16.dp))
        Text(text = " / $modCount", style = MaterialTheme.typography.h6, color = AccentGrey)
        Spacer(modifier = Modifier.width(6.dp))
        Icon(painter = painterResource(id = R.drawable.ic_message__fill), contentDescription = null)

    }
}

@Composable
fun NameCard(name: String) {
    Row(verticalAlignment = Alignment.CenterVertically ) {
        Text(text = name, style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.width(6.dp))
        Icon(painter = painterResource(id = R.drawable.ic_message__empty), contentDescription = "")


    }
}

@Composable
fun ModeratorsDp(imageList: List<String>) {
    val letter = ('A'..'Z').shuffled()
    val fLetterDp1 = letter[0]
    val sLetterDp1 = letter[11]
    val fLetterDp2 = letter[6]
    val sLetterDp2 = letter[14]

    imageList.shuffled()
    val dp1 = imageList.take(1)
    val dp2 = imageList.take(1)

    Box(
        Modifier
            .width(65.dp)
            .height(55.dp)
            .background(color = Color.White)
    ) {
        DpPlaceholder(
            firstLetter = fLetterDp1,
            secondLetter = sLetterDp1,
            aligment = Alignment.TopStart ,
            dp1.toString()
        )
        DpPlaceholder(
            firstLetter = fLetterDp2,
            secondLetter = sLetterDp2,
            aligment = Alignment.BottomEnd ,
            dp2.toString()
        )


    }
}


@Composable
fun ClubName(clubName: String) {

    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = clubName.uppercase(),
            style = MaterialTheme.typography.overline
        )
        Spacer(modifier = Modifier.height(6.dp))
        Icon(painter = painterResource(R.drawable.ic_home_12px), contentDescription = "")

    }

}

@Composable
@Preview
fun CardPreview() {
    ClubhouseUiCloneTheme {

    }
}
