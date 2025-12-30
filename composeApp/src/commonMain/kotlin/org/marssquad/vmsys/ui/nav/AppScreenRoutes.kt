package org.marssquad.vmsys.ui.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Assignment
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import org.jetbrains.compose.resources.StringResource
import vmsystem.composeapp.generated.resources.Res
import vmsystem.composeapp.generated.resources.dashboard
import vmsystem.composeapp.generated.resources.financials
import vmsystem.composeapp.generated.resources.settings
import vmsystem.composeapp.generated.resources.vendors
import vmsystem.composeapp.generated.resources.work_orders

enum class AppRoutes(
    val label: StringResource,
    val icon: ImageVector,
    val contentDescription: StringResource,
) {
    Dashboard(
        label = Res.string.dashboard,
        icon = Icons.Default.Dashboard,
        contentDescription = Res.string.dashboard
    ),
    WorkOrders(
        label = Res.string.work_orders,
        icon = Icons.Default.Assignment,
        contentDescription = Res.string.work_orders
    ),
    Vendors(
        label = Res.string.vendors,
        icon = Icons.Default.People,
        contentDescription = Res.string.vendors
    ),
    Financials(
        label = Res.string.financials,
        icon = Icons.Default.AttachMoney,
        contentDescription = Res.string.financials
    ),
    Settings(
        label = Res.string.settings,
        icon = Icons.Default.Settings,
        contentDescription = Res.string.settings
    )
}

/*
sealed class AppScreenRoutes(val title: String, val icon: ImageVector, val route: String) {
    data object Dashboard :
        AppScreenRoutes(title = "Dashboard", icon = Icons.Default.Dashboard, route = "/dashboard")

    data object WorkOrders : AppScreenRoutes(
        title = "Work Orders",
        icon = Icons.Default.Assignment,
        route = "/work_orders"
    )

    data object Vendors :
        AppScreenRoutes(title = "Vendors", icon = Icons.Default.People, route = "/vendors")

    data object Financials : AppScreenRoutes(
        title = "Financials",
        icon = Icons.Default.AttachMoney,
        route = "/financials"
    )

    data object Settings :
        AppScreenRoutes(title = "Settings", icon = Icons.Default.Settings, route = "/settings")
}*/