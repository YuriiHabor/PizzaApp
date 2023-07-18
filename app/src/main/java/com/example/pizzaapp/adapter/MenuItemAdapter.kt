package com.example.pizzaapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzaapp.R
import com.example.pizzaapp.model.MenuItem

class MenuItemAdapter(
    private val context: Context,
    private val dataset: List<MenuItem>
): RecyclerView.Adapter<MenuItemAdapter.MenuItemViewHolder>() {

    class MenuItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val pizzaNameTextView: TextView = view.findViewById(R.id.pizza_name)
        val pizzaIngradientsTextView: TextView = view.findViewById(R.id.pizza_ingradients)
        val pizzaPriceTextView: TextView = view.findViewById(R.id.pizza_price)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.menu_item, parent, false)

        return MenuItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: MenuItemViewHolder, position: Int) {
        val item = dataset[position]

        holder.pizzaNameTextView.text = "Name: ${item.pizzaName}"
        holder.pizzaIngradientsTextView.text = "Ingradients: ${item.pizzaIngradients.joinToString()}"
        holder.pizzaPriceTextView.text = "Price: ${item.price}"
    }

    override fun getItemCount(): Int = dataset.size

}