package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityBca1Sem2CplusshowcateBinding

class BCA1SEM2CPLUSSHOWCATE : AppCompatActivity() {
    lateinit var binding:ActivityBca1Sem2CplusshowcateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBca1Sem2CplusshowcateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url2021Notes=" https://drive.google.com/file/d/1Z6jYcl4IflYx65NTYwDA29KSbIb3PKUs/view?usp=drivesdk"
        val url2022Notes=" https://drive.google.com/file/d/1U6XngFMJgaaevdAoa-_1XThxx5KA9VrL/view?usp=drivesdk"



        val url2014Ques=" https://drive.google.com/uc?export=download&id=1F9zlgQPBGeraojAwfYyMhnxREDuGHiEV"
        val url2015Ques=" https://drive.google.com/uc?export=download&id=1FTw_YSYNXhVEoYNsISTLmddhHHyG3wES"
        val url2017Ques=" https://drive.google.com/uc?export=download&id=1G0HdkPQfM7PXD2L7D1JU8AH-1gfM4uMq"
        val url2022Ques=" https://drive.google.com/uc?export=download&id=1DDPL_dD5PEENygiPKeTpuvFOekQdnTE6"



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



        binding.cplus2014Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2014Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }
        binding.cplus2015Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2015Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.cplus2017Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2017Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.cplus2022Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2022Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }





    }
}