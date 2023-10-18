package com.arturodev.profilecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@Composable
fun ProfileCard() {
    Column(
        modifier = Modifier
            .background(color = Color(0xFF012531))
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CardInfo()
        Divider(modifier = Modifier.height(120.dp), color = Color(0xFF012531))
        InfoDetails()
    }
}

@Composable
fun CardInfo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(start = 10.dp, end = 10.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo), contentDescription = null,
            modifier = Modifier
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(top = 8.dp, bottom = 8.dp)
                .height(150.dp)
                .width(150.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "Jennifer Doe", color = Color(0xFFFFFFFF),
            modifier = Modifier.fillMaxWidth(), fontSize = 50.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Light
        )
        Text(
            text = "Android Developer Expert", color = Color(0xFF3ddc84), fontSize = 20.sp,
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
        )
    }
}

@Composable
fun InfoDetails() {
    Column (){
        Divider(
            color = Color(0xFFFFFFFF),
            modifier = Modifier
                .fillMaxWidth()
                .width(1.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                tint = Color(0xFF3ddc84),
                modifier = Modifier
                    .padding(start = 32.dp, top = 8.dp, bottom = 8.dp, end = 24.dp)
            )
            Text(
                text = "+00 (123) 444 555 666",
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
                fontSize = 16.sp
            )
        }
        Divider(
            color = Color(0xFFFFFFFF),
            modifier = Modifier
                .fillMaxWidth()
                .width(1.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = Color(0xFF3ddc84),
                modifier = Modifier
                    .padding(start = 32.dp, top = 8.dp, bottom = 8.dp, end = 24.dp)
            )
            Text(
                text = "@AndroidDevelepoer",
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
                fontSize = 16.sp
            )
        }
        Divider(
            color = Color(0xFFFFFFFF),
            modifier = Modifier
                .fillMaxWidth()
                .width(1.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                tint = Color(0xFF3ddc84),
                modifier = Modifier
                    .padding(start = 32.dp, top = 8.dp, bottom = 8.dp, end = 24.dp)
            )
            Text(
                text = "developer@gmail.com",
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
                fontSize = 16.sp,

            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileCardPreview() {
    ProfileCard()
}