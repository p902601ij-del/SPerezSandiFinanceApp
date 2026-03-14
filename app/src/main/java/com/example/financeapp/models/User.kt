package com.example.financeapp.models

data class User(
    val name: String,
    val currentBalance: Double
) {
    companion object {
        val juan = User(
            name = "Juan",
            currentBalance = 280.99
        )
    }
}
