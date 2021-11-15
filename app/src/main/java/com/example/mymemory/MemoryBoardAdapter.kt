package com.example.mymemory

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.min

class MemoryBoardAdapter(private val context: Context, private val numPieces: Int) :
     RecyclerView.Adapter<MemoryBoardAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val cardWidth : Int = parent.width / 2
        val carHeight : Int = parent.height / 4
        val cardSideLength : Int = min(cardWidth, carHeight)

        val view : View = LayoutInflater.from(context).inflate(R.layout.mamory_card, parent, false)

        val layoutParams : ViewGroup.LayoutParams = view.findViewById<CardView>(R.id.cardView).layoutParams
        layoutParams.width = cardSideLength
        layoutParams.height = cardSideLength

        return ViewHolder(view)

     }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      //  holder.bind(position)
    }

    override fun getItemCount() = numPieces

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int) {

        }
    }

}
