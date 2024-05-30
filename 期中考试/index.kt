package com.example.middleexam
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
@Composable
fun Index(
    navController: NavHostController
){
    Column (
    ){
        Button(onClick = { navController.navigate("com.example.middleexam.IndexPage") }) {
            Text(text = "Enter")
        }
    }
}



