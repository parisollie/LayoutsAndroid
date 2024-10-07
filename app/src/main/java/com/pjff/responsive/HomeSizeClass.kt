package com.pjff.responsive

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//Vid 279
// Compact = smartphone vertical
// Medium = Tablet vertical/ Fold
// Expanded = smartphone horizontal / Tablet horizontal

@Composable
fun HomeSizeClass(windowSizeClass: WindowSizeClass) {
    //condicional para elegir el tamaño
    when (windowSizeClass.widthSizeClass) {
        //Tablet
        WindowWidthSizeClass.Expanded -> {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                //Vid 280
                ViewTablet()
                //Vid 281
                TopicsButton()
                //Vid 282
                MainButton(600.dp)
            }
        }

        //Tablet verfical
        WindowWidthSizeClass.Medium -> {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                //Vid 280
                ViewFold()
                TopicsButton()
                MainButton(300.dp)
            }
        }

        //Smarptphone vertical
        WindowWidthSizeClass.Compact -> {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                ViewSmartphone()
                TopicsButton()
                MainButton()
            }
        }
    }
}
//Vid 280
@Composable
fun ViewSmartphone() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "",
            tint = Color.Blue,
            modifier = Modifier.size(200.dp)
        )
        Text(text = "Username", fontSize = 50.sp, fontWeight = FontWeight.Bold)
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Enter")
        }
    }
}

//Tablet
@Composable
fun ViewFold() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "",
            tint = Color.Red,
            modifier = Modifier.size(200.dp)
        )
        Text(text = "Username", fontSize = 50.sp, fontWeight = FontWeight.Bold)
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Enter")
        }
    }
}

//Tablet
@Composable
fun ViewTablet() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "",
            tint = Color.Green,
            modifier = Modifier.size(200.dp)
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Username", fontSize = 50.sp, fontWeight = FontWeight.Bold)
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Enter")
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
//Vid 281,
@Composable
fun TopicsButton() {
    FlowRow(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
        val topics = listOf("PHP","Kotlin","Swift","Python","Java","C#","Ruby","Scala")
        topics.forEach{ topic ->
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = topic)
            }
        }
    }
}

//Vid 283
@Composable
fun MainButton(size: Dp = 200.dp) {
    OutlinedButton(onClick = { /*TODO*/ }, modifier = Modifier.width(size)) {
        Text(text = "Save")
    }

}









