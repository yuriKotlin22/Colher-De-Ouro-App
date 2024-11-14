package com.project.colherdeouro.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.colherdeouro.DishesItem
import com.project.colherdeouro.R
import com.project.colherdeouro.model.Food
import com.xwray.groupie.GroupieAdapter

class Dishes_Fragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dishes,container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvCakes = view.findViewById<RecyclerView>(R.id.rv_itens)
        rvCakes.layoutManager = LinearLayoutManager(requireContext())

        val adapter = GroupieAdapter()
        rvCakes.adapter = adapter


        adapter.add(DishesItem(Food("Strogonoff de frango",0xFF1c1d21)))
        adapter.add(DishesItem(Food("Feijoada", 0xFF1c1d21)))
        adapter.add(DishesItem(Food("Moqueca de peixe", 0xFF1c1d21)))
        adapter.add(DishesItem(Food("Bobó de camarão", 0xFF1c1d21)))
        adapter.add((DishesItem(Food("Baião de dois", 0xFF1c1d21))))
        adapter.add((DishesItem(Food("Arroz carreteiro", 0xFF1c1d21))))

        adapter.notifyDataSetChanged()
    }

}