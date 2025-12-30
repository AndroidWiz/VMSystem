@file:Suppress("DEPRECATION")

package org.marssquad.vmsys

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.PreComposeApp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.marssquad.vmsys.ui.nav.AdaptiveUiAndNavigation
import org.marssquad.vmsys.ui.theme.AppTheme

@Composable
@Preview
fun App() {
    KoinContext {
        PreComposeApp {
            AppTheme(onThemeChanged = {}) {
//            MaterialTheme {
//                AppNav()
                AdaptiveUiAndNavigation()
            }
        }
    }
}

/*
@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
        }
    }
}*/
