package com.example.intent_200

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

       // var intent = intent
       // val nim = intent.getStringExtra("Nim:")
        //val nama = intent.getStringExtra("Nama:")
       // val nilai = intent.getStringExtra("Nilai:")
        //var keterangan = intent.getStringExtra("Keterangan")
        val bundle = intent.extras
        val nim = bundle?.get("Nim")
        val nama = bundle?.get("Nama")
        val nilai = bundle?.get("Nilai")
        val keterangan = bundle?.get("Keterangan")


        tv_nim.text = ("Nim: " + (nim))
        tv_nama.text = ("Nama: "+ (nama))
        tv_nilai.text = ("Nilai: "+ (nilai))
        tv_keterangan.text = ("Keterangan Nilai: "+ (keterangan))

        btn_kembali.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
