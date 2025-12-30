package org.marssquad.vmsys.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.marssquad.vmsys.data.model.WorkOrder
import org.marssquad.vmsys.data.model.dummyWorkOrders

@Composable
fun RecentWorkOrderItem(
    modifier: Modifier = Modifier,
    workOrder: WorkOrder,
) {
    Box(
        modifier = modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Column(modifier = modifier) {
            Text(
                text = workOrder.title,
                fontSize = 14.sp,
                fontWeight = FontWeight.Light,
                color = Color.White
            )
            Text(
                text = workOrder.description,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun RecentWorkOrderItemPreview() {
    RecentWorkOrderItem(workOrder = dummyWorkOrders[0])
}