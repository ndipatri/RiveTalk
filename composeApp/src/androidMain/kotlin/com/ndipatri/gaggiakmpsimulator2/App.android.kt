package com.ndipatri.gaggiakmpsimulator2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import app.rive.runtime.kotlin.RiveAnimationView
import app.rive.runtime.kotlin.core.Alignment

@Composable
actual fun RiveAnimation(modifier: Modifier) {
       AndroidView(
              modifier = modifier,
              factory = { context ->
                  RiveAnimationView(context).also {
                      it.setRiveResource(
                          resId = R.raw.coffee_robot,
                          stateMachineName = null,
                          alignment = Alignment.CENTER
                      )
                  }
              }
          )
}