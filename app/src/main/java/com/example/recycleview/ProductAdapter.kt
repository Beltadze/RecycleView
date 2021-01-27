package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProductAdapter(private val masivisMnishvneloba: List<Product>): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){

    class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val tagvet = LayoutInflater.from(parent.context).inflate(R.layout.character_item, parent, false)

        return ProductViewHolder(tagvet)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val tagSize = masivisMnishvneloba[position]
        Glide.with(holder.imageView.context)
                .load(tagSize.url)
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.imageView)
    }

    override fun getItemCount(): Int = masivisMnishvneloba.size

}