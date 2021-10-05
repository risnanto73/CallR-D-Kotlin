package com.rtid.calrd.BangunDatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.R
import org.w3c.dom.Text

class LingkaranActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editJari: EditText
    private lateinit var textKel: TextView
    private lateinit var textLuas: TextView
    private lateinit var buttonHit: Button
    private lateinit var buttClear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        editJari = findViewById(R.id.edtJari)
        textKel = findViewById(R.id.txtKeliling)
        textLuas = findViewById(R.id.txtLuas)
        buttClear = findViewById(R.id.btnClear)
        buttonHit = findViewById(R.id.btnHitung)

        buttonHit.setOnClickListener(this)
        buttClear.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnHitung) {
            val inputJari = editJari.text.toString().trim()
            var isEmptyField = false

            if (inputJari.isEmpty()) {
                isEmptyField = true
                editJari.error = "Tidak boleh kosong"
            }

            if (!isEmptyField) {
                val kel = 2 * 22 * inputJari.toDouble() / 7
                textKel.text = kel.toString()

                val luas = 22 * (inputJari.toDouble() * inputJari.toDouble()) / 7
                textLuas.text = luas.toString()
            }
        }

        if (v?.id == R.id.btnClear) {
            editJari.setText("");
            textKel.setText("");
            textLuas.setText("");
        }
    }
}