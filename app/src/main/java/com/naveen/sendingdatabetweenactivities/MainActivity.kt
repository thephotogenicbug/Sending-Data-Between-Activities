package com.naveen.sendingdatabetweenactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var etName : TextInputEditText
    lateinit var etEmail : TextInputEditText
    lateinit var etPhone : TextInputEditText
    lateinit var signup : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.editTextName)
        etEmail = findViewById(R.id.editTextEmail)
        etPhone = findViewById(R.id.editTextPhone)
        signup = findViewById(R.id.buttonSignup)

        signup.setOnClickListener {

            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val phone = etPhone.text.toString().toLong()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("email", email)
            intent.putExtra("mobile", phone)

            startActivity(intent)


        }
    }
}