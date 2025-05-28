package com.example.age_calculator_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.age_calculator_app.ui.theme.AccentColor
import com.example.age_calculator_app.ui.theme.DarkBackgroundColor
import com.example.age_calculator_app.ui.theme.DarkContentColor
import com.example.age_calculator_app.ui.theme.DarkForeGroundColor
import com.example.age_calculator_app.ui.theme.DarkTextColor

private val description =
    "\uD83C\uDF89 Age Calculator App helps users find their real age based on their date of birth.\n" + "\uD83D\uDCC6 It provides a clean and modern UI using Jetpack Compose with dark theme support."

@Preview
@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkBackgroundColor)
            .padding(12.dp)
    ) {
        // Title at top
        Text(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 100.dp),
            text = "Let's Find our \n Four Real Age",
            color = Color.White,
            fontWeight = FontWeight.Light,
            fontFamily = FontFamily.SansSerif,
            style = MaterialTheme.typography.headlineSmall
        )

        // Centered "Date Of Birth"
        BodySection(
            modifier = Modifier.align(Alignment.Center) // This centers the WHOLE BodySection
        )

        CalculateButton(
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}

@Composable
fun BodySection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(30.dp))
            .background(DarkContentColor), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "DATE OF BIRTH",
            color = DarkTextColor,
            fontWeight = FontWeight.Bold,

            )

        Spacer(modifier = Modifier.height(30.dp))
        DatePickerButton()

        Text(
            modifier = Modifier.padding(35.dp),
            text = description,
            color = Color.White,
            style = MaterialTheme.typography.bodySmall
        )
    }
}

@Composable
fun DatePickerButton(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .background(DarkForeGroundColor)
            .clickable{}
        ,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier.padding(18.dp),
            text = "DD-MM-YYYY",
            color = Color.White,
            style = MaterialTheme.typography.bodyMedium
        )

        Image(painter = painterResource(R.drawable.date), contentDescription = "")
        Spacer(modifier = Modifier.width(12.dp))

    }

}

@Composable
fun CalculateButton(modifier: Modifier = Modifier) {
    Button(
        modifier = modifier,
        onClick = {

        },
        colors = ButtonColors(
            contentColor = Color.White,
            containerColor = AccentColor,
            disabledContentColor = DarkForeGroundColor,
            disabledContainerColor = DarkContentColor
        )
    ) {
        Icon(painter = painterResource(R.drawable.arrow), contentDescription = "")
    }
}