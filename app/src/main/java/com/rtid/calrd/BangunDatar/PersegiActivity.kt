package com.rtid.calrd.BangunDatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.R


class PersegiActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editSisi: EditText
    private lateinit var textKeliling: TextView
    private lateinit var textLuas: TextView
    private lateinit var buttoHit: Button
    private lateinit var buttonCle: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegei)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val actionBar = supportActionBar
        actionBar!!.title = "Hitung Persegi"
        actionBar.setDisplayShowTitleEnabled(true)

        editSisi = findViewById(R.id.edtSisi)
        textKeliling = findViewById(R.id.txtKeliling)
        textLuas = findViewById(R.id.txtLuas)
        buttoHit = findViewById(R.id.btnHitung)
        buttonCle = findViewById(R.id.btnClear)

        buttoHit.setOnClickListener(this)
        buttonCle.setOnClickListener(this)
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
                val kel = 4 * inputSisi.toInt()
                textKeliling.text = kel.toString()

                val luas = inputSisi.toInt() * inputSisi.toInt()
                textLuas.text = luas.toString()
            }

        }
        if (v?.id == R.id.btnClear) {
            editSisi.setText("");
            textKeliling.setText("");
            textLuas.setText("");
        }
    }

}