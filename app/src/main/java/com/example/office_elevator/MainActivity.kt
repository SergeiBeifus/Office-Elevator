package com.example.office_elevator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.office_elevator.ui.theme.OfficeElevatorTheme
import com.example.office_elevator.ui.theme.Purple200
import com.example.office_elevator.ui.theme.Purple500
import com.example.office_elevator.ui.theme.Purple700

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Purple500)
                    .size(70.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Office Elevator", color = Color.White, fontSize = 35.sp)
            }
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Button(onClick = {}, colors = ButtonDefaults.buttonColors(backgroundColor = Purple500, contentColor = Color.White)) {
                    Image(
                        modifier = Modifier
                            .size(140.dp),
                        painter = painterResource(R.drawable.downarrow_121316__1_),
                        contentDescription = null
                    )
                }
            }
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
                Text(
                    text = "Нажмите на кнопку, чтобы поднять лифт на пятый этаж",
                    textAlign = TextAlign.Center,
                    color = Color.Gray,
                    fontSize = 25.sp,
                    modifier = Modifier.width(240.dp).height(215.dp)
                )
            }
        }
    }
}

