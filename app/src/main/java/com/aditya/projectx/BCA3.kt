package com.aditya.projectx


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.aditya.projectx.databinding.ActivityBca3Binding

class BCA3 : AppCompatActivity() {
    lateinit var binding:ActivityBca3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBca3Binding.inflate(layoutInflater)
        setContentView(binding.root)

//sem 5 questions and Notes List year

        val javaQuestionsList= listOf("2019","2020")
        val javaNotesList= listOf("Notes v1","Notes v2")

        val plQuestionsList= listOf("2017","2018","2019","2020","2023")
        val plNotesList= listOf("Notes v1","Notes v2")

        val spmQuestionsList= listOf("2019","2020","2023")
        val spmNotesList= listOf("Notes v1","Notes 2020","Notes 2021","Notes 2022","Notes 2023")

        val netQuestionsList= listOf("2019","2020","2023")
        val netNotesList= listOf("Notes 2019","Notes 2020","Notes 2021","Notes 2022","Notes 2023")

//sem 6 questions and Notes List year

        val adnnsQuestionsList= listOf("2019","2023")
        val adnnsNotesList= listOf("Notes 2019","Notes 2020","Notes 2021","Notes 2022","Notes 2023")

        val webDevQuestionsList= listOf("2019","2023")
        val webDevNotesList= listOf("Notes 2019","Notes 2020","Notes 2021","Notes 2022","Notes 2023")


//sem 5 Notes and Qustion Urls


        val javaUrl2019Notes="https://drive.google.com/file/d/1gkhCwV3hpqVi0i45HaDF4BQzrcJle2iT/view?usp=drivesdk"
        val javaUrl2020Notes=" https://drive.google.com/file/d/1m8ztANW3zXERuPvtNwFyV2akt9YgAbj9/view?usp=drivesdk"


        val javaUrl2019Ques=" https://api.bcapoints.in/public/JAVA%202022-23.pdf"
        val javaUrl2020Ques="https://drive.google.com/uc?export=download&id=1L5uMV5Q-dlYMpkdU0pVbuaJsDaAnxcKx"




        val plUrl2019Notes="https://drive.google.com/file/d/1XHZGUrnLPn4JpQ63KUt8YGKELSLWb7uM/view?usp=drivesdk"
        val plUrl2020Notes="https://drive.google.com/file/d/1KJV67c4rT-zLD5tySIMconDNRQAE5mQ5/view?usp=drivesdk"


        val plUrl2017Ques=" https://drive.google.com/uc?export=download&id=1LQ6CVo6PD7-ophZQBVspP2KdnUuXBQLY"
        val plUrl2018Ques=" https://drive.google.com/uc?export=download&id=1LX3R8YRvIrx4VbSxRFUR1s-ivsLE2z2z"
        val plUrl2019Ques=" https://drive.google.com/uc?export=download&id=1MYd9Gnd8EQdUIUBIpH9-Zi6CA2h4xfWx"
        val plUrl2020Ques="https://drive.google.com/uc?export=download&id=1N1Vxsl01vmRq_wwHfCkMd2ccCBVZ3ibE"
        val plUrl2023Ques=" https://api.bcapoints.in/public/ORACLE%20&%20PL-SQL%202022-23.pdf"




        val spmUrl2019Notes=" https://drive.google.com/file/d/1l4iovlDAYEUr64ZrzW16ZqjOj5Tca-6e/view?usp=drivesdk"
        val spmUrl2020Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val spmUrl2021Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val spmUrl2022Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val spmUrl2023Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"

        val spmUrl2019Ques=" https://drive.google.com/uc?export=download&id=1NFoxEHC8_4M-JvUOPAtCuhUMWU4dTM_k"
        val spmUrl2020Ques=" https://drive.google.com/uc?export=download&id=1N7GGfqUjy6y8KBhu03IppEtKAb43dSNv"
        val spmUrl2023Ques=" https://api.bcapoints.in/public/Software%20Project%20Management%202022-23.pdf"




        val netUrl2019Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val netUrl2020Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val netUrl2021Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val netUrl2022Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val netUrl2023Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"

        val netUrl2019Ques="https://drive.google.com/uc?export=download&id=1NmQ8pjV3vFIhwyOPq9Ah2hdJCsKI7kaf"
        val netUrl2020Ques=" https://drive.google.com/uc?export=download&id=1N_wQXF0wypDVLBT26Zn8LXBunwbBb9g5"
        val netUrl2023Ques=" https://api.bcapoints.in/public/Computer%20Network%202022-23.pdf"



//semester 6 subjects

        val adnnsUrl2019Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val adnnsUrl2020Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val adnnsUrl2021Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val adnnsUrl2022Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val adnnsUrl2023Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"

        val adnnsUrl2019Ques=" https://api.bcapoints.in/public/Advance%20Networks%20and%20Network%20Security%202019.pdf"
        val adnnsUrl2023Ques=" https://api.bcapoints.in/public/Advanced%20Network%20&%20Network%20Security%202022-23.pdf"




        val webDevUrl2019Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val webDevUrl2020Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val webDevUrl2021Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val webDevUrl2022Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
        val webDevUrl2023Notes=" https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"

        val webDevUrl2019Ques="https://api.bcapoints.in/public/Web%20Developement%20Tool%20&%20Techniques%202019.pdf"
        val webDevUrl2023Ques=" https://api.bcapoints.in/public/Web%20Development%20Tools%20and%20Techniques%202022-23.pdf"






