package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditya.projectx.databinding.ActivityBca1Sem1ChateBinding

class BCA1SEM1CHATE : AppCompatActivity() {

    lateinit var binding:ActivityBca1Sem1ChateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityBca1Sem1ChateBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.itTools.setOnClickListener {
            startActivity(Intent(this,inITtoolsShowCete::class.java))
        }

        binding.math.setOnClickListener {


            startActivity(Intent(this,inMathShowCate ::class.java))

        }
        binding.c.setOnClickListener {

startActivity(Intent(this,inCshowData::class.java))

        }

        binding.english.setOnClickListener {

            startActivity(Intent(this,inEnglishShowCate::class.java))

        }








    }
}