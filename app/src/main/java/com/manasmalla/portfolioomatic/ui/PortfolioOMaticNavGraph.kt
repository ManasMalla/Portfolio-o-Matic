package com.manasmalla.portfolioomatic.ui

import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.*

const val SPLASH_ROUTE = "splash"
const val INFORMATION_ROUTE = "information"
const val PORTFOLIO_ROUTE = "portfolio"

@Composable
fun PortfolioOMaticNavGraph(navController: NavHostController = rememberNavController()) {

    var name by remember {
        mutableStateOf("")
    }
    var dateOfBirth by remember {
        mutableStateOf("")
    }
    var emailAddress by remember {
        mutableStateOf("")
    }
    var websiteURL by remember {
        mutableStateOf("")
    }
    var projectsCompleted by remember {
        mutableStateOf("")
    }
    var awards by remember {
        mutableStateOf("")
    }
    var experience by remember {
        mutableStateOf("")
    }
    var bio by remember {
        mutableStateOf("")
    }
    var isStudent by remember {
        mutableStateOf(true)
    }
    var age by remember {
        mutableStateOf(-1)
    }

    NavHost(navController = navController, startDestination = SPLASH_ROUTE) {
        composable(SPLASH_ROUTE) {
            LaunchedEffect(key1 = true) {
                delay(2000)
                navController.navigate(INFORMATION_ROUTE)
            }
            SplashScreen()
        }
        composable(INFORMATION_ROUTE) {
            InformationScreen(name,
                dateOfBirth,
                emailAddress,
                websiteURL,
                projectsCompleted,
                awards,
                experience,
                bio,
                isStudent = isStudent,
                onStudentStatusChanged = {
                    isStudent = it
                },
                onNameChange = {
                    name = it
                },
                onDateOfBirthChange = {
                    dateOfBirth = it
                },
                onEmailAddressChange = {
                    emailAddress = it
                },
                onWebsiteURLChange = {
                    websiteURL = it
                },
                onProjectsCompletedChange = {
                    projectsCompleted = it
                },
                onAwardsChange = {
                    awards = it
                },
                onExperienceChange = {
                    experience = it
                },
                onBioChange = {
                    bio = it
                },
                onDataSubmitted = {
                    val DoB = SimpleDateFormat("ddMMyyyy", Locale.getDefault()).parse(dateOfBirth)
                    val dob = Calendar.getInstance()
                    if (DoB != null) {
                        dob.time = DoB
                    }

                    age = Calendar.getInstance().get(Calendar.YEAR) - dob.get(Calendar.YEAR)

                    if (Calendar.getInstance()
                            .get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)
                    ) {
                        age--
                    }
                    navController.navigate(PORTFOLIO_ROUTE)
                })
        }
        composable(PORTFOLIO_ROUTE) {
            PortfolioScreen(
                name,
                age.toString(),
                emailAddress,
                websiteURL,
                isStudent,
                projectsCompleted,
                awards,
                experience,
                bio,
            )
        }
    }
}