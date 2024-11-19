package com.joey.composeapp.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joey.composeapp.data.entity.MatchData

@Composable
fun MatchColumn(matchData: MatchData, navigateToLive: ((matchId: Long, type: Int) -> Unit)?) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        onClick = {
            navigateToLive?.let { it(matchData.id, matchData.type) }
        }
    ) {
        Box(modifier = Modifier.padding(8.dp)) {
            Column {
                Text(text = "${matchData.awayTeamName} VS ${matchData.homeTeamName}")
                Text(text = "type=${matchData.type}")
                Text(text = "id=${matchData.id}")
                Text(text = "statusUpName=${matchData.statusUpName}")
            }
        }
    }
}

@Preview
@Composable
private fun MatchColumnPreview() {
    val matchData = MatchData(
        id = 1,
        awayTeamName = "韩国U20",
        homeTeamName = "丹麦U20",
        type = 1,
        awayTeamLogo = "",
        homeTeamLogo = "",
        awayScores = listOf(1, 2, 3),
        homeScores = listOf(4, 5, 6),
        awayTeamRed = 1,
        homeTeamRed = 2,
        awayTeamId = 1,
        homeTeamId = 2,
        status = 1,
        liveUrls = emptyList(),
        globalLiveUrls = emptyList(),
        mirrorLiveUrls = emptyList(),
        cornerKick = "",
        curRound = 1,
        clogo = "",
        cid = 1,
        matchTime = "2022-06-01 12:00:00",
        matchTimeEn = "2022-06-01 12:00:00",
        name = "",
        isZd = "",
        statusUp = 1,
        score = "",
        statusUpName = "",
        time = "",
        videoUrl = ""
    )
    MatchColumn(matchData, null)
}