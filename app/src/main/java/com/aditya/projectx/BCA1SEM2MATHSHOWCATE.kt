package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityBca1Sem2MathshowcateBinding

class BCA1SEM2MATHSHOWCATE : AppCompatActivity() {
    lateinit var binding:ActivityBca1Sem2MathshowcateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBca1Sem2MathshowcateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url2021Notes="https://drive.google.com/file/d/1CIg0YasUx7aupZvhaFlDrgH7W2SN1ap8/view?usp=drivesdk"
        val url2022Note="https://drive.google.com/file/d/1xmjBTpBt9FFGJpM9igzIhZUPiNFyM10H/view?usp=drivesdk"

        val url2016Ques= "https://drive.google.com/uc?export=download&id=1EYTypmMwCx2WnmNoPhuQIBgKvOeoL0D4 "
        val url2017Ques=" https://drive.google.com/uc?export=download&id=1EeDFCES6CwLjR64HJjztEcKcgY8-2qvp"
        val url2022Ques="  https://api.bcapoints.in/public/Discrete%20Mathematics%20BCA%202nd%20Sem.pdf"




        binding.note2021.setOnClickListener {
            val intent = Intent(this, NotesAct::class.java)
            intent.putExtra("noteUrl", url2021Notes)
            Toast.makeText(this,"Wait For Few Seconds", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }

        binding.note2022.setOnClickListener {
            val intent = Intent(this, NotesAct::class.java)
            intent.putExtra("noteUrl", url2022Note)
            Toast.makeText(this,"Wait For Few Seconds", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }


        binding.math2016Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2016Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }
        binding.math2017Ques.setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2017Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.math2022Ques.setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2022Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }




    }
}