package com.proshaimaa.bmt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

    }
    fun startBtnClicked(view: View){


        val startIntent = Intent(this,MainActivity::class.java)
        startActivity(startIntent)

    }
}