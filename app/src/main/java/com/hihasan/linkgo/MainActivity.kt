package com.hihasan.linkgo

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.acitivity_custom_link.*
import kotlinx.android.synthetic.main.activity_main.*

/**
 * *Need TO Work on
 * 2. Take input from 2 edittext
 * 3. Get Value & print it into Toast
 */



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        val inflater: LayoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val dialogLayout: View = inflater.inflate(R.layout.acitivity_custom_link, dialog_sign_in)
        builder.setView(dialogLayout)
        builder.setCancelable(false)
       // builder.setTitle("Sign In")
        val fabDialog: AlertDialog = builder.create()

        fab.setOnClickListener { view ->
            Toast.makeText(this,"This press will show Custom Box",Toast.LENGTH_SHORT).show()
            fabDialog.show()

        }

        cancel.setOnClickListener({
            v: View? ->
            Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show()
        })
    }
}


