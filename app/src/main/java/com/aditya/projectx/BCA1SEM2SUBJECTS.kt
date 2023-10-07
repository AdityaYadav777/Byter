package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditya.projectx.databinding.ActivityBca1Sem2SubjectsBinding

class BCA1SEM2SUBJECTS : AppCompatActivity() {

    lateinit var binding:ActivityBca1Sem2SubjectsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBca1Sem2SubjectsBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.sem2Math.setOnClickListener {

            startActivity(Intent(this,BCA1SEM2MATHSHOWCATE::class.java))
        }

        binding.sem2Accounting.setOnClickListener {

startActivity(Intent(this,BCA1SEM2ACCOUNTINGSHOWCATE::class.java))

        }

        binding.sem2Cplus.setOnClickListener {

startActivity(Intent(this,BCA1SEM2CPLUSSHOWCATE::class.java))

        }

        binding.sem2Dld.setOnClickListener {

startActivity(Intent(this,BCA1SEM2DLDSHOWCATE::class.java))
        }


    }
}