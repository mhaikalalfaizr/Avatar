package com.example.avatar

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Avatar : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            AvatarScreen()
        }
    }
}

@Composable
fun AvatarScreen() {
    var showAlis by remember { mutableStateOf(true) }
    var showMata by remember { mutableStateOf(true) }
    var showHidung by remember { mutableStateOf(true) }
    var showMulut by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.LightGray),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(
                text = "AvataRawr",
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(16.dp)
            )
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.face_0004),
                contentDescription = "Wajah"
            )
            if (showAlis) {
                Image(
                    painter = painterResource(id = R.drawable.face_0001),
                    contentDescription = "Alis",
                    modifier = Modifier
                        .offset(y = (-30).dp)
                        .size(235.dp)
                )
            }
            if (showMata) {
                Image(
                    painter = painterResource(id = R.drawable.face_0003),
                    contentDescription = "Mata",
                    modifier = Modifier
                        .offset(y = 5.dp)
                        .size(220.dp)
                )
            }
            if (showHidung) {
                Image(
                    painter = painterResource(id = R.drawable.face_0002),
                    contentDescription = "Hidung",
                    modifier = Modifier
                        .offset(y = 50.dp)
                        .size(60.dp)
                )
            }
            if (showMulut) {
                Image(
                    painter = painterResource(id = R.drawable.face_0000),
                    contentDescription = "Mulut",
                    modifier = Modifier
                        .offset(y = 100.dp)
                        .size(95.dp)
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Checkbox(label = "Alis", checked = showAlis, onCheckedChange = { showAlis = it })
            Checkbox(label = "Mata", checked = showMata, onCheckedChange = { showMata = it })
            Checkbox(label = "Hidung", checked = showHidung, onCheckedChange = { showHidung = it })
            Checkbox(label = "Mulut", checked = showMulut, onCheckedChange = { showMulut = it })
        }
    }
}

        @Composable
        fun Checkbox(label: String, checked: Boolean, onCheckedChange: (Boolean) -> Unit) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = checked, onCheckedChange = onCheckedChange)
                Text(text = label)
            }
        }
