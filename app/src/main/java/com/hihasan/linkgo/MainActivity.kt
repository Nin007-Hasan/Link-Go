package com.hihasan.linkgo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import android.R.string.cancel
import android.app.AlertDialog
import android.app.Dialog
import android.app.PendingIntent.getActivity
import android.content.DialogInterface
import android.view.LayoutInflater



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)



        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
            Toast.makeText(this,"This press will show Custom Box",Toast.LENGTH_SHORT).show()
            //builder.create()
        }
    }

    fun onCreateDialog(savedInstanceState: Bundle): Dialog {
        val builder = AlertDialog.Builder(this)
        // Get the layout inflater
        val inflater = this.getLayoutInflater()

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.acitivity_custom_link, null))
//                // Add action buttons
//                .setPositiveButton(R.string.signin, DialogInterface.OnClickListener { dialog, id ->
//                    // sign in the user ...
//                })
//                .setNegativeButton(R.string.cancel, DialogInterface.OnClickListener { dialog, id -> this@LoginDialogFragment.getDialog().cancel() })
        return builder.create()
    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.menu_main, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        return when (item.itemId) {
//            R.id.action_settings -> true
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
}
