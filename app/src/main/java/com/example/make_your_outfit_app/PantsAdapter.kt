package com.example.make_your_outfit_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.make_your_outfit_app.items.Pants
import com.example.make_your_outfit_app.items.TShirts

class PantsAdapter (private val PantsList : ArrayList<Pants>) : RecyclerView.Adapter<PantsAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.clothing_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = PantsList[position]
        holder.pantsImages.setImageResource(currentItem.pantsImage)
    }

    override fun getItemCount(): Int {
        return PantsList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val pantsImages : ImageView = itemView.findViewById(R.id.ClothingPicture)
    }
}