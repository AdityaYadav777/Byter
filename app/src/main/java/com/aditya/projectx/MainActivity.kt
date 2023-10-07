package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.cardView1.setOnClickListener{
startActivity(Intent(this,BCA1::class.java))
        }


        binding.cardView2.setOnClickListener{
            startActivity(Intent(this,BCA2::class.java))

        }


        binding.cardView3.setOnClickListener{
            startActivity(Intent(this, BCA3 ::class.java))
        }

        

binding.cardView4.setOnClickListener {
    startActivity(Intent(this,followus::class.java))
}

       binding.adipro.setOnClickListener {
            Toast.makeText(this,"We are working on it",Toast.LENGTH_SHORT).show()

        }

binding.chotuChill.setOnClickListener {

    val url="https://firebasestorage.googleapis.com/v0/b/imagev1-b1697.appspot.com/o/syllabus.pdf?alt=media&token=5c2c17d6-d5b9-40d8-9c6e-e49f50a0ab9d"
    val i=Intent(this,pdf_viewer::class.java)
    i.putExtra("loadUrl",url)
    Toast.makeText(this,"Wait For Syllabus",Toast.LENGTH_LONG).show()
    startActivity(i)

}


    }
}