package com.maspam.foodmarketkotlin.ui.home.popular

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.maspam.foodmarketkotlin.R
import com.maspam.foodmarketkotlin.databinding.FragmentHomeNewTasteBinding
import com.maspam.foodmarketkotlin.model.dummy.HomeVerticalModel
import com.maspam.foodmarketkotlin.ui.home.newtaste.HomeNewTasteAdapter

class HomePopularFragment : Fragment() {

    private var data: ArrayList<HomeVerticalModel> = ArrayList()

    private var _binding: FragmentHomeNewTasteBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeNewTasteBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()

        startRecyclerView()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun dataDummy() : ArrayList<HomeVerticalModel>{
        data = ArrayList()
        data.add(HomeVerticalModel("Kacang", "1000", 4f, ""))
        data.add(HomeVerticalModel("Kacang", "1000", 4f, ""))
        data.add(HomeVerticalModel("Kacang", "1000", 4f, ""))
        data.add(HomeVerticalModel("Kacang", "1000", 4f, ""))
        return data
    }

    private fun startRecyclerView() {
        binding.rcList.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = HomeNewTasteAdapter(dataDummy()){ data, position ->
                Toast.makeText(context, "TextVertical", Toast.LENGTH_SHORT).show()
            }
        }
    }

}