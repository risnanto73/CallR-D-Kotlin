package com.rtid.calrd.BangunDatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.R

class JajargenjangActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editAlas: EditText
    private lateinit var editTinggi: EditText
    private lateinit var textKeliling: TextView
    private lateinit var textLuas: TextView
    private lateinit var buttonHit: Button
    private lateinit var buttonCle: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jajar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val actionBar = supportActionBar
        actionBar!!.title = "Hitung Jajargenjang"
        actionBar.setDisplayShowTitleEnabled(true)

        editAlas = findViewById(R.id.edtAlas)
        editTinggi = findViewById(R.id.edtTinggi)
        textKeliling = findViewById(R.id.txtKeliling)
        textLuas = findViewById(R.id.txtLuas)
        buttonHit = findViewById(R.id.btnHitung)
        buttonCle = findViewById(R.id.btnClear)

        buttonHit.setOnClickListener(this)
        buttonCle.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnHitung) {
            val inputAlas = editAlas.text.toString().trim()
            val inputTinggi = editTinggi.text.toString().trim()

            var isEmptyField = true

            if (inputAlas.isEmpty()) {
                isEmptyField = true
                editAlas.error = "Tidak boleh kosong"
            }

            if (inputTinggi.isEmpty()) {
                isEmptyField = true
                editTinggi.error = "Tidak boleh kosong"
            }

            if (!isEmptyField) {

                val kel = (inputAlas.toDouble() + inputTinggi.toDouble()) * 2
                textKeliling.text = kel.toString()

                val luas = (inputAlas.toDouble() * inputTinggi.toDouble())
                textLuas.text = luas.toString()
            }
        }

        if (v?.id == R.id.btnClear) {
            editTinggi.setText("");
            editAlas.setText("");
            textKeliling.setText("");
            textLuas.setText("");
        }
    }
}