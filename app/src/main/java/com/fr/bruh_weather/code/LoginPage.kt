package com.fr.bruh_weather

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fr.bruh_weather.ui.theme.Bg
import com.fr.bruh_weather.ui.theme.Bt21000
import com.fr.bruh_weather.ui.theme.gtint




@Composable
fun LoginPage(
    onGetStarted:()-> Unit,
) {
    val Inter = FontFamily(
        Font(R.font.bol, FontWeight.Bold),
        Font(R.font.regu_, FontWeight.Normal)
    )
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .background(Bg)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            Image(
                    painter = painterResource(id = R.drawable.landing),
                    contentDescription = "Logo",
                    contentScale=ContentScale.FillHeight,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(350.dp)
                        .align(Alignment.Start)
//                        .padding(end=80.dp),
                )

            Text(
                    text = "Productivity has never been easier.",
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    fontFamily = Inter,
                    style = TextStyle(fontSize = 40.sp),
                    fontWeight = FontWeight.Bold,
                modifier=Modifier .padding(start = 20.dp)

                )

            Button(
                    onClick =
                        onGetStarted ,
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .padding(start = 20.dp)
                     ,
//                    navController,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Bt21000
                    ),
//                contentPadding = ButtonDefaults.ContentPadding ,
                    shape = RoundedCornerShape(50.dp),


                    )
            {
                Row(
                    modifier=Modifier .padding(end=8.dp, start = 20.dp),

                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(imageVector = ImageVector.vectorResource(
                    id = R.drawable.diamond_start
                ),
                    contentDescription = null,
                    tint=Color.White,
                    modifier=Modifier
                        .padding(end=9.dp)
                )
                Text(text = "Next", textAlign = TextAlign.Center,
                    fontFamily = Inter,
                    color=Color.White,
                    style = TextStyle(fontSize = 25.sp),
                    fontWeight = FontWeight.Bold,
                    overflow = TextOverflow.Clip,
                    modifier = Modifier
                )
            }

                }
                Spacer(modifier = Modifier .size(20.dp))
                Text(text = "Click on the button to get started.",
                    textAlign = TextAlign.Center,
                    fontFamily = Inter,
                    color= gtint,
                    style = TextStyle(fontSize = 15.sp),
                    fontWeight = FontWeight.Normal,
                    overflow = TextOverflow.Clip,
                    modifier = Modifier
                        .padding(60.dp,30.dp)
                )




        }
    }
}


