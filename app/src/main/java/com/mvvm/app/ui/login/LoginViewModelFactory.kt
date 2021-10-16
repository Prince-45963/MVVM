package com.mvvm.app.ui.login

import android.widget.ViewSwitcher
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mvvm.app.data.local.room.UserDao

class LoginViewModelFactor(val userDao: UserDao ):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(userDao) as T
    }

}