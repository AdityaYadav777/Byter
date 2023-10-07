package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditya.projectx.databinding.ActivityBca1Binding

class BCA1 : AppCompatActivity() {
    lateinit var binding:ActivityBca1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBca1Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.BCA1SEM1.setOnClickListener {

startActivity(Intent(this,BCA1SEM1CHATE::class.java))


        }

        binding.BCA1SEM2.setOnClickListener {

            startActivity(Intent(this,BCA1SEM2SUBJECTS::class.java))

        }





    }
}