package com.project.colherdeouro.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.colherdeouro.CakesItem
import com.project.colherdeouro.R
import com.project.colherdeouro.model.Food
import com.xwray.groupie.GroupieAdapter

class Cakes_Fragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cakes,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvCakes = view.findViewById<RecyclerView>(R.id.rv_itens)
        rvCakes.layoutManager = LinearLayoutManager(requireContext())

        val adapter = GroupieAdapter()
        rvCakes.adapter = adapter


        adapter.add(CakesItem(Food("Chocolate", 0xFFa9550c)))
        adapter.add(CakesItem(Food("Morango", 0xFFa9550c)))
        adapter.add(CakesItem(Food("Cenoura", 0xFFa9550c)))
        adapter.add(CakesItem(Food("Milho Verde", 0xFFa9550c)))
        adapter.add((CakesItem(Food("Coco", 0xFFa9550c))))

        adapter.notifyDataSetChanged()
    }


}