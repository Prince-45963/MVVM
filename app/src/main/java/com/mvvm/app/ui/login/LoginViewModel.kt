package com.mvvm.app.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mvvm.app.data.local.room.User
import com.mvvm.app.data.local.room.UserDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

 class LoginViewModel( val userDao: UserDao):ViewModel() {
    fun getUserList():LiveData<MutableList<User>>{
        return userDao.getUserList()
    }
    fun insert(user: User){
        viewModelScope.launch(Dispatchers.IO) {
            userDao.insert(user)
        }
    }

}