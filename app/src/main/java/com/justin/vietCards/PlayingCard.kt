package com.justin.vietCards

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview
@Composable
fun PreviewPlayingCard() {
    PlayingCard(rank = "K")
}

@Composable
fun PlayingCard(
    modifier: Modifier = Modifier,
    rank: String
) {
    Card(
        modifier = modifier.size(
            width = 95.dp,
            height = 133.dp
        ),
        shape = RoundedCornerShape(size = 5.dp),
        backgroundColor = Color.White,
        elevation = 5.dp
    ) {
        ConstraintLayout {
            val (rankAndSuitLeft, rankAndSuitRight, suitInCenter) = createRefs()

            RankAndSuit(
                rank = rank,
                suitDrawable = R.drawable.baseline_heart_broken_24,
                modifier = Modifier.constrainAs(rankAndSuitLeft) {
                    start.linkTo(
                        anchor = parent.start,
                        margin = RANK_AND_SUIT_MARGIN_HORIZONTAL
                    )
                    top.linkTo(
                        anchor = parent.top,
                        margin = RANK_AND_SUIT_MARGIN_VERTICAL
                    )
                }
            )

            RankAndSuit(
                rank = rank,
                suitDrawable = R.drawable.baseline_heart_broken_24,
                modifier = Modifier.constrainAs(rankAndSuitRight) {
                    end.linkTo(
                        anchor = parent.end,
                        margin = RANK_AND_SUIT_MARGIN_HORIZONTAL
                    )
                    bottom.linkTo(
                        anchor = parent.bottom,
                        margin = RANK_AND_SUIT_MARGIN_VERTICAL
                    )
                }
            )

            Icon(
                painter = painterResource(R.drawable.baseline_heart_broken_24),
                contentDescription = null,
                modifier = Modifier.constrainAs(suitInCenter) {
                    centerTo(parent)
                }
            )
        }
    }
}

@Composable
private fun RankAndSuit(
    rank: String,
    @DrawableRes
    suitDrawable: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = rank,
            fontSize = 20.sp
        )

        Icon(
            painter = painterResource(suitDrawable),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 3.dp)
                .width(15.dp)
                .height(15.dp)
        )
    }
}

private val RANK_AND_SUIT_MARGIN_HORIZONTAL = 3.dp
private val RANK_AND_SUIT_MARGIN_VERTICAL = 3.dp