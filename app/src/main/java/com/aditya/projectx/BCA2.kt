package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditya.projectx.databinding.ActivityBca2Binding

class BCA2 : AppCompatActivity() {

    lateinit var binding:ActivityBca2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBca2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sem3.setOnClickListener {

            startActivity(Intent(this,BCA2SEM3SUBJECTS::class.java))

        }
        binding.sem4.setOnClickListener {

            startActivity(Intent(this,SEM4SUBJECTS::class.java))

        }




    }
}