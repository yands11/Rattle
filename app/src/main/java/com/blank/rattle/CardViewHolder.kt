package com.blank.rattle

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(simpleCard: SimpleCard) {
        itemView.findViewById<ImageView>(R.id.iv_photo).run {
            Glide.with(context).load(simpleCard.photoUrl).into(this)
        }
        itemView.findViewById<TextView>(R.id.tv_title).run {
            text = simpleCard.title
        }
    }
}
