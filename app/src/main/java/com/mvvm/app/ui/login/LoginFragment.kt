package com.mvvm.app.ui.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.*
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.lifecycle.viewModelScope
import com.mvvm.app.R
import com.mvvm.app.data.local.room.User
import com.mvvm.app.data.local.room.UserDao
import com.mvvm.app.data.local.room.UserDatabase
import com.mvvm.app.ui.dashboard.DashboardFragment
import com.mvvm.app.utils.GeneralUtils.displayToast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment(R.layout.fragment_login) {
        val loginViewModel:LoginViewModel by activityViewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //taking input data from editText
//        loginViewModel=ViewModelProvider(requireActivity(),LoginViewModelFactor(UserDatabase.getDatabase(requireContext()).userDao())).get(LoginViewModel::class.java)




        //if user click on Sign in button
        btn_sign_in_sign_in_fragment.setOnClickListener{
            val email=et_email_address.text.toString()
            val password=et_password.text.toString()

            loginViewModel.insert(User(email, password))

            requireActivity().supportFragmentManager.commit {
                replace<DashboardFragment>(R.id.fcv_login_activity)
            }
            requireContext().displayToast("User Stored in Room Database Successfully")
        }
//        loginViewModel.getUserList().observe(viewLifecycleOwner, Observer {
//            tv_login_details.text=it.toString()
//        })

    }

}