package com.aditya.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Note
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.aditya.projectx.databinding.ActivitySem4SubjectsBinding

class SEM4SUBJECTS : AppCompatActivity() {
    lateinit var binding:ActivitySem4SubjectsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySem4SubjectsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dbmsQuestionsList= listOf("2019","2020","2022","2023")
        val dbmsNotesList= listOf("Notes v1","Notes v2","Notes v3")


        val computerGraphicsQuestionsList= listOf("2019","2023")
        val computerGraphicsNotesList= listOf("Notes v1","Notes v2","Notes v3")


        val orQuestionsList= listOf("2019","2023")
        val orNotesList= listOf("Notes v1","Notes v2")

        val softwareQuestionsList= listOf("2019","2022","2023")
        val softwareNotesList= listOf("Notes v1","Notes v2")


        val url2019Notes = "https://drive.google.com/file/d/1uqKnRStew9yYPirYPLT4esezhSw4UwVS/view?usp=drivesdk"
        val url2020Notes = "https://drive.google.com/file/d/1c_jnOWSeAgUMdFAl3601luRyP4AUDMo3/view?usp=drivesd"
        val url2021Notes = "https://drive.google.com/file/d/155dAw1Ig73rcFQLjUnNPcg_raqxuU_c4/view?usp=drivesdk"



        val url2019Ques=" https://drive.google.com/uc?export=download&id=1I_JEYNAWhtN_qmP7ezo2vNMjABR5Fqy3"
        val url2020Ques=" https://api.bcapoints.in/public/Introduction%20to%20DBMS%202022.pdf"
        val url2022Ques=" https://api.bcapoints.in/public/Introduction%20to%20DBMS%202022.pdf"
        val url2023Ques=" https://drive.google.com/uc?export=download&id=1IuAwPkUvtL3kWdnJAR1boTj-jnIvndjd"



        val orUrl2019Notes=" https://drive.google.com/file/d/1dY9Y0SYu6HQruwVnd6AZSkuUOPLUI87O/view?usp=drivesdk"
        val orUrl2020Notes=" https://drive.google.com/file/d/1YhaW9JUmrz_Z9qrsRj37gCd4ngVYMZ9A/view?usp=drivesdk"


        val orUrl2019Ques=" https://drive.google.com/uc?export=download&id=1J6yeL36mr04Qbk7RkZSp7aU9UONhB3wO"
        val orUrl2023Ques=" https://drive.google.com/uc?export=download&id=1J9C7xTf6Y_NDYsb_cRmVJ5QiW3H8rz7L"



        val cgUrl2019Notes="https://drive.google.com/file/d/123mkaKSdSHWXwWOCYQ0TmYw1exJS4XgW/view?usp=drivesdk"
        val cgUrl2020Notes="https://drive.google.com/file/d/1-DbEeDyJjk6SHxXxMDaZtKg7YqXvlO-x/view?usp=drivesdk"
        val cgUrl2021Notes=" https://drive.google.com/file/d/1HdGqohA97RlPsnuh1vTCzdhW4YPjMXHw/view?usp=drivesdk"



        val cgUrl2019Ques=" https://drive.google.com/uc?export=download&id=1JUTdNNovIbE3T1gDTn7vYwU9YDBPrAhm"
        val cgUrl2023Ques="https://drive.google.com/uc?export=download&id=1JjtMop6daXyC15ZMxwOnS_UmGO-gZm4a"





        val seUrl2019Notes=" https://drive.google.com/file/d/1l4iovlDAYEUr64ZrzW16ZqjOj5Tca-6e/view?usp=drivesdk"
        val seUrl2020Notes="https://drive.google.com/file/d/1wuZlnGM2m1kE8loQiEIepfzcD_OI6K9K/view?usp=drivesdk"



        val seUrl2019Ques=" https://drive.google.com/uc?export=download&id=1KNX828986N94004d63K-0UAl_PmG4tqZ"
        val seUrl2022Ques="  https://api.bcapoints.in/public/Software%20Engineering%202022.pdf"
        val seUrl2023Ques=" https://drive.google.com/uc?export=download&id=1Kb9dpJlgHDF8I_kqEHPUiu-AG95hub3K"



        val adapterDbmsQues= ArrayAdapter(this,R.layout.list_item,dbmsQuestionsList)
        binding.dbmsQuestions.setAdapter(adapterDbmsQues)

        binding.dbmsQuestions.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="2019"){
                val i=Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", url2019Ques)
                Toast.makeText(this,"Wait For Few Seconds", Toast.LENGTH_LONG).show()
                startActivity(i)
            }


            if(itemSeletct=="2020"){
                val i=Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", url2020Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }



            if(itemSeletct=="2022"){
                val i=Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", url2022Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="2023"){
                val i=Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", url2023Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }


        }



        val adapterDbmsNotes= ArrayAdapter(this,R.layout.list_item,dbmsNotesList)
        binding.dbmsNotes.setAdapter(adapterDbmsNotes)

        binding.dbmsNotes.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="Notes v1"){
                val i=Intent(this,NotesAct::class.java)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                i.putExtra("noteUrl", url2019Notes)
                startActivity(i)
            }


            if(itemSeletct=="Notes v2"){
                val i=Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", url2020Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes v3"){
                val i=Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", url2021Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }
        }


        val adapterOrQuestion= ArrayAdapter(this,R.layout.list_item,orQuestionsList)
        binding.orQuestions.setAdapter(adapterOrQuestion)

        binding.orQuestions.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="2019"){
                val i=Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", orUrl2019Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }




            if(itemSeletct=="2023"){
                val i=Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", orUrl2023Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }



        }


        val adapterOrNotes= ArrayAdapter(this,R.layout.list_item,orNotesList)
        binding.orNotes.setAdapter(adapterOrNotes)

        binding.orNotes.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="Notes v1"){
                val i=Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", orUrl2019Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes v2"){
                val i=Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", orUrl2020Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }


        }

        val adapterCGQues= ArrayAdapter(this,R.layout.list_item,computerGraphicsQuestionsList)
        binding.cgQuestion.setAdapter(adapterCGQues)

        binding.cgQuestion.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)


            if(itemSeletct=="2019"){
                val i=Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", cgUrl2019Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }




            if(itemSeletct=="2023"){
                val i=Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", cgUrl2023Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }



        }

        val adapterCGNotes= ArrayAdapter(this,R.layout.list_item,computerGraphicsNotesList)
        binding.cgNotes.setAdapter(adapterCGNotes)

        binding.cgNotes.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="Notes v1"){
                val i=Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", cgUrl2019Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes v2"){
                val i=Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", cgUrl2020Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes v3"){
                val i=Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", cgUrl2021Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }


        }



        val adapterSEQues= ArrayAdapter(this,R.layout.list_item,softwareQuestionsList)
        binding.seQues.setAdapter(adapterSEQues)

        binding.seQues.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)


            if(itemSeletct=="2019"){
                val i=Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", seUrl2019Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }




            if(itemSeletct=="2022"){
                val i=Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", seUrl2022Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="2023"){
                val i=Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", seUrl2023Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }



        }


        val adapterSENotes= ArrayAdapter(this,R.layout.list_item,softwareNotesList)
        binding.seNotes.setAdapter(adapterSENotes)

        binding.seNotes.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="Notes v1"){
                val i=Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", seUrl2019Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes v2"){
                val i=Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", seUrl2020Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }





        }

    }
}