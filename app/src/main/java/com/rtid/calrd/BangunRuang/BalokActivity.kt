package com.rtid.calrd.BangunRuang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.storage.StorageVolume
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rtid.calrd.BangunDatar.PersegiPanjangActivity
import com.rtid.calrd.R

class BalokActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editPanjang: EditText
    private lateinit var editLebar: EditText
    private lateinit var editTinggi: EditText
    private lateinit var textVolume: TextView
    private lateinit var textLuasPermukaan: TextView
    private lateinit var buttonHit: Button
    private lateinit var buttonCle : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balok)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        editPanjang = findViewById(R.id.edtPanjang)
        editLebar = findViewById(R.id.edtLebar)
        editTinggi = findViewById(R.id.edtTinggi)
        textVolume = findViewById(R.id.txtVolume)
        textLuasPermukaan = findViewById(R.id.txtLuasPermukaan)
        buttonHit = findViewById(R.id.btnHitung)
        buttonCle = findViewById(R.id.btnClear)

        buttonHit.setOnClickListener(this)
        buttonCle.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btnHitung) {
            val inputPanjang = editPanjang.text.toString().trim()
            val inputLebar = editLebar.text.toString().trim()
            val inputTinggi = editTinggi.text.toString().trim()

            var isEmptyField = false

            if (inputPanjang.isEmpty()){
                isEmptyField = true
                editPanjang.error = "Tidak boleh kosong"
            }

            if (inputLebar.isEmpty()){
                isEmptyField = true
                editLebar.error = "Tidak boleh kosong"
            }

            if (inputTinggi.isEmpty()){
                isEmptyField = true
                editTinggi.error = "Tidak boleh kosong"
            }

            if (!isEmptyField) {
                val volume =
                    inputPanjang.toDouble() * inputLebar.toDouble() * inputTinggi.toDouble()
                textVolume.text = volume.toString()

                val luasPermukaan =
                    ((inputLebar.toDouble() * inputPanjang.toDouble()) + (inputLebar.toDouble() * inputTinggi.toDouble()) + (inputPanjang.toDouble() * inputTinggi.toDouble())) * 2
                textLuasPermukaan.text = luasPermukaan.toString()
            }
        }
        if (v?.id == R.id.btnClear){
            editTinggi.setText("");
            editLebar.setText("");
            editPanjang.setText("");
            textLuasPermukaan.setText("");
            textVolume.setText("");
        }
    }
}