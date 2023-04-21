package com.example.pixel_effect_

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pixel_effect_.databinding.ActivityHomeBinding


class Home_Activity : AppCompatActivity() {
    lateinit var  binding: ActivityHomeBinding

    companion object{
      lateinit var uri: Uri
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

     binding.stat.setOnClickListener {
         var intent=Intent(Intent.ACTION_GET_CONTENT)
         intent.type="image/*"
         startActivityForResult(intent,45)
     }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode== RESULT_OK){
            if (requestCode==45)
                uri=data?.data!!
            startActivity(Intent(this, Img_Show::class.java))
        }
    }
}