package com.example.translator

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.PixelFormat
import android.view.Gravity
import android.view.View
import android.view.WindowManager

@SuppressLint("StaticFieldLeak")
object TranslationViewManager {
    private var translationView: View? = null

    fun showView(context: Context) {
        if (translationView != null) return

        translationView = context.layoutInflater().inflate(R.layout.translateion_view, null, false)

        val layoutParams = WindowManager.LayoutParams(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.TRANSLUCENT
        ).apply {
            gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
        }

        context.windowManager().addView(translationView, layoutParams)
    }

    fun hideView(context: Context) {
        context.windowManager().removeView(translationView)
        translationView = null
    }
}