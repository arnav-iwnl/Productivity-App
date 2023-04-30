package com.fr.bruh_weather

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.fr.bruh_weather.ui.theme.Bt21000



@Composable
fun Form(onContinueClick:(String,String)-> Unit) {

    val Inter = FontFamily(
        Font(R.font.bol, FontWeight.Bold),
        Font(R.font.regu_, FontWeight.Normal)
    )
    val scrollState = rememberScrollState()

    val fname = remember {
        mutableStateOf("")
    }
    val lname = remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollState)
        .background(Color.DarkGray),
    verticalArrangement = Arrangement.SpaceEvenly)
    {
        Box(modifier = Modifier

            .background(Color.DarkGray)

        ){

        }
        Spacer(modifier = Modifier
            .width(20.dp)
            .height(20.dp)
        )
        Column(modifier = Modifier,

        ){
            TextField(
                value = fname.value ,
                label = {
                    Text(text = "First Name")
                },
                onValueChange = {
                    fname.value = it
                } ,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.DarkGray) ,
                singleLine = true ,
            )
            Spacer(modifier= Modifier.height(10.dp))
            TextField(value = lname.value,
                label = {
                    Text(text = "Last Name")
                }
                ,onValueChange = {
                lname.value =it
            }, modifier= Modifier
                .fillMaxWidth()
                .background(Color.DarkGray),singleLine=true)
            Spacer(modifier = Modifier
                .width(20.dp)
                .height(20.dp)
            )
            Button(
                onClick = {onContinueClick(fname.value,lname.value)},
                modifier = Modifier,
//                    navController,
                colors = ButtonDefaults.buttonColors(backgroundColor = Bt21000),
                shape = RoundedCornerShape(50.dp),


                ) {
                Text(
                    text = "Continue",
                    textAlign = TextAlign.Center,
                    fontFamily = Inter,
                    color=Color.White,
                    style = TextStyle(fontSize = 30.sp),
                    fontWeight = FontWeight.Bold,
                    overflow = TextOverflow.Clip,
                    modifier = Modifier
                        .padding(60.dp,3.dp)

                )
            }
        }
    }
}