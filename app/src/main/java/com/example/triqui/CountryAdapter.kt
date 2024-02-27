package com.example.triqui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CountryAdapter(context: Context, countries: List<PaisesActivity.Country>) :
    ArrayAdapter<PaisesActivity.Country>(context, android.R.layout.simple_list_item_1, countries) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false)
        }

        val countryNameTextView = itemView!!.findViewById<TextView>(android.R.id.text1)
        countryNameTextView.text = getItem(position)?.name

        return itemView
    }
}