        val adapterJavaQues= ArrayAdapter(this,R.layout.list_item,javaQuestionsList)
        binding.javaQues.setAdapter(adapterJavaQues)

        binding.javaQues.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="2019"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", javaUrl2019Ques)
                Toast.makeText(this,"Wait For Few Seconds", Toast.LENGTH_LONG).show()
                startActivity(i)
            }


            if(itemSeletct=="2020"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", javaUrl2020Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

        }

        val adapterJavaNotes= ArrayAdapter(this,R.layout.list_item,javaNotesList)
        binding.javaNotes.setAdapter(adapterJavaNotes)

        binding.javaNotes.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="Notes v1"){
                val i= Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", javaUrl2019Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }


            if(itemSeletct=="Notes v2"){
                val i= Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", javaUrl2020Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }
        }



        val adapterPlQues= ArrayAdapter(this,R.layout.list_item,plQuestionsList)
        binding.plQues.setAdapter(adapterPlQues)

        binding.plQues.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="2017"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", plUrl2017Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }


            if(itemSeletct=="2018"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", plUrl2018Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="2019"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", plUrl2019Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="2020"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", plUrl2020Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="2023"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", plUrl2023Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

        }

        val adapterPlNotes= ArrayAdapter(this,R.layout.list_item,plNotesList)
        binding.plNotes.setAdapter(adapterPlNotes)

        binding.plNotes.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="Notes v1"){
                val i= Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", plUrl2019Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }


            if(itemSeletct=="Notes v2"){
                val i= Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", plUrl2020Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }


        }



        val adapterSpmQues= ArrayAdapter(this,R.layout.list_item,spmQuestionsList)
        binding.spmQues.setAdapter(adapterSpmQues)

        binding.spmQues.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="2019"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", spmUrl2019Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }


            if(itemSeletct=="2020"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", spmUrl2020Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }



            if(itemSeletct=="2023"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", spmUrl2023Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

        }


        val adapterSpmNotes= ArrayAdapter(this,R.layout.list_item,spmNotesList)
        binding.spmNotes.setAdapter(adapterSpmNotes)

        binding.spmNotes.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="Notes v1"){
                val i= Intent(this,NotesAct::class.java)
                i.putExtra("noteUrl", spmUrl2019Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }


            if(itemSeletct=="Notes 2020"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", spmUrl2020Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes 2021"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", spmUrl2021Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes 2022"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", spmUrl2022Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes 2023"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", spmUrl2023Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

        }


        val adapterNetQues= ArrayAdapter(this,R.layout.list_item,netQuestionsList)
        binding.netQues.setAdapter(adapterNetQues)

        binding.netQues.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="2019"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", netUrl2019Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }


            if(itemSeletct=="2020"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", netUrl2020Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }



            if(itemSeletct=="2023"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", netUrl2023Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

        }



        val adapterNetNotes= ArrayAdapter(this,R.layout.list_item,netNotesList)
        binding.netNotes.setAdapter(adapterNetNotes)

        binding.netNotes.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="Notes 2019"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", netUrl2019Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }


            if(itemSeletct=="Notes 2020"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", netUrl2020Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes 2021"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", netUrl2021Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes 2022"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", netUrl2022Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes 2023"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", netUrl2023Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)

            }

        }


        val adapterAdnnsQues= ArrayAdapter(this,R.layout.list_item,adnnsQuestionsList)
        binding.adnnsQues.setAdapter(adapterAdnnsQues)

        binding.adnnsQues.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="2019"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", adnnsUrl2019Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }






            if(itemSeletct=="2023"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", adnnsUrl2023Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

        }




        val adapterAdnnsNotes= ArrayAdapter(this,R.layout.list_item,adnnsNotesList)
        binding.adnnsNotes.setAdapter(adapterAdnnsNotes)

        binding.adnnsNotes.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="Notes 2019"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", adnnsUrl2019Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }


            if(itemSeletct=="Notes 2020"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", adnnsUrl2020Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes 2021"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", adnnsUrl2021Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes 2022"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", adnnsUrl2022Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes 2023"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", adnnsUrl2023Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

        }



        val adapterWebDevQues= ArrayAdapter(this,R.layout.list_item,webDevQuestionsList)
        binding.webDevQues.setAdapter(adapterWebDevQues)

        binding.webDevQues.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="2019"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", webDevUrl2019Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }




            if(itemSeletct=="2023"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", webDevUrl2023Ques)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

        }



        val adapterWebDevNotes= ArrayAdapter(this,R.layout.list_item,webDevNotesList)
        binding.webDevNotes.setAdapter(adapterWebDevNotes)

        binding.webDevNotes.onItemClickListener= AdapterView.OnItemClickListener{
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val itemSeletct= parent?.getItemAtPosition(position)

            if(itemSeletct=="Notes 2019"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", webDevUrl2019Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }


            if(itemSeletct=="Notes 2020"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", webDevUrl2020Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes 2021"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", webDevUrl2021Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes 2022"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", webDevUrl2022Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

            if(itemSeletct=="Notes 2023"){
                val i= Intent(this,pdf_viewer::class.java)
                i.putExtra("loadUrl", webDevUrl2023Notes)
                Toast.makeText(this,"Wait For Few Seconds",Toast.LENGTH_LONG).show()
                startActivity(i)
            }

        }



    }
}