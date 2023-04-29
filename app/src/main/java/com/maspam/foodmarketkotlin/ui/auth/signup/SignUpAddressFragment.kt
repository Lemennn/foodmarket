package com.maspam.foodmarketkotlin.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.maspam.foodmarketkotlin.R
import com.maspam.foodmarketkotlin.databinding.FragmentSignupAddressBinding
import com.maspam.foodmarketkotlin.ui.auth.AuthActivity

class SignUpAddressFragment : Fragment() {

    private var _binding : FragmentSignupAddressBinding? = null
    private var binding = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignupAddressBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onResume() {
        super.onResume()

        binding?.btnSignUpNow?.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_signUp_success, null)
            (activity as AuthActivity).toolbarSignUpSucces()
        }
    }

}