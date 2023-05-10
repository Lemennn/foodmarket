package com.maspam.foodmarketkotlin.ui.profile

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.maspam.foodmarketkotlin.ui.home.newtaste.HomeNewTasteFragment
import com.maspam.foodmarketkotlin.ui.home.popular.HomePopularFragment
import com.maspam.foodmarketkotlin.ui.home.recommended.HomeRecommendedFragment
import com.maspam.foodmarketkotlin.ui.profile.account.ProfileAccountFragment
import com.maspam.foodmarketkotlin.ui.profile.foodmarket.ProfileFoodMarketFragment

class SectionPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Account"
            1 -> "Food Market"
            else -> ""
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> ProfileAccountFragment()
            1 -> ProfileFoodMarketFragment()
            else -> HomeNewTasteFragment()
        }
    }
}