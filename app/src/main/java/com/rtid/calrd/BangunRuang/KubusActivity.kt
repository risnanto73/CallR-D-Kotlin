package com.rtid.calrd.BangunRuang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.R

class KubusActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editSisi: EditText
    private lateinit var textVolume: TextView
    private lateinit var textPermukaanLuas: TextView
    private lateinit var buttonHit: Button
    private lateinit var buttoncle: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kubus)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        editSisi = findViewById(R.id.edtSisi)
        textVolume = findViewById(R.id.txtVolume)
        textPermukaanLuas = findViewById(R.id.txtLuasPermukaan)
        buttonHit = findViewById(R.id.btnHitung)
        buttoncle = findViewById(R.id.btnClear)

        buttonHit.setOnClickListener(this)
        buttoncle.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnHitung) {
            val inputSisi = editSisi.text.toString().trim()
            var isEmptyField = false

            if (inputSisi.isEmpty()) {
                isEmptyField = true
                editSisi.error = "Tidak boleh kosong"
            }

            if (!isEmptyField) {
                val volume = inputSisi.toDouble() * inputSisi.toDouble() * inputSisi.toDouble()
                textVolume.text = volume.toString()

                val luaspermukaan = inputSisi.toDouble() * inputSisi.toDouble() * 6
                textPermukaanLuas.text = luaspermukaan.toString()
            }
        }

        if (v?.id == R.id.btnClear) {
            editSisi.setText("");
            textPermukaanLuas.setText("");
            textVolume.setText("");
        }
    }
}