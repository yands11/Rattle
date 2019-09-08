package com.blank.rattle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class RattleAdapter : RecyclerView.Adapter<CardViewHolder>() {

    private val sampleData by lazy {
        listOf(
            SimpleCard("Leaves", "https://images.unsplash.com/photo-1566405382187-a5937a822773?ixlib=rb-1.2.1&auto=format&fit=crop&w=635&q=80"),
            SimpleCard("Apartment", "https://images.unsplash.com/photo-1567320743368-9db24e12ebf0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=765&q=80"),
            SimpleCard("Tomato", "https://images.unsplash.com/photo-1564874997803-e4d589d5fd41?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80"),
            SimpleCard("Turtle", "https://images.unsplash.com/photo-1416138645715-930585fe4ce2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80"),
            SimpleCard("Forest", "https://images.unsplash.com/photo-1566764619071-ee3076202587?ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80"),
            SimpleCard("Waterfall", "https://images.unsplash.com/photo-1560269570-bb65ba82fcf6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80"),
            SimpleCard("Cake", "https://images.unsplash.com/photo-1565605926614-8b9928ef9b03?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80"),
            SimpleCard("Dog", "https://images.unsplash.com/photo-1524698604136-5a02fb1f7ec9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80")
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder =
        CardViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.holder_simple_card, parent, false)
        )

    override fun getItemCount(): Int = sampleData.size

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) =
        holder.bind(sampleData[position])

}