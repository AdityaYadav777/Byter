package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityBca2Sem3DsaShowBinding

class Bca2Sem3DsaShow : AppCompatActivity() {
    lateinit var binding:ActivityBca2Sem3DsaShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBca2Sem3DsaShowBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val url2021Notes=" https://drive.google.com/file/d/102Rrbii5vxXb4QX0ngXyH0KTdSLFHuA4/view?usp=drivesdk"
        val url2022Notes=" https://drive.google.com/file/d/13_E4z210BoPGGsmCSDlfiLKFTy_IJoT2/view?usp=drivesdk"
        val url2023Notes=" https://drive.google.com/file/d/1-ZW0V8Kfy7oSMspDApZJlkRMVD3P5nqN/view?usp=drivesdk"


        val url2019Ques="https://drive.google.com/uc?export=download&id=1HMIrJLSbE1lRQiOmmTz-HjCz44Psp3MA"
        val url2021Ques=" https://firebasestorage.googleapis.com/v0/b/imagev1-b1697.appspot.com/o/Data%20structure_compressed%20(1).pdf?alt=media&token=bae1d68c-0389-47f6-8073-1c70420bb105"
        val url2022Ques=" https://api.bcapoints.in/public/Data%20structure%202021-22.pdf "
        val url2023Ques=" https://api.bcapoints.in/public/Data%20Structure%202022--23.pdf"



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

        binding.note2023.setOnClickListener {
            val intent = Intent(this, NotesAct::class.java)
            intent.putExtra("noteUrl", url2023Notes)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.dsa2019Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2019Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }


        binding.dsa2021Ques .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2021Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.dsa2022Ques.setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2022Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.dsa2023Ques.setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2023Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }


    }
}