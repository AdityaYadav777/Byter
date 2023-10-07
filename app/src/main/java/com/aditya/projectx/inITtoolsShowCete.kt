package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityInIttoolsShowCeteBinding

class inITtoolsShowCete : AppCompatActivity() {
    lateinit var binding:ActivityInIttoolsShowCeteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityInIttoolsShowCeteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val url2021Notes=" https://drive.google.com/file/d/1QzOQCnMXmf84ywn8Cu8gyHmkow9BeoMz/view?usp=drivesdk"
        val url2022Notes=" https://drive.google.com/file/d/1RJg7XrK0w-a47Bz0ylS3IZnarn8t2I4V/view?usp=drivesdk"
        val url2023Notes="https://drive.google.com/file/d/16CtZo1TgM3859-5apPVtcPg4NAJ6Bx90/view?usp=drivesdk"


        val url2016Ques="https://api.bcapoints.in/public/it%20tools%20&%20applications%202016.pdf"
        val url2017Ques="https://api.bcapoints.in/public/it%20tools%20&%20applications%202017.pdf "
        val url2018Ques=" https://api.bcapoints.in/public/it%20tools%20&%20applications%202018.pdf"
        val url2019Ques=" https://api.bcapoints.in/public/it%20tools%20&%20applications%202019.pdf"
        val url2020Ques=" https://api.bcapoints.in/public/It%20Tools%20and%20Applications%202020-21.pdf"



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

        binding.ques2016 .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2016Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }
        binding.ques2017 .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2017Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.ques2018 .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2018Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.ques2019 .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2019Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        binding.ques2020 .setOnClickListener {
            val intent = Intent(this, pdf_viewer::class.java)
            intent.putExtra("loadUrl", url2020Ques)
            Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

    }

}