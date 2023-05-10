package com.maspam.foodmarketkotlin.ui.home.newtaste

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.maspam.foodmarketkotlin.R
import com.maspam.foodmarketkotlin.databinding.ItemHomeVerticalBinding
import com.maspam.foodmarketkotlin.helpers.ToIDR.formatPrice

import com.maspam.foodmarketkotlin.model.dummy.HomeVerticalModel


class HomeNewTasteAdapter(
    private val listAdapter: List<HomeVerticalModel>,
    private var callback : (HomeVerticalModel, Int) -> Unit
) : RecyclerView.Adapter<HomeNewTasteAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemHomeVerticalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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

    inner class ViewHolder (var binding: ItemHomeVerticalBinding) : RecyclerView.ViewHolder(binding.root){

        fun getBind (data: HomeVerticalModel) {
            binding.tvTitle.text = data.title
            binding.tvPrice.formatPrice(data.price)
            binding.ratingBar.rating = data.rating

            Glide.with(binding.root)
                .load(data.src)
                .placeholder(R.drawable.img)
                .error(R.drawable.img)
                .into(binding.ivPoster)

        }
    }


}