package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityBca2sem3mathShowBinding

class Bca2sem3mathShow : AppCompatActivity() {
    lateinit var binding:ActivityBca2sem3mathShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBca2sem3mathShowBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val url2021Notes=" https://drive.google.com/file/d/1NhclysbU2EIlBFLXB6UK9H7NwiQjGznd/view?usp=drivesdk"




        val url2018Ques=" https://drive.google.com/uc?export=download&id=1Gm0AXtdGRI_vi_naMHcz2vUR42Lg6uBa"
        val url2019Ques=" https://drive.google.com/uc?export=download&id=1H3s6b9xI-ZqCivfDabRUfYzr5FMUHlOJ"
        val url2020Ques=" https://drive.google.com/uc?export=download&id=1Gm8W25OJMQ9aOY5oPxHQOn1jxJOTKSUh"
        val url2023Ques=" https://api.bcapoints.in/public/Computer%20Oriented%20Mathematic%202022-23.pdf"



        binding.note2021.setOnClickListener {
            val intent = Intent(this, NotesAct::class.java)
            intent.putExtra("noteUrl", url2021Notes)
            Toast.makeText(this,"Wait For Few Seconds", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }




        binding.math2018Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2018Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }
        binding.math2019Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2019Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.math2020Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2020Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.math2023Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2023Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }


    }
}