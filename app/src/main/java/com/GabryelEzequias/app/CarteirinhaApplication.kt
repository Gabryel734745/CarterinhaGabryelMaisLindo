package com.GabryelEzequias.app

import android.app.Application
import com.GabryelEzequias.app.di.AppContainer
import com.GabryelEzequias.app.di.DefaultAppContainer

class CarteirinhaApplication : Application() {
    val container: AppContainer by lazy {
        DefaultAppContainer()
    }
}