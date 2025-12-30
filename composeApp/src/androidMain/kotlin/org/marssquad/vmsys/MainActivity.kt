package org.marssquad.vmsys

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.koin.dsl.module

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

class BaseApplication() : Application() {
    override fun onCreate() {
        super.onCreate()

//        Firebase.initialize(this@BaseApplication.applicationContext) // init firebase

        // init Koin
        initKoin {
            it.modules(
                module {
                    single { this@BaseApplication.applicationContext }
                }
            )
        }

    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}