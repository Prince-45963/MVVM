package com.mvvm.app.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.mvvm.app.R
import com.mvvm.app.data.local.room.User
import com.mvvm.app.data.local.room.UserDao
import com.mvvm.app.data.local.room.UserDatabase
import com.mvvm.app.utils.GeneralUtils.displayToast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment(R.layout.fragment_login) {
      lateinit var loginViewModel:LoginViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //taking input data from editText

        val email=et_email_address.text.toString()
        val password=et_password.text.toString()
        //if user click on Sign in button
        loginViewModel=ViewModelProvider(requireActivity(),LoginViewModelFactor(UserDatabase.getDatabase(requireContext()).userDao())).get(LoginViewModel::class.java)
        btn_sign_in_sign_in_fragment.setOnClickListener{

            loginViewModel.insert(User(email, password))
            requireContext().displayToast("User Stored in Room Database Successfully")
        }

    }

}