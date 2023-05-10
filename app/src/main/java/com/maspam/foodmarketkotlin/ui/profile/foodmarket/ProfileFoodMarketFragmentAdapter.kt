package com.maspam.foodmarketkotlin.ui.profile.foodmarket

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.maspam.foodmarketkotlin.databinding.ItemMenuProfileBinding
import com.maspam.foodmarketkotlin.model.dummy.ProfileMenuModel


class ProfileFoodMarketFragmentAdapter(
    private val listAdapter: List<ProfileMenuModel>,
    private var callback : (ProfileMenuModel, Int) -> Unit
) : RecyclerView.Adapter<ProfileFoodMarketFragmentAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemMenuProfileBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.getBind(listAdapter[position])
        holder.itemView.setOnClickListener {
            callback(listAdapter[position], position)
        }

    }

    override fun getItemCount(): Int {
        return listAdapter.size
    }

    inner class ViewHolder (var binding: ItemMenuProfileBinding) : RecyclerView.ViewHolder(binding.root){

        fun getBind (data: ProfileMenuModel) {
            binding.tvTitle.text = data.title
        }
    }


}