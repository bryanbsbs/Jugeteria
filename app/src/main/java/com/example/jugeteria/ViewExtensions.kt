package com.example.jugeteria

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory

fun Int.createBitmap(contexto: Context): Bitmap {
    return BitmapFactory.decodeResource(contexto.resources, this)
}