package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityInMathShowCateBinding

class inMathShowCate : AppCompatActivity() {
    lateinit var binding:ActivityInMathShowCateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityInMathShowCateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val urlUnit1Notes=" https://drive.google.com/file/d/1CVaoZbYSqV6ol_iOhQl2istvSub8BAks/view?usp=drivesdk"
        val urlUnit2Notes="https://drive.google.com/file/d/1ldf5NbgwlvZ83VJJZM_s8HX9F-ls91WH/view?usp=drivesdk"
        val urlUnit3Notes=" https://drive.google.com/file/d/1-j5qyoSDgGYS6XLFhVE9T7vR0sAJhZPi/view?usp=drivesdk"
        val urlUnit4Notes=" https://drive.google.com/file/d/1I-izi4EtZ6ae295ZMQZH-FeWu9UJ5Pg3/view?usp=drivesdk"



        val url2015Ques=" https://api.bcapoints.in/public/Mathematics2015.pdf"
        val url2016Ques=" https://api.bcapoints.in/public/Mathematics2016.pdf"
        val url2017Ques=" https://api.bcapoints.in/public/Mathematics2017.pdf"
        val url2018Ques=" https://api.bcapoints.in/public/Mathematics2018.pdf"
        val url2019Ques=" https://api.bcapoints.in/public/Mathematics2019.pdf"



        binding.note2021.setOnClickListener {
            val intent = Intent(this, NotesAct::class.java)
            intent.putExtra("noteUrl", urlUnit1Notes)
            Toast.makeText(this,"Wait For Few Seconds", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
        binding.note2022.setOnClickListener {
            val intent = Intent(this, NotesAct::class.java)
            intent.putExtra("noteUrl", urlUnit2Notes)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.note2023.setOnClickListener {
            val intent = Intent(this, NotesAct::class.java)
            intent.putExtra("noteUrl", urlUnit3Notes)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.note2024.setOnClickListener {
            val intent = Intent(this, NotesAct::class.java)
            intent.putExtra("noteUrl", urlUnit4Notes)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }


        binding.mathQues2015 .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2015Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }
        binding.mathQues2016 .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2016Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.mathQues2017 .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2017Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.mathQues2018.setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2018Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.mathQues2019.setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2019Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }


    }
}