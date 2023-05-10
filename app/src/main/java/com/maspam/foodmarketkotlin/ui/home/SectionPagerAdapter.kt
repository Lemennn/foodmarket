package com.maspam.foodmarketkotlin.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.maspam.foodmarketkotlin.ui.home.newtaste.HomeNewTasteFragment
import com.maspam.foodmarketkotlin.ui.home.popular.HomePopularFragment
import com.maspam.foodmarketkotlin.ui.home.recommended.HomeRecommendedFragment

class SectionPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "New Taste"
            1 -> "Popular"
            2 -> "Recommended"
            else -> ""
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> HomeNewTasteFragment()
            1 -> HomePopularFragment()
            2 -> HomeRecommendedFragment()
            else -> HomeNewTasteFragment()
        }
    }
}