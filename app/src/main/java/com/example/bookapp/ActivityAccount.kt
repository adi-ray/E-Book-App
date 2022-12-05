package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityAccount : AppCompatActivity() {
    private lateinit var name: TextView
    private lateinit var uid: TextView
    private lateinit var email: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        name = findViewById(R.id.name)
        uid = findViewById(R.id.uid)
        email = findViewById(R.id.email)
        supportActionBar?.hide()

        val namee =   intent.getStringExtra("Name")
        val uidd =   intent.getStringExtra("Uid")
        val emaill =   intent.getStringExtra("Email")

        name.setText("Name : " + namee)
        uid.setText("Uid : " + uidd)
        uid.setText("Email : " + emaill)
    }
}