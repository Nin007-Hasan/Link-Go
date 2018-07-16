package com.hihasan.linkgo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.content.Intent



class StartActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this@StartActivity, MainActivity::class.java))
        // close splash activity
        finish()
    }

}