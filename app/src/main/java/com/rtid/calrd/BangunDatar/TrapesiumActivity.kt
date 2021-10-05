package com.rtid.calrd.BangunDatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.R

class TrapesiumActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var masukanAtas: EditText
    private lateinit var masukanBawah: EditText
    private lateinit var masukanTinggi: EditText
    private lateinit var masukanSisi: EditText
    private lateinit var buttonHit: Button
    private lateinit var texKeliling: TextView
    private lateinit var texLuas: TextView
    private lateinit var buttonCle : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trapesium)

        val actionBar = supportActionBar
        actionBar!!.title = "Hitung Trapesium"
        actionBar.setDisplayShowTitleEnabled(true)

        masukanAtas = findViewById(R.id.edtAtas)
        masukanBawah = findViewById(R.id.edtBawah)
        masukanTinggi = findViewById(R.id.edtTinggi)
        masukanSisi = findViewById(R.id.edtSisi)
        buttonHit = findViewById(R.id.btnHitung)
        texKeliling = findViewById(R.id.txtKeliling)
        texLuas = findViewById(R.id.txtLuas)
        buttonCle   = findViewById(R.id.btnClear)

        buttonHit.setOnClickListener(this)
        buttonCle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnHitung) {
            val inputAtas = masukanAtas.text.toString().trim()
            val inputBawah = masukanBawah.text.toString().trim()
            val inputTinggi = masukanTinggi.text.toString().trim()
            val inputSisi = masukanSisi.text.toString().trim()

            var isEmptyField = true

            if (inputAtas.isEmpty()) {
                isEmptyField = true
                masukanAtas.error = "Tidak boleh kosong"
            }

            if (inputBawah.isEmpty()) {
                isEmptyField = true
                masukanBawah.error = "Tidak boleh kosong"
            }

            if (inputTinggi.isEmpty()) {
                isEmptyField = true
                masukanTinggi.error = "Tidak boleh kosong"
            }
            if (inputSisi.isEmpty()) {
                isEmptyField = true
                masukanSisi.error = "Tidak boleh kosong"
            }

            if (!isEmptyField) {

                val kel =
                    inputAtas.toDouble() + inputBawah.toDouble() + inputTinggi.toDouble() + inputSisi.toDouble()
                texKeliling.text = kel.toString()

                val luas =
                    (inputAtas.toDouble() + inputBawah.toDouble()) * inputTinggi.toDouble() / 2
                texLuas.text = luas.toString()
            }
        }
        if (v?.id == R.id.btnClear){
            masukanTinggi.setText("");
            masukanBawah.setText("");
            masukanAtas.setText("");
            masukanSisi.setText("");
        }
    }
}