package com.rtid.calrd.BangunDatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.R

class LayangActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editSisi1: EditText
    private lateinit var editSisi2: EditText
    private lateinit var editDiagonal1: EditText
    private lateinit var editDiagonal2: EditText
    private lateinit var textKel: TextView
    private lateinit var textLuas: TextView
    private lateinit var buttonHit: Button
    private lateinit var buttonClear : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layang)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        editSisi1 = findViewById(R.id.edtSisi1)
        editSisi2 = findViewById(R.id.edtSisi2)
        textKel = findViewById(R.id.txtKeliling)
        textLuas = findViewById(R.id.txtLuas)
        buttonHit = findViewById(R.id.btnHitung)
        buttonClear = findViewById(R.id.btnClear)
        editDiagonal2 = findViewById(R.id.edtdiagonal2)
        editDiagonal1 = findViewById(R.id.edtdiagonal1)

        buttonHit.setOnClickListener(this)
        buttonClear.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnHitung) {
            val inputSisi1 = editSisi1.text.toString().trim()
            val inputSisi2 = editSisi2.text.toString().trim()
            val inputDiagonal1 = editDiagonal1.text.toString().trim()
            val inputDiagonal2 = editDiagonal2.text.toString().trim()

            var isEmptyField = false

            if (inputSisi1.isEmpty()) {
                isEmptyField = true
                editSisi1.error = "Tidak boleh kosong"
            }
            if (inputSisi2.isEmpty()) {
                isEmptyField = true
                editSisi2.error = "Tidak boleh kosong"
            }

            if (inputDiagonal1.isEmpty()) {
                isEmptyField = true
                editDiagonal1.error = "Tidak boleh kosong"
            }
            if (inputDiagonal2.isEmpty()) {
                isEmptyField = true
                editDiagonal2.error = "Tidak boleh kosong"
            }
            if (!isEmptyField) {
                val kel =
                    (inputSisi1.toDouble()*2) + (inputSisi2.toDouble()*2)
                textKel.text = kel.toString()

                val luas = (inputDiagonal1.toDouble() * inputDiagonal2.toDouble()) / 2
                textLuas.text = luas.toString()
            }
        }
        if (v?.id == R.id.btnClear) {
            editSisi1.setText("");
            editSisi2.setText("");
            editDiagonal1.setText("");
            editDiagonal2.setText("");
            textKel.setText("");
            textLuas.setText("");
        }
    }
}