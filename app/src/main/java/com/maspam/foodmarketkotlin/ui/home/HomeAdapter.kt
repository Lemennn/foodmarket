package com.maspam.foodmarketkotlin.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.maspam.foodmarketkotlin.R
import com.maspam.foodmarketkotlin.databinding.ItemHomeHorizontalBinding
import com.maspam.foodmarketkotlin.model.dummy.HomeModel



class HomeAdapter(
    private val listAdapter: List<HomeModel>,
    private val itemAdapterCallback: ItemAdapterCallback
) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemHomeHorizontalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.getBind(listAdapter[position], itemAdapterCallback )

    }

    override fun getItemCount(): Int {
        return listAdapter.size
    }

    inner class ViewHolder (var binding: ItemHomeHorizontalBinding) : RecyclerView.ViewHolder(binding.root){

        fun getBind (data: HomeModel, itemAdapterCallback: ItemAdapterCallback) {
            binding.tvTitle.text = data.title
            binding.ratingBar.rating = data.rating

            Glide.with(binding.root)
                .load(data.src)
                .placeholder(R.drawable.img)
                .error(R.drawable.img)
                .into(binding.ivPoster)
        }
    }

    interface ItemAdapterCallback{
        fun onClick(v: View, data: HomeModel)
    }
}