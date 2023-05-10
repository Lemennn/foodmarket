package com.maspam.foodmarketkotlin.helpers

import android.widget.TextView
import java.lang.Double.parseDouble
import java.text.DecimalFormat

object ToIDR {

    fun TextView.formatPrice(value: String){
        this.text = toIDR(parseDouble(value))
    }

    private fun toIDR(value: Double): String{
        val data = DecimalFormat("#,###,###")
        return "IDR "+data.format(value).replace(",".toRegex(), ".")
    }

}