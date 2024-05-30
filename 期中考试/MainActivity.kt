package com.example.middleexam
import UserData
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.middleexam.ui.theme.MiddleExamTheme

 class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiddleExamTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFEEEEEE)
                ) {
                    MiddleExamTheme {
                        Greeting()
                    }
                }
            }
        }
    }
}


@Composable
fun Greeting() {
    val navController = rememberNavController()
    NavHost(navController = (navController), startDestination = "index"){
        composable("index"){ IndexPage(navController) }
        composable("NewsPage"){ NewsPage(navController,UserData.NewsList) }
        composable("NovelPage"){ NovelPage(navController,UserData.NovelList)}
        composable("EndPage"){ EndPage(navController)}
    }
}

@Composable
fun IndexPage(navController: NavController){
    Column {
        Button(onClick = { navController.navigate("News")}) {
            Text(text = "新闻")
        }

        Button(onClick = { navController.navigate("Novel")}) {
            Text(text = "小说")
        }

        Button(onClick = { navController.navigate("End")}) {
            Text(text = "结束")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MiddleExamTheme {
        Greeting()
    }
}