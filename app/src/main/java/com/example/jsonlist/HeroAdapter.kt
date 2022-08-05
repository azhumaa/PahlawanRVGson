package com.example.jsonlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jsonlist.databinding.RowItemBinding

class HeroAdapter(private val heroList: List<DaftarPahlawanItem>) :
RecyclerView.Adapter<HeroAdapter.HeroViewHolder>(){

    class HeroViewHolder(val binding : RowItemBinding ) :RecyclerView.ViewHolder(binding.root) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroAdapter.HeroViewHolder = HeroViewHolder(
        RowItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )


    override fun onBindViewHolder(holder: HeroViewHolder, i: Int) {
        holder.binding.apply {
            tvName.text = heroList[i].nama
            tvDetail.text = heroList[i].history

            Glide.with(imgHero)
                .load(heroList)

        }
    }

    override fun getItemCount(): Int {
       return heroList.size
    }
}