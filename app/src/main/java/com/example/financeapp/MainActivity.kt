package com.example.financeapp

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.financeapp.ui.theme.FinanceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinanceAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FinanceApp(innerPadding)
                }
            }
        }
    }
}

@Composable
fun FinanceApp(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ){
        //header
        Row() {
            Box(

            ) { }
            Column(

            ) { }
            Icon(
                imageVector = "",
                contentDescription = null,
                color = Color.Black
            )
        }
        // Summary Cards
        Row() {
            //aqui va la primera cards
            Column() {
                //aqui van las siguientes dos cards
            }
        }
        Row() {
            Text(
                text = "Transactions"
            )
            Text(
                text = "See All"
            )
        }
        LazyColumn() { }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FinanceAppTheme {
        FinanceApp(innerPadding = PaddingValues(top = 15.dp))
    }
}