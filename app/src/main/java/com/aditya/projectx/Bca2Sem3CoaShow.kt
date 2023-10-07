package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityBca2Sem3CoaShowBinding

class Bca2Sem3CoaShow : AppCompatActivity() {
    lateinit var binding:ActivityBca2Sem3CoaShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBca2Sem3CoaShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url2021Notes="https://drive.google.com/file/d/1exX3KjdGyjdRUH3X0Hlxh1-NIXatWBte/view?usp=drivesdk "
        val url2022Notes=" https://drive.google.com/file/d/1RFUaLpOZZMi0tfUW84jTVCEeB2BGTxZO/view?usp=drivesdk"




        val url2020Ques=" https://drive.google.com/uc?export=download&id=1HrI1-BfUvT86KtNudMZSX4gc6BmjdASR"
        val url2022Ques=" https://firebasestorage.googleapis.com/v0/b/imagev1-b1697.appspot.com/o/COA-compressed.pdf?alt=media&token=a9a06162-b48c-42a4-93fa-ebdc85d4191e"
        val url2023Ques=" https://api.bcapoints.in/public/COA%202022--23.pdf"



        binding.note2021.setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("noteUrl", url2021Notes)
            Toast.makeText(this,"Wait For Few Seconds", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
        binding.note2022.setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("noteUrl", url2022Notes)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }




        binding.coa2020Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2020Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }


        binding.coa2022Ques.setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2022Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.coa2023Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2023Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

    }
}