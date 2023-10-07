package com.aditya.projectx



import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.webkit.WebChromeClient
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityNotesBinding

class NotesAct : AppCompatActivity() {
    lateinit var binding:ActivityNotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNotesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val url=intent.getStringExtra("noteUrl").toString()

       binding.webView.settings.javaScriptEnabled = true
     binding.webView.webChromeClient = WebChromeClient()
       binding.webView.loadUrl(url)
        binding.webView.settings.setSupportZoom(true)
        binding. webView.settings.builtInZoomControls = true

       binding.webView.setDownloadListener { url, userAgent, contentDisposition, mimeType, contentLength ->

            val request = DownloadManager.Request(Uri.parse(url))
            request.setMimeType(mimeType)
            request.addRequestHeader("User-Agent", userAgent)
            request.setDescription("Downloading file...")
            request.setTitle("Your_File_Name")
            request.allowScanningByMediaScanner()
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "Your_File_Name.ext")

            val downloadManager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
            downloadManager.enqueue(request)
           Toast.makeText(this,"Download Started ",Toast.LENGTH_SHORT).show()
        }


    }
}