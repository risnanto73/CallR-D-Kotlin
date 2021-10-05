package com.rtid.calrd.BangunRuang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.R

class PrismaActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editTinggiPrisma: EditText
    private lateinit var editTinggiAlas: EditText
    private lateinit var editAlas: EditText
    private lateinit var editSisi: EditText
    private lateinit var textVolume: TextView
    private lateinit var textLuasPermukaan: TextView
    private lateinit var buttonHit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prisma)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        editTinggiPrisma = findViewById(R.id.edtTinggiPrisma)
        editAlas = findViewById(R.id.edtAlas)
        editTinggiAlas = findViewById(R.id.edtTinggiAlas)
        editSisi = findViewById(R.id.edtSisi)
        textVolume = findViewById(R.id.txtVolume)
        textLuasPermukaan = findViewById(R.id.txtLuasPermukaan)
        buttonHit = findViewById(R.id.btnHitung)

        buttonHit.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnHitung) {
            val inputTinggiPrisma = editTinggiPrisma.text.toString().trim()
            val inputTinggiAlas = editTinggiAlas.text.toString().trim()
            val inputAlas = editAlas.text.toString().trim()
            val inputSisi = editSisi.text.toString().trim()

            var isEmptyField = false

            if (inputAlas.isEmpty()){
                isEmptyField = true
                editAlas.error = "Tidak boleh kosong"
            }

            if (inputTinggiAlas.isEmpty()){
                isEmptyField = true
                editTinggiAlas.error = "Tidak boleh kosong"
            }

            if (inputTinggiPrisma.isEmpty()){
                isEmptyField = true
                editTinggiPrisma.error = "Tidak boleh kosong"
            }

            if (inputSisi.isEmpty()){
                isEmptyField = true
                editSisi.error = "Tidak boleh kosong"
            }


            if (!isEmptyField) {
                val volume =
                    inputAlas.toDouble() * inputTinggiAlas.toDouble() * inputTinggiPrisma.toDouble() / 2
                textVolume.text = volume.toString()

                val luas_permukaan =
                    ((( inputAlas.toDouble() * inputTinggiAlas.toDouble()) * 2)) + (((inputAlas.toDouble() + inputTinggiAlas.toDouble() + inputSisi.toDouble()) * inputTinggiPrisma.toDouble()))
                textLuasPermukaan.text = luas_permukaan.toString()
            }
        }
    }
}