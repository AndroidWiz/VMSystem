package org.marssquad.vmsys.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.marssquad.vmsys.ui.components.DashboardCard

@Composable
@Preview(showBackground = true)
fun DashboardScreen(modifier: Modifier = Modifier) {

    Column(modifier = modifier.fillMaxSize()) {

        Row(modifier = modifier.fillMaxWidth()) {
            DashboardCard(modifier = modifier.weight(1f), cardHeader = "Pending Approvals", cardDetails = "15")
            DashboardCard(modifier = modifier.weight(1f), cardHeader = "Active Jobs", cardDetails = "42")
            DashboardCard(modifier = modifier.weight(1f), cardHeader = "Total Payouts Due", cardDetails = "$12,450")
        }

    }
}