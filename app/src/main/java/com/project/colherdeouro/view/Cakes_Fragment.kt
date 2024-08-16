package com.project.colherdeouro.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.toColorInt
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.colherdeouro.R
import com.project.colherdeouro.model.Cakes
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


        adapter.add(CakesItem(Cakes("Chocolate", 0xFFa9550c)))
        adapter.add(CakesItem(Cakes("Morango", 0XFFce4448)))
        adapter.add(CakesItem(Cakes("Cenoura", 0xFFFF5722)))
        adapter.add(CakesItem(Cakes("Milho Verde", 0xFFa8c545)))
        adapter.add((CakesItem(Cakes("Coco", 0xFFFdceae))))

        adapter.notifyDataSetChanged()
    }


}