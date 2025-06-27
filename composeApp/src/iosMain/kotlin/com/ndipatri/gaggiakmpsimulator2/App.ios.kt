package com.ndipatri.gaggiakmpsimulator2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.UIKitViewController
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.height
import androidx.compose.ui.unit.dp
import platform.UIKit.UIViewController
import androidx.compose.runtime.staticCompositionLocalOf

@Composable
actual fun RiveAnimation(modifier: Modifier) {
    val factory = LocalNativeViewFactory.current

     UIKitViewController(
        modifier = modifier
          .width(400.dp)
          .height(400.dp),
        factory = {
            factory.provideCoffeeRobotAnimation()
        }
      )

}

interface UIViewControllerProvider {
   fun provideCoffeeRobotAnimation(): UIViewController
}


val LocalNativeViewFactory = staticCompositionLocalOf<UIViewControllerProvider> {
   error("No view factory provided.")
}
