package com.manasmalla.portfolioomatic.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manasmalla.portfolioomatic.R
import com.manasmalla.portfolioomatic.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PortfolioScreen(
    name: String = "",
    age: String,
    emailAddress: String = "",
    websiteURL: String = "",
    isStudent: Boolean = false,
    projectsCompleted: String = "",
    awards: String = "",
    experience: String = "",
    bio: String = ""
) {
    Scaffold(floatingActionButton = {
        FloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Outlined.Share, contentDescription = "Share your Portfolio")
        }
    }, topBar = {
        SmallTopAppBar(
            navigationIcon = {
                Icon(Icons.Rounded.ArrowBack, contentDescription = "Back")
            },
            title = {},
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Transparent)
        )
    }, containerColor = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .padding(it)
        ) {
            Column(
                modifier = Modifier.padding(horizontal = 24.dp),
                verticalArrangement = Arrangement.spacedBy(18.dp)
            ) {
                Column {
                    Text(
                        text = "Hi! I'm",
                        style = MaterialTheme.typography.titleLarge,
                        color = Green40
                    )
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Column {
                            Text(
                                text = name,
                                style = MaterialTheme.typography.headlineLarge,
                                color = Orange
                            )
                            Row {
                                Text(
                                    text = "Developer",
                                    style = MaterialTheme.typography.titleLarge,
                                    color = Blue
                                )
                                if (isStudent) {
                                    Text(
                                        text = "  |  ",
                                        style = MaterialTheme.typography.titleLarge,
                                        color = Blue.copy(alpha = 0.5f)
                                    )
                                    Text(
                                        text = "Student",
                                        style = MaterialTheme.typography.titleLarge,
                                        color = Blue
                                    )
                                }
                            }
                        }
                        Spacer(modifier = Modifier.width(28.dp))
                        Image(
                            painter = painterResource(id = R.drawable.manas_malla),
                            contentDescription = "User's Picture",
                            modifier = Modifier
                                .size(64.dp)
                                .clip(
                                    CircleShape
                                )
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = bio, style = MaterialTheme.typography.bodyMedium)
                }
                Text(
                    text = websiteURL, style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )
                Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                    CategoryCard(title = "Projects", value = projectsCompleted)
                    CategoryCard(title = "Awards", value = awards)
                    CategoryCard(title = "Experience", value = experience)

                }
                Surface(
                    color = Orange,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                            .padding(12.dp)
                    ) {
                        Text(
                            text = "You can contact me at",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Normal,
                            color = Color.White
                        )
                        Text(
                            text = emailAddress,
                            style = MaterialTheme.typography.titleLarge,

                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            Box {
                Row {
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = age,
                        style = MaterialTheme.typography.displayLarge.copy(
                            fontSize = 180.sp,
                            lineHeight = 40.sp
                        ),
                        color = Green15
                    )

                    Spacer(modifier = Modifier.width(16.dp))
                }
                Row(verticalAlignment = Alignment.Bottom) {
                    Image(
                        painter = painterResource(id = R.drawable.android_robot),
                        contentDescription = "Android Robot",
                        modifier = Modifier.width(100.dp)
                    )

                    Spacer(modifier = Modifier.weight(1f))
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Made with ❤️ in India", style = MaterialTheme.typography.titleLarge, color = Green40)
                        Text(text = "2022 © Manas Malla", style = MaterialTheme.typography.titleLarge, color = Green40.copy(alpha = 0.4f))
                    }

                    Spacer(modifier = Modifier.weight(3f))
                }
            }
        }
    }
}

@Composable
fun RowScope.CategoryCard(title: String, value: String) {
    Surface(
        color = Green15, modifier = Modifier
            .weight(1f)
            .height(120.dp), shape = RoundedCornerShape(16)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(8.dp),
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(text = value, style = MaterialTheme.typography.displayLarge, color = Green40)
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = title,
                style = if (title.length >= 10) MaterialTheme.typography.titleLarge.copy(fontSize = 16.sp) else MaterialTheme.typography.titleMedium,
                color = Green70,
            )
        }
    }
}

@Preview
@Composable
fun PortfolioScreenPreview() {
    PortfolioOMaticTheme(dynamicColor = false) {
        PortfolioScreen(
            name = "Manas Malla",
            age = "17",
            emailAddress = "manasmalla.dev@gmail.com",
            websiteURL = "manasmalla.github.io",
            isStudent = true,
            projectsCompleted = "8",
            awards = "12",
            experience = "9",
            bio = "Android Study Jams Facilitator\nLife’s too short & beautiful! Let’s keep making miracles & Enjoy what life throws at us with an enthusiastic spirit & a bright smile!"
        )
    }
}