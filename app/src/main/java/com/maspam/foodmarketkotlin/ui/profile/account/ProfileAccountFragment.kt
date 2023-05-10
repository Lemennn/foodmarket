package com.maspam.foodmarketkotlin.ui.profile.account

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.maspam.foodmarketkotlin.R
import com.maspam.foodmarketkotlin.databinding.FragmentProfileAccountBinding
import com.maspam.foodmarketkotlin.model.dummy.ProfileMenuModel


class ProfileAccountFragment : Fragment() {

    private var _binding : FragmentProfileAccountBinding? = null
    private val binding: FragmentProfileAccountBinding get()  = _binding!!

    private var data: ArrayList<ProfileMenuModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileAccountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()

        startRecyclerAcvitivy()
    }

    fun dataDummy() : ArrayList<ProfileMenuModel> {
        data = ArrayList()
        data.add(ProfileMenuModel("Edit Profile"))
        data.add(ProfileMenuModel("Home Address"))
        data.add(ProfileMenuModel("Security"))
        data.add(ProfileMenuModel("Payment"))
        return data
    }

    fun startRecyclerAcvitivy(){
        binding.rcList.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = ProfileAccountFragmentAdapter(dataDummy()){ data, posistion ->
                Toast.makeText(context, "coconut profile", Toast.LENGTH_SHORT).show();
            }
        }
    }

}