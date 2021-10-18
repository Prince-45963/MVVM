package com.mvvm.app.ui.login

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.mvvm.app.R
import com.mvvm.app.data.local.room.UserDao
import com.mvvm.app.data.local.room.UserDatabase
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         var loginViewModel: LoginViewModel?=null
        loginViewModel= ViewModelProvider(this,LoginViewModelFactor(UserDatabase.getDatabase(this).userDao())).get(LoginViewModel::class.java)
        supportFragmentManager.commit {
            add<LoginFragment>(R.id.fcv_login_activity)
        }


    }
}