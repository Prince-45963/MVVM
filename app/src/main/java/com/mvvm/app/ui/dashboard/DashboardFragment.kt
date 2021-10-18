package com.mvvm.app.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.mvvm.app.R
import com.mvvm.app.data.local.room.User
import com.mvvm.app.ui.login.LoginViewModel
import kotlinx.android.synthetic.main.fragment_dashboard.*


class DashboardFragment : Fragment(R.layout.fragment_dashboard) {
    val loginViewModel: LoginViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginViewModel.getUserList().observe(this, Observer {
                tv_login_detail.text = it.toString()
            })
        btn_clear.setOnClickListener{

        }

    }
}