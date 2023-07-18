package com.example.pizzaapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzaapp.adapter.MenuItemAdapter
import com.example.pizzaapp.data.MenuData

class PizzaMenuFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataSource = MenuData().loadMenu()

        val recyclerView = view.findViewById<RecyclerView>(R.id.menu_recycler_view)
        recyclerView.adapter = MenuItemAdapter(view.context, dataSource)

        recyclerView.layoutManager = LinearLayoutManager(view.context)

        recyclerView.setHasFixedSize(true)
    }
}