package com.ali.demo.marketplace

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar

class LoginActivity : AppCompatActivity() {

    private fun initActionBar(){
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar!!.setHomeAsUpIndicator(android.R.drawable.arrow_down_float)
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.title = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//        initActionBar()
    }
}
