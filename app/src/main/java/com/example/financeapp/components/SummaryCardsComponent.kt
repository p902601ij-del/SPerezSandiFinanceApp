package com.example.financeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.SentimentSatisfied
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.financeapp.models.SummaryCard
import com.example.financeapp.ui.theme.IconBackground
import com.example.financeapp.ui.theme.TextPrimary
import com.example.financeapp.ui.theme.TextSecondary

@Composable
fun SummaryCardComponent() {
    val cards = SummaryCard.defaultCards

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(300.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        //Card de la izquierda
        Column(
            modifier = Modifier
                .weight(1f)
                .height(300.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(cards[0].backgroundColor)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically)
        ) {
            Icon(
                imageVector = Icons.Default.SentimentSatisfied,
                contentDescription = null,
                modifier = Modifier.size(40.dp),
                tint = IconBackground
            )
            Text(
                text = cards[0].title,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = TextPrimary
            )
            Text(
                text = "de la Semana",
                fontSize = 12.sp,
                color = TextSecondary
            )
        }

        // las cards de la derecha
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(145.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(cards[1].backgroundColor)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically)
            ) {
                Text(
                    text = cards[1].title,
                    fontSize = 14.sp,
                    color = TextSecondary
                )
                Text(
                    text = "$${cards[1].amount}",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )
            }


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(145.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(cards[2].backgroundColor)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically)
            ) {
                Text(
                    text = cards[2].title,
                    fontSize = 14.sp,
                    color = TextSecondary
                )
                Text(
                    text = "$${cards[2].amount}",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )
            }
        }
    }
}
