package com.maspam.foodmarketkotlin.ui.auth.signup

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.maspam.foodmarketkotlin.R
import com.maspam.foodmarketkotlin.databinding.FragmentSignupBinding
import com.maspam.foodmarketkotlin.ui.auth.AuthActivity

class SignUpFragment : Fragment() {

    private var _binding : FragmentSignupBinding? = null
    private var binding = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignupBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding?.btnContinue?.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_signUp_address, null)
            (activity as AuthActivity ).toolbarSignUpAddress()
        }
    }

    override fun onResume() {
        super.onResume()

        binding?.btnContinue?.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_signUp_address, null)
            (activity as AuthActivity ).toolbarSignUpAddress()
        }
    }
}