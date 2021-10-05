package com.rtid.calrd.BangunDatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.R


class PersegiPanjangActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var editPanjang: EditText
    private lateinit var editLebar: EditText
    private lateinit var texKelilig: TextView
    private lateinit var texLuas: TextView
    private lateinit var buttonHit: Button
    private lateinit var buttonCle: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val actionBar = supportActionBar
        actionBar!!.title = "Hitung Persegi Panjang"
        actionBar.setDisplayShowTitleEnabled(true)

        editPanjang = findViewById(R.id.edtPanjang)
        editLebar = findViewById(R.id.edtLebar)
        texKelilig = findViewById(R.id.txtKeliling)
        texLuas = findViewById(R.id.txtLuas)
        buttonHit = findViewById(R.id.btnHitung)
        buttonCle = findViewById(R.id.btnClear)

        buttonHit.setOnClickListener(this)
        buttonCle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnHitung) {
            val inputPanjang = editPanjang.text.toString().trim()
            val inputLebar = editLebar.text.toString().trim()

            var isEmptyField = false
            if (inputLebar.isEmpty()) {
                isEmptyField = true
                editLebar.error = "Tidak boleh kosong"
            }
            if (inputPanjang.isEmpty()) {
                isEmptyField = true
                editPanjang.error = "Tidak boleh kosong"
            }
            if (!isEmptyField) {
                val kel = 2 * (inputPanjang.toDouble() + inputLebar.toDouble())
                texKelilig.text = kel.toString()
                val luas = inputPanjang.toDouble() * inputLebar.toDouble()
                texLuas.text = luas.toString()
            }

        }
        if (v?.id == R.id.btnClear) {
            editPanjang.setText("");
            editLebar.setText("");
            texKelilig.setText("");
            texLuas.setText("");
        }
    }
}