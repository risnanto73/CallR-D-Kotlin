package com.rtid.calrd.BangunDatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.R


class SegitigaActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var editTinggi: EditText
    private lateinit var editAlas: EditText
    private lateinit var editSisi: EditText
    private lateinit var textKel: TextView
    private lateinit var textLuas: TextView

    private lateinit var buttonHit  : Button
    private lateinit var buttonCle  : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)

        val actionBar = supportActionBar
        actionBar!!.title = "Hitung Segitiga"
        actionBar.setDisplayShowTitleEnabled(true)

        editTinggi = findViewById(R.id.edtTinggi)
        editAlas = findViewById(R.id.edtAlas)
        editSisi = findViewById(R.id.edtSisi)
        buttonHit = findViewById(R.id.btnHitung)
        textKel = findViewById(R.id.txtKeliling)
        textLuas = findViewById(R.id.txtLuas)
        buttonCle = findViewById(R.id.btnClear)

        buttonHit.setOnClickListener(this)
        buttonCle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnHitung) {
            val inputAlas = editAlas.text.toString().trim()
            val inputTinggi = editTinggi.text.toString().trim()
            val inputSisi = editSisi.text.toString().trim()

            var isEmptyFields = false

            if (inputAlas.isEmpty()) {
                isEmptyFields = true
                editAlas.error = "Tidak boleh kosong"
            }
            if (inputSisi.isEmpty()) {
                isEmptyFields = true
                editSisi.error = "Tidak boleh kosong"
            }
            if (inputTinggi.isEmpty()) {
                isEmptyFields = true
                editTinggi.error = "Tidak boleh kosong"
            }

            if (!isEmptyFields) {
                val kel = inputAlas.toInt() + inputSisi.toInt() + inputTinggi.toInt()
                textKel.text = kel.toString()

                val luas = inputAlas.toDouble() * inputTinggi.toDouble() / 2
                textLuas.text = luas.toString()
            }
        }
        if (v?.id==R.id.btnClear){
            editTinggi.setText("");
            editSisi.setText("");
            editAlas.setText("");
        }
    }
}