package com.maspam.foodmarketkotlin.ui.auth.signin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.maspam.foodmarketkotlin.databinding.FragmentSigninBinding
import com.maspam.foodmarketkotlin.ui.auth.AuthActivity

class SignInFragment : Fragment(){

    private var _binding: FragmentSigninBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSigninBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
    }

    override fun onResume() {
        super.onResume()
        binding?.btnSignUp?.setOnClickListener {
            val signUp = Intent(activity, AuthActivity::class.java)
            signUp.putExtra("page_request", 2)
            startActivity(signUp)
        }
    }

}