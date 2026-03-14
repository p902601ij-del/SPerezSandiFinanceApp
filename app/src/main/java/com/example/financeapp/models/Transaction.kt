package com.example.financeapp.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.Fastfood
import androidx.compose.material.icons.filled.LocalDining
import androidx.compose.material.icons.filled.Devices
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

data class Transaction(
    val title: String,
    val category: String,
    val amount: Double,
    val time: String,
    val icon: ImageVector
) {
    companion object {
        val defaultTransactions = listOf(
            Transaction(
                title = "Walmart",
                category = "Groceries",
                amount = -85.50,
                time = "10:30 AM",
                icon = Icons.Default.ShoppingCart
            ),
            Transaction(
                title = "Shell Station",
                category = "Fuel",
                amount = -50.00,
                time = "12:15 PM",
                icon = Icons.Default.DirectionsCar
            ),
            Transaction(
                title = "Starbucks",
                category = "Food & Drinks",
                amount = -12.75,
                time = "08:45 AM",
                icon = Icons.Default.Fastfood
            ),
            Transaction(
                title = "Apple Store",
                category = "Electronics",
                amount = -1299.00,
                time = "03:20 PM",
                icon = Icons.Default.Devices
            ),
            Transaction(
                title = "Barnes & Noble",
                category = "Books",
                amount = -35.20,
                time = "05:10 PM",
                icon = Icons.Default.Book
            ),
            Transaction(
                title = "The Italian Place",
                category = "Dining",
                amount = -120.00,
                time = "08:30 PM",
                icon = Icons.Default.LocalDining
            ),
            Transaction(
                title = "Amazon Refund",
                category = "Electronics",
                amount = 45.99,
                time = "11:00 AM",
                icon = Icons.Default.Devices
            ),
            Transaction(
                title = "Whole Foods",
                category = "Groceries",
                amount = -110.25,
                time = "04:45 PM",
                icon = Icons.Default.ShoppingCart
            ),
            Transaction(
                title = "Burger King",
                category = "Food & Drinks",
                amount = -15.50,
                time = "01:30 PM",
                icon = Icons.Default.Fastfood
            ),
            Transaction(
                title = "Gas Express",
                category = "Fuel",
                amount = -45.00,
                time = "07:20 AM",
                icon = Icons.Default.DirectionsCar
            ),
            Transaction(
                title = "Best Buy",
                category = "Electronics",
                amount = -250.00,
                time = "02:15 PM",
                icon = Icons.Default.Devices
            ),
            Transaction(
                title = "Library Cafe",
                category = "Dining",
                amount = -8.50,
                time = "10:00 AM",
                icon = Icons.Default.LocalDining
            )
        )
    }
}
