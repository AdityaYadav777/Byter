package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditya.projectx.databinding.ActivityBca2Sem3SubjectsBinding

class BCA2SEM3SUBJECTS : AppCompatActivity() {
    lateinit var binding :ActivityBca2Sem3SubjectsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBca2Sem3SubjectsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sem3os.setOnClickListener {
            startActivity(Intent(this,inOsShowCate::class.java))
        }

binding.sem3math.setOnClickListener {
    startActivity(Intent(this,Bca2sem3mathShow::class.java))
}

        binding.sem3dsa.setOnClickListener {
startActivity(Intent(this,Bca2Sem3DsaShow::class.java))
        }

    binding.sem3coa.setOnClickListener {

startActivity(Intent(this,Bca2Sem3CoaShow::class.java))
    }


    }
}