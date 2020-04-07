package com.example.flickrbrowser

import android.annotation.SuppressLint
import android.os.Build
import android.util.Log
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

internal const val FLICKR_QUERY = "FLICK_QUERY"
internal const val PHOTO_TRANSFER = "PHOTO_TRANSFER"

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {
    private val TAG = "BaseActivity"

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    internal fun activateToolbar(enableHome: Boolean) {
        Log.d(TAG, ".activateToolbar")

        var toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(enableHome)
    }
}