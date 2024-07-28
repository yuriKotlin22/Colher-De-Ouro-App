package com.project.colherdeouro.view

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.project.colherdeouro.R
import com.project.colherdeouro.model.Cakes
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class CakesItem (private val cakes: Cakes) : Item<CakesItem.CakesViewHolder>() {

    class CakesViewHolder(view: View) : GroupieViewHolder(view)

    override fun createViewHolder(itemView: View): CakesViewHolder {
        return CakesViewHolder(itemView)
    }

    override fun bind(viewHolder: CakesViewHolder, position: Int) {

        viewHolder.itemView.findViewById<LinearLayout>(R.id.container_cake).setBackgroundColor(cakes.bgColor.toInt())
        viewHolder.itemView.findViewById<TextView>(R.id.txt_cake).text = cakes.name
    }

    override fun getLayout(): Int {
        return R.layout.item_list_cakes
    }


}