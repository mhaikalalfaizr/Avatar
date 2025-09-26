package com.example.avatar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

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
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Avatar",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(16.dp)
        )
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
