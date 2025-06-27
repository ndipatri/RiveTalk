package com.ndipatri.gaggiakmpsimulator2

import androidx.compose.ui.window.ComposeUIViewController
import androidx.compose.runtime.CompositionLocalProvider
import platform.UIKit.UIViewController

fun MainViewController(
   uiViewControllerProvider: UIViewControllerProvider
): UIViewController = ComposeUIViewController {
   CompositionLocalProvider(
       LocalNativeViewFactory provides uiViewControllerProvider
   ) {
       App()
   }
}

