package com.mvvm.app.utils

import android.content.Context
import android.widget.Toast

object GeneralUtils {
    /**
     * Method to show toast of [text]
     */
    fun Context.displayToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}