package com.rtid.calrd.BangunDatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.R

class BelahKetupatActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editd1 : EditText
    private lateinit var editd2 : EditText
    private lateinit var textKel    : TextView
    private lateinit var textLuas   : TextView
    private lateinit var buttonHit  : Button
    private lateinit var buttonCle  : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belah_ketupat)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val actionBar = supportActionBar
        actionBar!!.title = "Hitung Belah Ketupat"
        actionBar.setDisplayShowTitleEnabled(true)

        editd1 = findViewById(R.id.edtD1)
        editd2 = findViewById(R.id.edtD2)
        textKel = findViewById(R.id.txtKeliling)
        textLuas = findViewById(R.id.txtLuas)
        buttonHit = findViewById(R.id.btnHitung)
        buttonCle = findViewById(R.id.btnClear)

        buttonHit.setOnClickListener(this)
        buttonCle.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v?.id== R.id.btnHitung){
            val inputd1 = editd1.text.toString().trim()
            val inputd2 = editd2.text.toString().trim()

            var isEmptyField = false

            if (inputd1.isEmpty()){
                isEmptyField = true
                editd1.error = "Tidak boleh kosong"
            }

            if (inputd2.isEmpty()){
                isEmptyField = true
                editd2.error = "Tidak boleh kosong"
            }

            if (!isEmptyField){
                val kel = 4 * inputd1.toDouble()
                textKel.text = kel.toString()

                val luas = inputd1.toDouble()*inputd2.toDouble()/2
                textLuas.text = luas.toString()
            }

        }
        if (v?.id == R.id.btnClear){
            editd1.setText("");
            editd2.setText("");
            textLuas.setText("");
            textKel.setText("");
        }
    }
}