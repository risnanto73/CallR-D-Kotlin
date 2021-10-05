package com.rtid.calrd.BangunRuang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.R

class KerucutActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editJari: EditText
    private lateinit var editTinggi: EditText
    private lateinit var editSelimut: EditText
    private lateinit var textVolume: TextView
    private lateinit var textLuasPermukaan: TextView
    private lateinit var buttonHit: Button
    private lateinit var buttonCle: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kerucut)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        editJari = findViewById(R.id.edtJari)
        editTinggi = findViewById(R.id.edtTinggi)
        editSelimut = findViewById(R.id.edtSelimut)
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
            val inputSelimut = editSelimut.text.toString().trim()

            var isEmptyField = false

            if (inputJari.isEmpty()){
                isEmptyField = true
                editJari.error = "Tidak boleh kosong"
            }

            if (inputTinggi.isEmpty()){
                isEmptyField = true
                editTinggi.error = "Tidak boleh kosong"
            }

            if (inputSelimut.isEmpty()){
                isEmptyField = true
                editSelimut.error = "Tidak boleh kosong"
            }

            if (!isEmptyField) {
                val volume =
                    22 * inputJari.toDouble() * inputJari.toDouble() * inputTinggi.toDouble() / 3 / 7
                textVolume.text = volume.toString()

                val luas_permukaan =
                    (22 * inputJari.toDouble() * inputJari.toDouble() / 7) + (22 * inputJari.toDouble() * inputSelimut.toDouble() / 7)
                textLuasPermukaan.text = luas_permukaan.toString()
            }
        }
        if (v?.id == R.id.btnClear){
            textLuasPermukaan.setText("");
            textVolume.setText("");
            editSelimut.setText("");
            editTinggi.setText("");
            editJari.setText("");

        }
    }
}