package com.info.stcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val emailText = findViewById<EditText>(R.id.emailbtn)
        val passText= findViewById<EditText>(R.id.passwordBtn)
        val warningView= findViewById<TextView>(R.id.warningBtn)

        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val regisBtn= findViewById<Button>(R.id.Register)

        val eMail= emailText.text.toString()
        val passWord = passText.text.toString()

        var email= "abcde";
        var pass= "12345";


            val message= "Incorrect email or password";
            warningView.text=message


        loginBtn.setOnClickListener {
            val intent = Intent(this@MainActivity,Viewinformation::class.java)
            startActivity(intent)
        }



        regisBtn.setOnClickListener {
            val intent = Intent(this@MainActivity,RegisterForm::class.java)
            startActivity(intent)
        }




    }
}