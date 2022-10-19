package com.example.translator

import android.content.Context
import android.view.LayoutInflater
import android.view.WindowManager

fun Context.layoutInflater() = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

fun Context.windowManager()  = getSystemService(Context.WINDOW_SERVICE) as WindowManager