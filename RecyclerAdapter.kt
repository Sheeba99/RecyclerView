package com.example.recycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var title = arrayOf("Chapter One", "Chapter Two", "Chapter Three", "Chapter Four", "Chapter Five", " Chapter Six", "Chapter Seven", "Chapter Eight", "Chapter Nine", "Chapter Ten")
    private var detail = arrayOf("Details of Chapter one", "Details of Chapter two", "Details of Chapter three", "Details of Chapter four", "Details of Chapter five", "Details of Chapter six", "Details of Chapter seven", "Details of Chapter eight", "Details of Chapter nine", "Details of Chapter ten")
    private var image = intArrayOf(R.drawable.eight, R.drawable.eight, R.drawable.eight, R.drawable.eight, R.drawable.eight, R.drawable.eight, R.drawable.eight, R.drawable.eight, R.drawable.eight, R.drawable.eight, R.drawable.eight)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
         return title.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ItemTitle.text = title[position]
        holder.ItemDetails.text = detail[position]
        holder.ItemImage.setImageResource(image[position])
    }


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            var ItemImage : ImageView
            var ItemTitle : TextView
            var ItemDetails : TextView

            init{
                ItemImage = itemView.findViewById(R.id.item_image)
                ItemTitle = itemView.findViewById(R.id.item_title)
                ItemDetails = itemView.findViewById(R.id.item_details)


                itemView.setOnClickListener {
                    val position : Int = adapterPosition
                    Toast.makeText(itemView.context, "you clicked on ${title[position]}", Toast.LENGTH_LONG).show()
                }
            }

    }

}