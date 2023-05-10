package com.maspam.foodmarketkotlin.ui.profile.foodmarket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.maspam.foodmarketkotlin.R
import com.maspam.foodmarketkotlin.databinding.FragmentProfileAccountBinding
import com.maspam.foodmarketkotlin.databinding.FragmentProfileBinding
import com.maspam.foodmarketkotlin.model.dummy.ProfileMenuModel


class ProfileFoodMarketFragment : Fragment() {

    private var _binding: FragmentProfileAccountBinding? = null
    private val binding: FragmentProfileAccountBinding get() = _binding!!

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
        startRecyclerActivity()
    }

    fun dataDummy(): ArrayList<ProfileMenuModel> {
        data = ArrayList()
        data.add(ProfileMenuModel("Rate App"))
        data.add(ProfileMenuModel("Help Center"))
        data.add(ProfileMenuModel("Privacy & Policy"))
        data.add(ProfileMenuModel("Terms & Condition"))
        return data
    }

    fun startRecyclerActivity() {
        binding.rcList.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ProfileFoodMarketFragmentAdapter(dataDummy()){ data, position ->
                Toast.makeText(context, "ini Food market", Toast.LENGTH_SHORT).show()
            }
        }
    }

}