package com.example.middleexam

import Novel
import UserData
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController

@Composable
fun NovelPage(navController: NavHostController, commodity: List<Novel>){
    Column{
        for (i in commodity.indices) {
            Text(text = commodity[i].name)
            Text(text = "有趣小说")
            Image(painter = painterResource(id =R.drawable.ic_launcher_foreground),
                contentDescription = null)
            Text(text = "Android")
        }
        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text = "home")
        }
    }
}
