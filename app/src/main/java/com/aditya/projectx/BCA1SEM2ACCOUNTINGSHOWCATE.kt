package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityBca1Sem2AccountingshowcateBinding

class BCA1SEM2ACCOUNTINGSHOWCATE : AppCompatActivity() {
    lateinit var binding:ActivityBca1Sem2AccountingshowcateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBca1Sem2AccountingshowcateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url2021Notes=" https://drive.google.com/file/d/1UbLc9akwI-ifdvCgteBOhfvkRE8d92Lb/view?usp=drivesdk"




        val url2017Ques="https://drive.google.com/uc?export=download&id=1F4WMnNXi-jfu0eMgyYOienD7yfqLEkU2"
        val url2022Ques=" https://api.bcapoints.in/public/Financial%20Accounting%20BCA%202nd%20Sem.pdf"
        val url2023Ques="https://drive.google.com/uc?export=download&id=1De4TFi7DYELfJbdtcuCg7qQa9Xu0WrTl"



        binding.note2021.setOnClickListener {
            val intent = Intent(this, NotesAct::class.java)
            intent.putExtra("noteUrl", url2021Notes)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)
        }


        binding.account2017Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2017Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }
        binding.account2022Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2022Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.account2023Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2023Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }




    }
}