package com.example.recyclerview_practice

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview_practice.databinding.ItemMusicBinding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

//  Create adapter

//                  Get a data     -     Extend of RecyclerView.Adapter
class MusicAdapter (private val data :ArrayList<Music> ) :RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

//    Create an inner class for viewHolder              -              Extend of RecyclerView.ViewHolder
    inner class MusicViewHolder(private val binding: ItemMusicBinding) :RecyclerView.ViewHolder(binding.root){

//        Create a function for set data at correct position
        fun bindData(position :Int) {

            binding.txtName.text = data[position].name
            binding.txtInfo.text = data[position].info

            Glide
                .with(binding.root.context)
                .load(data[position].urlImg)
                .transform(RoundedCornersTransformation(16, 4))
                .into(binding.imgView)

        }

    }

//    Override adapters functions
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {

        Log.v("test", "view created")

        val binding = ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MusicViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {

        Log.v("test", "view binded")

        holder.bindData(position)

    }

    override fun getItemCount(): Int {
        return data.size
    }

}