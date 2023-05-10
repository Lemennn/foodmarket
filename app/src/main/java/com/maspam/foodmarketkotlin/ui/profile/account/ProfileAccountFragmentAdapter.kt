package com.maspam.foodmarketkotlin.ui.profile.account

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.maspam.foodmarketkotlin.R
import com.maspam.foodmarketkotlin.databinding.ItemHomeHorizontalBinding
import com.maspam.foodmarketkotlin.databinding.ItemMenuProfileBinding
import com.maspam.foodmarketkotlin.model.dummy.HomeModel
import com.maspam.foodmarketkotlin.model.dummy.ProfileMenuModel


class ProfileAccountFragmentAdapter(
    private val listAdapter: List<ProfileMenuModel>,
    private var callback : (ProfileMenuModel, Int) -> Unit
) : RecyclerView.Adapter<ProfileAccountFragmentAdapter.ViewHolder>() {

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