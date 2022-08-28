package com.example.make_your_outfit_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.make_your_outfit_app.items.Shoes
import com.example.make_your_outfit_app.items.TShirts

class ShoesAdapter (private val ShoesList : ArrayList<Shoes>) : RecyclerView.Adapter<ShoesAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.clothing_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = ShoesList[position]
        holder.tShirtImages.setImageResource(currentItem.shoesImage)
    }

    override fun getItemCount(): Int {
        return ShoesList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tShirtImages : ImageView = itemView.findViewById(R.id.ClothingPicture)
    }
}