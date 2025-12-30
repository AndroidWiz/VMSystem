package org.marssquad.vmsys.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun DashboardCard(
    modifier: Modifier = Modifier,
    cardHeader: String = "",
    cardDetails: String = "",
) {

    // 0xFF152B4A
    Card(
        modifier = modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(height = 90.dp),
        shape = RoundedCornerShape(size = 10.dp),
        colors = CardColors(
            containerColor = Color(0xFF152B4A),
            contentColor = Color.White,
            disabledContainerColor = Color(0xFF152B4A),
            disabledContentColor = Color.White
        ),
    ) {
        Column(
            modifier = modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = cardHeader,
                fontSize = 14.sp,
                fontWeight = FontWeight.Light,
                color = Color.White
            )
            Spacer(modifier = modifier.height(height = 5.dp))
            Text(
                text = cardDetails,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }

}