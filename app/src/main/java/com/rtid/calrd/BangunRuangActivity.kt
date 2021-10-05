package com.rtid.calrd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.rtid.calrd.BangunRuang.*

class BangunRuangActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bangun_ruang)

        val buttonKubus: Button = findViewById(R.id.btnKubus)
        buttonKubus.setOnClickListener(this)

        val buttonBalok: Button = findViewById(R.id.btnBalok)
        buttonBalok.setOnClickListener(this)

        val buttonPrisma: Button = findViewById(R.id.btnPrisma)
        buttonPrisma.setOnClickListener(this)

        val buttonLimas: Button = findViewById(R.id.btnLimas)
        buttonLimas.setOnClickListener(this)

        val buttonKerucut: Button = findViewById(R.id.btnKerucut)
        buttonKerucut.setOnClickListener(this)

        val buttonTabung: Button = findViewById(R.id.btnTabung)
        buttonTabung.setOnClickListener(this)

        val buttonBola: Button = findViewById(R.id.btnBola)
        buttonBola.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btnKubus -> intent.run {
                    val intentKubus = Intent(this@BangunRuangActivity, KubusActivity::class.java)
                    startActivity(intentKubus)
                }
                R.id.btnBalok -> intent.run {
                    val intentKubus = Intent(this@BangunRuangActivity, BalokActivity::class.java)
                    startActivity(intentKubus)
                }
                R.id.btnPrisma -> intent.run {
                    val intentPrisma = Intent(this@BangunRuangActivity, PrismaActivity::class.java)
                    startActivity(intentPrisma)
                }
                R.id.btnLimas -> intent.run {
                    val intentLimas = Intent(this@BangunRuangActivity, LimasActivity::class.java)
                    startActivity(intentLimas)
                }
                R.id.btnKerucut -> intent.run {
                    val intentKerucut =
                        Intent(this@BangunRuangActivity, KerucutActivity::class.java)
                    startActivity(intentKerucut)
                }
                R.id.btnTabung -> intent.run {
                    val intentTabung = Intent(this@BangunRuangActivity, TabungActivity::class.java)
                    startActivity(intentTabung)
                }
                R.id.btnBola -> intent.run {
                    val intentBola = Intent(this@BangunRuangActivity, BolaActivity::class.java)
                    startActivity(intentBola)
                }
            }
        }
    }
}