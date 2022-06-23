package com.manasmalla.portfolioomatic.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material.icons.rounded.CameraAlt
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manasmalla.portfolioomatic.ui.theme.*

@Composable
fun InformationScreen(
    name: String = "",
    dateOfBirth: String = "",
    emailAddress: String = "",
    websiteURL: String = "",
    projectsCompleted: String = "",
    awards: String = "",
    experience: String = "",
    bio: String = "",
    isStudent: Boolean = false,
    onNameChange: (String) -> Unit = { },
    onDateOfBirthChange: (String) -> Unit = {},
    onEmailAddressChange: (String) -> Unit = {},
    onWebsiteURLChange: (String) -> Unit = {},
    onProjectsCompletedChange: (String) -> Unit = {},
    onAwardsChange: (String) -> Unit = {},
    onExperienceChange: (String) -> Unit = {},
    onBioChange: (String) -> Unit = {},
    onStudentStatusChanged: (Boolean) -> Unit = {},
    onDataSubmitted: () -> Unit = {}
) {


    Surface(modifier = Modifier.fillMaxSize(), color = Green10) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp), verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                Column(Modifier.width(180.dp)) {
                    Image(
                        painter = painterResource(id = com.manasmalla.portfolioomatic.R.drawable.portfolio_o_matic),
                        contentDescription = "Portfolio-O-Matic Logo",
                        modifier = Modifier.width(140.dp)
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                    Text(text = "Your Information", style = MaterialTheme.typography.headlineSmall)
                }
                Surface(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(Green15)
                        .padding(28.dp)
                ) {
                    Icon(
                        Icons.Rounded.CameraAlt,
                        contentDescription = "Add Image",
                        tint = Green70,
                        modifier = Modifier.background(
                            Green15
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = name,
                onValueChange = onNameChange,
                label = {
                    Text(text = "Name")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                modifier = Modifier.fillMaxWidth(),
            )
            TextField(value = dateOfBirth, onValueChange = onDateOfBirthChange, label = {
                Text(text = "Date Of Birth")
            }, modifier = Modifier.fillMaxWidth())
            TextField(
                value = emailAddress,
                onValueChange = onEmailAddressChange,
                label = {
                    Text(text = "Email Address")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = websiteURL,
                onValueChange = onWebsiteURLChange,
                label = {
                    Text(text = "Website")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Uri),
                modifier = Modifier.fillMaxWidth()
            )
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                TextField(
                    value = projectsCompleted,
                    onValueChange = onProjectsCompletedChange,
                    label = {
                        Text(text = "Projects")
                    },
                    modifier = Modifier.weight(1f),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                TextField(
                    value = awards,
                    onValueChange = onAwardsChange,
                    label = {
                        Text(text = "Awards")
                    },
                    modifier = Modifier.weight(1f),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                TextField(
                    value = experience,
                    onValueChange = onExperienceChange,
                    label = {
                        Text(text = "Experience", fontSize = 12.sp)
                    },
                    modifier = Modifier.weight(1f),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
            }
            TextField(value = bio, onValueChange = onBioChange, label = {
                Text(text = "Bio")
            }, modifier = Modifier.fillMaxWidth())
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Text(text = "Are you a student?")
                Switch(checked = isStudent, onCheckedChange = onStudentStatusChanged)
            }
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = onDataSubmitted,
                colors = ButtonDefaults.buttonColors(containerColor = Orange),
                shape = RoundedCornerShape(25)
            ) {
                Text(
                    text = "Create Portfolio",
                    modifier = Modifier.padding(8.dp),
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.Rounded.ArrowForward, contentDescription = "Next")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InformationScreenPreview() {
    PortfolioOMaticTheme(dynamicColor = false) {
        InformationScreen()
    }
}