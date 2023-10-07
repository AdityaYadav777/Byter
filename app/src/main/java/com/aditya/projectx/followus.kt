package com.aditya.projectx

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditya.projectx.databinding.ActivityFollowusBinding


class followus : AppCompatActivity() {
    lateinit var binding:ActivityFollowusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFollowusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var url1="https://instagram.com/adityayadav_up56?utm_source=qr&igshid=MzNlNGNkZWQ4Mg%3D%3D"
        var url2="https://www.facebook.com/adityayadav.yaduvanishi?mibextid=MKOS29"
        binding.insta.setOnClickListener {

            binding.webview.loadUrl(url1)

        }

        binding.fb.setOnClickListener {
            binding.webview.loadUrl(url2)
        }

        binding.google.setOnClickListener {
            var email="adityayadav322003@gmail.com"
            var subject="Feedback"
            var body="Nice App"
            val intent= Intent(Intent.ACTION_SEND)
            val urlString="mailto:"+Uri.encode(email) +"?subject="+Uri.encode(subject)+ "&body="+Uri.encode(body)
            intent.data=Uri.parse(urlString)

         intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            intent.putExtra(Intent.EXTRA_SUBJECT,subject)
            intent.putExtra(Intent.EXTRA_TEXT,body)
            intent.selector
            intent.type="message/rfc822"
            startActivity(Intent.createChooser(intent,"GMAIL KO SELECT KRO ,THANKS :) "))
        }







    }
}