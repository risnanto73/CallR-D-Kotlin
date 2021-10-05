package com.rtid.calrd.BangunRuang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.R

class LimasActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editTinggi: EditText
    private lateinit var editSisi: EditText
    private lateinit var editTinggiSegitiga: EditText
    private lateinit var textVolume: TextView
    private lateinit var textLuasPermukaan: TextView
    private lateinit var buttonHit: Button
    private lateinit var buttnClear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_limas)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        editTinggi = findViewById(R.id.edtTinggi)
        editSisi = findViewById(R.id.edtSisi)
        textVolume = findViewById(R.id.txtVolume)
        editTinggiSegitiga = findViewById(R.id.edtTinggiSegitiga)
        textLuasPermukaan = findViewById(R.id.txtLuasPermukaan)
        buttonHit = findViewById(R.id.btnHitung)
        buttnClear = findViewById(R.id.btnClear)

        buttonHit.setOnClickListener(this)
        buttnClear.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnHitung) {
            val inputTinggiLimas = editTinggi.text.toString().trim()
            val inputSisi = editSisi.text.toString().trim()
            val inputTinggiSegiitga = editTinggiSegitiga.text.toString().trim()

            var isEmptyField = false

            if (inputTinggiLimas.isEmpty()) {
                isEmptyField = true
                editTinggi.error = "Tidak boleh kosong"
            }

            if (inputSisi.isEmpty()) {
                isEmptyField = true
                editSisi.error = "Tidak boleh kosong"
            }

            if (inputTinggiSegiitga.isEmpty()) {
                isEmptyField = true
                editTinggiSegitiga.error = "Tidak boleh kosong"
            }

            if (!isEmptyField) {
                val volume =
                    inputSisi.toDouble() * inputSisi.toDouble() * inputTinggiLimas.toDouble() / 3
                textVolume.text = volume.toString()

                val luas_permukaan =
                    ((inputTinggiSegiitga.toDouble() * inputSisi.toDouble() * 2) + (inputSisi.toDouble() * inputSisi.toDouble()))
                textLuasPermukaan.text = luas_permukaan.toString()
            }
        }
        if (v?.id==R.id.btnClear){
            editTinggi.setText("");
            editTinggiSegitiga.setText("");
            editSisi.setText("");
            textLuasPermukaan.setText("");
            textVolume.setText("");
        }
    }
}