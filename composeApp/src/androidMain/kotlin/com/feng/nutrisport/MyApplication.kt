package com.feng.nutrisport

import android.app.Application
import com.nutrisport.di.initializekoin
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.initialize
import org.koin.android.ext.koin.androidContext


class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initializekoin(
            config = {
                androidContext(this@MyApplication)
            }
        )
        Firebase.initialize(context = this)
    }
}