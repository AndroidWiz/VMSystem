package org.marssquad.vmsys.ui.nav

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteDefaults
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldDefaults
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.window.core.layout.WindowSizeClass
import org.jetbrains.compose.resources.stringResource
import org.marssquad.vmsys.ui.screens.DashboardScreen
import org.marssquad.vmsys.ui.screens.FinancialsScreen
import org.marssquad.vmsys.ui.screens.SettingsScreen
import org.marssquad.vmsys.ui.screens.VendorsListScreen
import org.marssquad.vmsys.ui.screens.WorkOrdersScreen

@Composable
fun AdaptiveUiAndNavigation() {

    var currentDestination by remember { mutableStateOf(AppRoutes.Dashboard) }

    val adaptiveInfo = currentWindowAdaptiveInfo()

    val layoutType =
        if (adaptiveInfo.windowSizeClass.isWidthAtLeastBreakpoint(WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND)) {
            NavigationSuiteType.NavigationDrawer
        } else {
            NavigationSuiteScaffoldDefaults.calculateFromAdaptiveInfo(adaptiveInfo)
        }

    NavigationSuiteScaffold(
        layoutType = layoutType,
        navigationSuiteItems = {
            AppRoutes.entries.forEach {
                item(
                    selected = currentDestination == it,
                    onClick = { currentDestination = it },
                    icon = {
                        Icon(
                            imageVector = it.icon,
                            contentDescription = stringResource(it.contentDescription)
                        )
                    },
                    label = {
                        Text(text = stringResource(it.label), color = MaterialTheme.colorScheme.onSurface)
                    },
                    alwaysShowLabel = true
                )
            }
        },
        navigationSuiteColors = NavigationSuiteDefaults.colors(
            navigationBarContainerColor = MaterialTheme.colorScheme.surfaceContainer,
            navigationDrawerContainerColor = MaterialTheme.colorScheme.surfaceContainer,
            navigationRailContainerColor = MaterialTheme.colorScheme.surfaceContainer,
        )
    ) {
        when (currentDestination) {
            AppRoutes.Dashboard -> DashboardScreen()
            AppRoutes.WorkOrders -> WorkOrdersScreen()
            AppRoutes.Vendors -> VendorsListScreen()
            AppRoutes.Financials -> FinancialsScreen()
            AppRoutes.Settings -> SettingsScreen()
        }
    }
}