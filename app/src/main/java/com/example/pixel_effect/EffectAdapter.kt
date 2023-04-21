package com.example.pixel_effect_

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide

class EffectAdapter(effectClick: EffectClick) :RecyclerView.Adapter<EffectAdapter.EffectHolder>() {


    var click=effectClick

    class EffectHolder(itemView:View):ViewHolder(itemView){
        var imgEffect=itemView.findViewById<ImageView>(R.id.imgEffect)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EffectHolder {
        return EffectHolder(LayoutInflater.from(parent.context).inflate(R.layout.effect_item,parent,false))
    }

    override fun getItemCount(): Int {
        return 23
    }

    override fun onBindViewHolder(holder: EffectHolder, position: Int) {
        Glide.with(holder.itemView.context).load(Home_Activity.uri).into(holder.imgEffect)

        when(position){
            0-> Effect.applyEffectNone(holder.imgEffect)
            1-> Effect.applyEffect1(holder.imgEffect)
            2-> Effect.applyEffect2(holder.imgEffect)
            3-> Effect.applyEffect3(holder.imgEffect)
            4-> Effect.applyEffect4(holder.imgEffect)
            5-> Effect.applyEffect5(holder.imgEffect)
            6-> Effect.applyEffect6(holder.imgEffect)
            7-> Effect.applyEffect7(holder.imgEffect)
            8-> Effect.applyEffect8(holder.imgEffect)
            9-> Effect.applyEffect9(holder.imgEffect)
            10-> Effect.applyEffect10(holder.imgEffect)
            11-> Effect.applyEffect11(holder.imgEffect)
            12-> Effect.applyEffect12(holder.imgEffect)
            13-> Effect.applyEffect13(holder.imgEffect)
            14-> Effect.applyEffect14(holder.imgEffect)
            15-> Effect.applyEffect15(holder.imgEffect)
            16-> Effect.applyEffect16(holder.imgEffect)
            17-> Effect.applyEffect17(holder.imgEffect)
            18-> Effect.applyEffect18(holder.imgEffect)
            19-> Effect.applyEffect19(holder.imgEffect)
            20-> Effect.applyEffect20(holder.imgEffect)
            21-> Effect.applyEffect21(holder.imgEffect)
            22-> Effect.applyEffect22(holder.imgEffect)

        }

        holder.itemView.setOnClickListener {
            click.clickEffect(position)

        }
    }
}


