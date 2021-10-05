package com.rtid.calrd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val actionBar = supportActionBar
        actionBar!!.setTitle("Profile")
        actionBar.setDisplayShowTitleEnabled(true)


    }
}