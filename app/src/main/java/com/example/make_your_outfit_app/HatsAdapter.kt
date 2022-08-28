package com.example.make_your_outfit_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.make_your_outfit_app.items.Hats

class HatsAdapter (private val HatsList : ArrayList<Hats>) : RecyclerView.Adapter<HatsAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.clothing_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = HatsList[position]
        holder.hatImages.setImageResource(currentItem.hatImage)
    }

    override fun getItemCount(): Int {
        return HatsList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val hatImages : ImageView = itemView.findViewById(R.id.ClothingPicture)
    }
}