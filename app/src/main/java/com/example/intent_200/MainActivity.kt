package com.example.intent_200

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tx_item_nim = findViewById<EditText>(R.id.tx_item_nim)
        val tx_item_nama = findViewById<EditText>(R.id.tx_item_nama)
        val tx_item_nilai = findViewById<EditText>(R.id.tx_item_nilai)


        btn_item_proses.setOnClickListener(){
            if ((tx_item_nim.text.isEmpty())||(tx_item_nama.text.isEmpty())||(tx_item_nilai.text.isEmpty())){
                Toast.makeText(applicationContext,"Tidak Boleh Ada yang Kosong",Toast.LENGTH_LONG).show()

            }else if ((tx_item_nim.text.isNotEmpty())||(tx_item_nama.text.isNotEmpty())||(tx_item_nilai.text.isNotEmpty())){
                Toast.makeText(applicationContext,"PROSES",Toast.LENGTH_LONG).show()

                val nim = tx_item_nim.text.toString()
                val nama = tx_item_nama.text.toString()
                val nilai = tx_item_nilai.text.toString()
                var keterangan: String? = ""

                if (nilai >= 80.toString()){
                    keterangan = "A"
                }else if(nilai >= 60.toString()){
                    keterangan = "B"
                }else if (nilai >= 40.toString()){
                    keterangan = "C"
                }else if (nilai >=20.toString()){
                    keterangan = "D"
                }else{
                    keterangan = "E"
                }

                val intent = Intent(this, Activity2::class.java)
                intent.putExtra("Nim", nim)
                intent.putExtra("Nama", nama)
                intent.putExtra("Nilai", nilai)
                intent.putExtra("Keterangan", keterangan)

                startActivity(intent)
            }
        }
    }
}
