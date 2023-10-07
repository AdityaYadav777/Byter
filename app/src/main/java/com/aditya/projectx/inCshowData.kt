package com.aditya.projectx

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityInCshowDataBinding

class inCshowData : AppCompatActivity() {
    lateinit var binding:ActivityInCshowDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityInCshowDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url2021Notes=" https://drive.google.com/file/d/1EzYg7ykOa6tvEh3duMbBAK5ngHvhBwg0/view?usp=drivesdk"
        val url2022Notes=" https://drive.google.com/file/d/1oyGYqwVTkQGFbAAoE-ptiIW5bGHAL4MM/view?usp=drivesdk"



        val url2015Ques=" https://api.bcapoints.in/public/Introduction%20to%20C%20language%202015.pdf"
        val url2017Ques=" https://api.bcapoints.in/public/Introduction%20to%20C%20language%202017.pdf"
        val url2018Ques=" https://api.bcapoints.in/public/Introduction%20to%20C%20language%202018.pdf"
        val url2019Ques=" https://api.bcapoints.in/public/Introduction%20to%20C%20language%202019.pdf"
        val url2020Ques=" https://api.bcapoints.in/public/C%20language%202020-21.pdf"
        val url2022Ques="https://drive.google.com/uc?export=download&id=1CmIEW4NRl9GM5m5ps6d56J-nJ_s9WsUB"


        binding.note2021.setOnClickListener {

 val i=Intent(this,NotesAct::class.java)
            i.putExtra("noteUrl",url2021Notes)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_SHORT).show()
            startActivity(i)

        }

        binding.note2022.setOnClickListener {


            val i=Intent(this,NotesAct::class.java)
            i.putExtra("noteUrl",url2022Notes)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_SHORT).show()
            startActivity(i)
        }



        binding.c2015Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2015Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }
        binding.c2017Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2017Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.c2018Ques.setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2018Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.c2019Ques.setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2019Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.c2020Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2020Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.c2022Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2022Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

    }


}