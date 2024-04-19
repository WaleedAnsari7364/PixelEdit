package com.example.pixeledit

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pixeledit.ui.theme.PixelEditTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val imageBitmap = BitmapFactory.decodeResource(resources, R.drawable.image_to_crop)

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.DarkGray),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxHeight(0.1f)
                        .fillMaxWidth()
                        .background(Color.Black)
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(onClick = { }) {
                        Text("Back")
                    }

                    Button(onClick = { }) {
                        Text("Save")
                    }
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(Color.DarkGray),
                ) {
                    Image(
                        bitmap = imageBitmap.asImageBitmap(),
                        contentDescription = null,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxHeight(0.1f)
                        .fillMaxWidth()
                        .background(Color.Black)
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(onClick = { }) {
                        Text("Crop")
                    }

                    Button(onClick = { }) {
                        Text("Polygon Crop")
                    }
                }
            }
        }
    }
}

