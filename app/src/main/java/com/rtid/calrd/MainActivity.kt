package com.rtid.calrd

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveBangunDatar: Button = findViewById(R.id.btnBangunDatar)
        btnMoveBangunDatar.setOnClickListener(this)

        val btnMoveBangunRuang: Button = findViewById(R.id.btnBangunRuang)
        btnMoveBangunRuang.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btnBangunDatar -> intent.run {
                    val intenBDatar = Intent(this@MainActivity, BangunDatarActivity::class.java)
                    startActivity(intenBDatar)
                }
                R.id.btnBangunRuang -> intent.run {
                    val intentBRuang = Intent(this@MainActivity, BangunRuangActivity::class.java)
                    startActivity(intentBRuang)
                }
            }
        }
    }

    //Kill App with dialog alert
    /*override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage("Are you sure you want to exit?")
            .setCancelable(false)
            .setPositiveButton("Yes",
                DialogInterface.OnClickListener { dialog, id -> super@MainActivity.onBackPressed() })
            .setNegativeButton("No", null)
            .show()
    }*/

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.itmInfo -> {
                startActivity(Intent(this,InfoActivity::class.java))
            }
        }
    }


}