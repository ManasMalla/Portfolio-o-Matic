package com.manasmalla.portfolioomatic.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.manasmalla.portfolioomatic.R
import com.manasmalla.portfolioomatic.ui.theme.PortfolioOMaticTheme

@Composable
fun SplashScreen(){
    Surface(color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)) {
            Spacer(modifier = Modifier.weight(1f))
            Image(painterResource(id = R.drawable.portfolio_o_matic), contentDescription = "App Logo", modifier = Modifier.padding(horizontal = 48.dp))
            Spacer(modifier = Modifier.weight(1f))
            CreditsCard()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    PortfolioOMaticTheme {
        SplashScreen()
    }
}