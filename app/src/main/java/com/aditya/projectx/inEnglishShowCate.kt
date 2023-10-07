package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityInEnglishShowCateBinding

class inEnglishShowCate : AppCompatActivity() {
    lateinit var binding:ActivityInEnglishShowCateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityInEnglishShowCateBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val url2021Notes=" https://drive.google.com/file/d/1S2W1g1LIb1POOrw1umFa2mOwqNWNVgud/view?usp=drivesdk"
        val url2022Notes=" https://drive.google.com/file/d/1SLSF1putdj8mqJR5CJUtOEZnqVEde2Gc/view?usp=drivesdk"


        val url2017Ques=" https://api.bcapoints.in/public/Functional%20English%202017.pdf"
        val url2018Ques=" https://api.bcapoints.in/public/Functional%20English%202018.pdf"
        val url2019Ques=" https://api.bcapoints.in/public/Functional%20English%202019.pdf"
        val url2020Ques=" https://firebasestorage.googleapis.com/v0/b/imagev1-b1697.appspot.com/o/Functional%20English%202020-21_compressed.pdf?alt=media&token=b9dcb2c7-b6c9-414b-a10b-bc4093937d80"
        val url2021Ques=" https://drive.google.com/uc?export=download&id=1DDPL_dD5PEENygiPKeTpuvFOekQdnTE6"
        val url2022Ques=" https://firebasestorage.googleapis.com/v0/b/imagev1-b1697.appspot.com/o/english2022.pdf?alt=media&token=0ead6654-714a-43b1-9600-9a6e0f256007"



        binding.note2021.setOnClickListener {
            val intent = Intent(this, NotesAct::class.java)
            intent.putExtra("noteUrl", url2021Notes)
            Toast.makeText(this,"Wait For Few Seconds", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }

        binding.note2022.setOnClickListener {
            val intent = Intent(this, NotesAct::class.java)
            intent.putExtra("noteUrl", url2022Notes)
            Toast.makeText(this,"Wait For Few Seconds", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
        binding.english2017Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2017Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }
        binding.english2018Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2018Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.english2019Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2019Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.english2020Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2020Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.english2021Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2021Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }
        binding.english2022Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2022Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }
    }
}