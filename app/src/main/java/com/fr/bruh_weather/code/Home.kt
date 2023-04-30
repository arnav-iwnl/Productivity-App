package com.fr.bruh_weather

import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.fr.bruh_weather.ui.theme.*


@Composable
fun Home(
    fname: String? , sname: String? ,

) {

    val Inter = FontFamily(
        Font(R.font.bol, FontWeight.Bold),
        Font(R.font.regu_, FontWeight.Normal)
    )
    val ppicon = painterResource(id = R.drawable.programmer)
    val scrollState = rememberScrollState()
    val butgray= ButtonDefaults.buttonColors(backgroundColor = grey)






    Column(modifier = Modifier
        .background(Bg)
        .verticalScroll(scrollState)) {
        Spacer(modifier = Modifier.size(10.dp))
        Row(modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
            ,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Home",
                color = Color.White,
                textAlign = TextAlign.Start,
                fontFamily = Inter,
                fontWeight = FontWeight.Normal,
                style = TextStyle(fontSize = 20.sp),
                modifier=Modifier.padding(start=10.dp,top=16.dp)
            )



        }
        Spacer(modifier = Modifier.size(30.dp))
        Column(modifier= Modifier
            .fillMaxWidth(1f)
            .padding(start = 10.dp)
            )
        {
            Text(text = "Hello",
                color = Color.White,
                textAlign = TextAlign.Start,
                fontFamily = Inter,
                fontWeight = FontWeight.Bold,
                style = TextStyle(fontSize = 50.sp),

            )

                Text(text = fname.toString() ,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    fontFamily = Inter,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(fontSize = 50.sp),
                    modifier = Modifier,
                )
                Text(text= sname.toString() ,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    fontFamily = Inter,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(fontSize = 50.sp),
                    modifier = Modifier)

        }
        Spacer(modifier = Modifier. size(25.dp))
        Box(modifier=Modifier .padding(start=40.dp),
            contentAlignment = Alignment.CenterEnd){
            Card(modifier=Modifier .size(300.dp,200.dp)
                , contentColor = Color.Gray,
                shape=Shapes.large){
            }
        }
        Spacer(modifier = Modifier. size(25.dp))
        Text("Quote of the Day",
            color = Color.White,
            textAlign = TextAlign.Start,
            fontFamily = Inter,
            fontWeight = FontWeight.Bold,
            style = TextStyle(fontSize = 36.sp),
            modifier = Modifier
                .padding(start = 10.dp))
        Spacer(modifier = Modifier. size(15.dp))



    }
}
