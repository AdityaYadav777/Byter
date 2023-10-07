package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityInOsShowCateBinding

class inOsShowCate : AppCompatActivity() {
    lateinit var binding:ActivityInOsShowCateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityInOsShowCateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url2021Notes=" https://drive.google.com/file/d/1Q3jcQTTkERvkQVGdUxElx0SPhlV9EBjc/view?usp=drivesdk"
        val url2022Notes=" https://drive.google.com/file/d/1VZHnjBYqAPtn7qzJDzw_HkIZAkJ8SF0T/view?usp=drivesdk"




        val url2019Ques=" https://drive.google.com/uc?export=download&id=1GOH21SqmLVifcvJt3qq5HG14-fs6FfWR"
        val url2020Ques=" https://drive.google.com/uc?export=download&id=1GDbIXL7IlEpFcUmQ0zymGJXSKU7FW1Ba"
        val url2022Ques=" https://api.bcapoints.in/public/Operating%20system%20paper%202021-22.pdf"
        val url2023Ques=" https://api.bcapoints.in/public/Operating%20System%202022-23%20(1)_compressed.pdf"



        binding.note2021.setOnClickListener {
            val intent = Intent(this, NotesAct ::class.java)
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



        binding.os2019Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2019Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }
        binding.os2020Ques.setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2020Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }



        binding.os2022Ques.setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2022Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.os2023Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2023Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }


    }
}