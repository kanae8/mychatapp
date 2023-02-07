package com.m4.mmca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignUp : AppCompatActivity() {

    private lateinit var edtName: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        edtName=findViewById(R.id.edt_name2)
        edtEmail=findViewById(R.id.edt_email2)
        edtPassword=findViewById(R.id.edt_password2)
        btnSignUp=findViewById(R.id.btnSignUp2)

        btnSignUp.setOnClickListener{
            val name=edtName.text.toString()
            val email=edtEmail.text.toString()
            val password=edtPassword.text.toString()
            //signUp(name,email,password)
        }
    }
    //private fun signUp(name: String,email: String,password: String) {

   // }
}