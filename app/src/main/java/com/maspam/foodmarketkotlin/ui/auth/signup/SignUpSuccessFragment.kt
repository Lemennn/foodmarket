package com.maspam.foodmarketkotlin.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.maspam.foodmarketkotlin.R
import com.maspam.foodmarketkotlin.databinding.FragmentSignupSuccessBinding

class SignUpSuccessFragment : Fragment() {

    private var _binding: FragmentSignupSuccessBinding? = null
    private var binding = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup_success, container, false)
    }

    override fun onResume() {
        super.onResume()
    }
}