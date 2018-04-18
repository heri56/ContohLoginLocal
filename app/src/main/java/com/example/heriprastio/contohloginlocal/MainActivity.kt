package com.example.heriprastio.contohloginlocal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BtnLogin.setOnClickListener {

            if (EditTextUserName.text.toString().equals("Heri")
                    && EditTextPassword.text.toString().equals("123")) {
                startActivity(Intent(MainActivity@ this, NextActivity::class.java))

            } else {
                val panggilToast = Toast.makeText(applicationContext, "Error", Toast.LENGTH_LONG)
                panggilToast.show()
            }
        }
    }
}
