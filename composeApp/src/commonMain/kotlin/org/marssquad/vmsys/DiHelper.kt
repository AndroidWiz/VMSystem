package org.marssquad.vmsys

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.marssquad.vmsys.data.di.dataModule
import org.marssquad.vmsys.domain.di.domainModule
import org.marssquad.vmsys.ui.di.uiModule

fun initKoin(koinApp: ((KoinApplication) -> Unit)? = null) {
    startKoin {
        koinApp?.invoke(this)
        modules(dataModule, domainModule, uiModule)
    }
}