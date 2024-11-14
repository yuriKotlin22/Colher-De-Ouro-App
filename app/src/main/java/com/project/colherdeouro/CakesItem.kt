package com.project.colherdeouro

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.project.colherdeouro.R
import com.project.colherdeouro.model.Food
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class CakesItem (private val cakes: Food) : Item<CakesItem.CakesViewHolder>() {

    class CakesViewHolder(view: View) : GroupieViewHolder(view)

    override fun createViewHolder(itemView: View): CakesViewHolder {
        return CakesViewHolder(itemView)
    }

    override fun bind(viewHolder: CakesViewHolder, position: Int) {

//        viewHolder.itemView.findViewById<LinearLayout>(R.id.container_item).setBackgroundColor(cakes.bgColor.toInt())
        viewHolder.itemView.findViewById<TextView>(R.id.txt_item).text = cakes.name
    }

    override fun getLayout(): Int {
        return R.layout.item_list_cakes
    }

}