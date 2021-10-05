package com.rtid.calrd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.rtid.calrd.BangunDatar.*

class BangunDatarActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bangun_datar)


        val actionBar = supportActionBar
        actionBar!!.setTitle("Hitung Bangun Datar")
        actionBar.setDisplayShowTitleEnabled(true)

        val btnMovePersegi: Button = findViewById(R.id.persegi)
        btnMovePersegi.setOnClickListener(this)

        val btnMoverPPanjang: Button = findViewById(R.id.persegipanjang)
        btnMoverPPanjang.setOnClickListener(this)

        val btnMoveSegitiga: Button = findViewById(R.id.segita)
        btnMoveSegitiga.setOnClickListener(this)

        val btnTrapesium: Button = findViewById(R.id.trapesium)
        btnTrapesium.setOnClickListener(this)

        val btnMoveJajargenjang: Button = findViewById(R.id.jajargenjang)
        btnMoveJajargenjang.setOnClickListener(this)

        val btnMoveBelahKetupat: Button = findViewById(R.id.belahketupa)
        btnMoveBelahKetupat.setOnClickListener(this)

        val btnMoveLayang: Button = findViewById(R.id.layanglayang)
        btnMoveLayang.setOnClickListener(this)

        val btnMoveLingkaran: Button = findViewById(R.id.lingkaran)
        btnMoveLingkaran.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.persegi -> intent.run {
                    val intentPersegi =
                        Intent(this@BangunDatarActivity, PersegiActivity::class.java)
                    startActivity(intentPersegi)
                }
                R.id.persegipanjang -> intent.run {
                    val intenPersegiPanjang =
                        Intent(this@BangunDatarActivity, PersegiPanjangActivity::class.java)
                    startActivity(intenPersegiPanjang)
                }
                R.id.segita -> intent.run {
                    val intenSegitiga =
                        Intent(this@BangunDatarActivity, SegitigaActivity::class.java)
                    startActivity(intenSegitiga)
                }
                R.id.trapesium -> intent.run {
                    val intentrapesium =
                        Intent(this@BangunDatarActivity, TrapesiumActivity::class.java)
                    startActivity(intentrapesium)
                }
                R.id.jajargenjang -> intent.run{
                    val intenJajargenjang =
                        Intent(this@BangunDatarActivity,JajargenjangActivity::class.java)
                    startActivity(intenJajargenjang)
                }
                R.id.belahketupa -> intent.run {
                    val intenBelahKetupat =
                        Intent(this@BangunDatarActivity, BelahKetupatActivity::class.java)
                    startActivity(intenBelahKetupat)
                }
                R.id.layanglayang -> intent.run {
                    val intenLayang = Intent(this@BangunDatarActivity, LayangActivity::class.java)
                    startActivity(intenLayang)
                }
                R.id.lingkaran -> intent.run {
                    val intenLingkran =
                        Intent(this@BangunDatarActivity, LingkaranActivity::class.java)
                    startActivity(intenLingkran)
                }
            }
        }
    }
}