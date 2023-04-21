package com.example.pixel_effect_

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pixel_effect_.databinding.ActivityImgShowBinding

class Img_Show : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding= ActivityImgShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgMain.setImageURI(Home_Activity.uri)

        var effectClick=object :EffectClick{
            override fun clickEffect(pos: Int) {
                when(pos){

                    0-> Effect.applyEffectNone(binding.imgMain)
                    1-> Effect.applyEffect1(binding.imgMain)
                    2-> Effect.applyEffect2(binding.imgMain)
                    3-> Effect.applyEffect3(binding.imgMain)
                    4-> Effect.applyEffect4(binding.imgMain)
                    5-> Effect.applyEffect5(binding.imgMain)
                    6-> Effect.applyEffect6(binding.imgMain)
                    7-> Effect.applyEffect7(binding.imgMain)
                    8-> Effect.applyEffect8(binding.imgMain)
                    9-> Effect.applyEffect9(binding.imgMain)
                    10-> Effect.applyEffect10(binding.imgMain)
                    11-> Effect.applyEffect11(binding.imgMain)
                    12-> Effect.applyEffect12(binding.imgMain)
                    13-> Effect.applyEffect13(binding.imgMain)
                    14-> Effect.applyEffect14(binding.imgMain)
                    15-> Effect.applyEffect15(binding.imgMain)
                    16-> Effect.applyEffect16(binding.imgMain)
                    17-> Effect.applyEffect17(binding.imgMain)
                    18-> Effect.applyEffect18(binding.imgMain)
                    19-> Effect.applyEffect19(binding.imgMain)
                    20-> Effect.applyEffect20(binding.imgMain)
                    21-> Effect.applyEffect21(binding.imgMain)
                    22-> Effect.applyEffect22(binding.imgMain)


                }
            }
    }
            binding.recyclefilter.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
            binding.recyclefilter.adapter=EffectAdapter(effectClick)


        }

}