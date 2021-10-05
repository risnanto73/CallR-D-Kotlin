package com.rtid.calrd.BangunRuang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.R

class TabungActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editJari : EditText
    private lateinit var editTinggi : EditText
    private lateinit var textVolume : TextView
    private lateinit var textLuasPermukaan : TextView
    private lateinit var buttonHit  : Button
    private lateinit var buttonCle  : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabung)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val actionBar = supportActionBar
        actionBar!!.setTitle("Hitung Tabung")
        actionBar.setDisplayShowTitleEnabled(true)

        editJari = findViewById(R.id.edtJari)
        editTinggi = findViewById(R.id.edtTinggi)
        textVolume = findViewById(R.id.txtVolume)
        textLuasPermukaan = findViewById(R.id.txtLuasPermukaan)
        buttonHit = findViewById(R.id.btnHitung)
        buttonCle = findViewById(R.id.btnClear)

        buttonHit.setOnClickListener(this)
        buttonCle.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnHitung){
            val inputJari = editJari.text.toString().trim()
            val inputTinggi = editTinggi.text.toString().trim()

            var isEmptyField = false

            if (inputJari.isEmpty()){
                isEmptyField = true
                editJari.error = "Tidak boleh kosong"
            }
            if (inputTinggi.isEmpty()){
                isEmptyField = true
                editTinggi.error = "Tidak boleh kosong"
            }

            if (!isEmptyField) {
                val volume =
                    22 * inputJari.toDouble() * inputJari.toDouble() * inputTinggi.toDouble() / 7
                textVolume.text = volume.toString()

                val luas_permukaan =
                    (2 * (22 * inputJari.toDouble() * inputJari.toDouble() / 7)) + ((2 * 22 * inputJari.toDouble() / 7) * inputTinggi.toDouble())
                textLuasPermukaan.text = luas_permukaan.toString()
            }
        }
        if (v?.id == R.id.btnClear){
            editJari.setText("");
            editTinggi.setText("");
            textVolume.setText("");
            textLuasPermukaan.setText("");
        }
    }
}