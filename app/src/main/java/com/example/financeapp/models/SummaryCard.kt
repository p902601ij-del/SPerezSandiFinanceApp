package com.example.financeapp.models

import androidx.compose.ui.graphics.Color
import com.example.financeapp.ui.theme.CardActivity
import com.example.financeapp.ui.theme.CardEarnings
import com.example.financeapp.ui.theme.CardSales

data class SummaryCard(
    val title: String,
    val amount: Double,
    val backgroundColor: Color
) {
    companion object {
        val defaultCards = listOf(
            SummaryCard(
                title = "Actividad",
                amount = 280.99,
                backgroundColor = CardActivity
            ),
            SummaryCard(
                title = "Ventas",
                amount = 280.99,
                backgroundColor = CardSales
            ),
            SummaryCard(
                title = "Ganancias",
                amount = 280.99,
                backgroundColor = CardEarnings
            )
        )
    }
}
