package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityBca1Sem2DldshowcateBinding

class BCA1SEM2DLDSHOWCATE : AppCompatActivity() {
    lateinit var binding:ActivityBca1Sem2DldshowcateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBca1Sem2DldshowcateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val url2021Notes="https://drive.google.com/file/d/1G6upiOLXUm7H9HxqopJJ82sDaVUcRwVN/view?usp=drivesdk"
        val url2022Notes=" https://drive.google.com/file/d/1UX3uTKYWbmthiWv3pjK8z6eTER3JrXRb/view?usp=drivesdk"




        val url2018Ques=" https://drive.google.com/uc?export=download&id=1G6CV1lwi3S8nLo2bfybOxXLL6T6wWZ3n"
        val url2022Ques=" https://api.bcapoints.in/public/Digital%20Circuit%20BCA%202nd%20Sem.pdf"



        binding.note2021.setOnClickListener {
            val intent = Intent(this, NotesAct::class.java)
            intent.putExtra("noteUrl", url2021Notes)
            Toast.makeText(this,"Wait For Few Seconds", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
        binding.note2022.setOnClickListener {
            val intent = Intent(this, NotesAct::class.java)
            intent.putExtra("noteUrl", url2022Notes)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }



        binding.dld2018Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2018Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }
        binding.dld2022Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2022Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }



    }
}