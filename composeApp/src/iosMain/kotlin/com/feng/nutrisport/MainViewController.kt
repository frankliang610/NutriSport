package com.feng.nutrisport

import androidx.compose.ui.window.ComposeUIViewController
import com.nutrisport.di.initializekoin

fun MainViewController() = ComposeUIViewController(
    configure = { initializekoin() }
) { App() }