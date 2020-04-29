package com.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_ekran.*
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.user_registration.*

class MainActivity : AppCompatActivity() {

    lateinit var handler:DatabaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_ekran)
/*
        handler= DatabaseHelper(this)

        showHome()
        buttonRegistration.setOnClickListener{
            showRegistration()
        }
        buttonLogin.setOnClickListener()
        {
            showLogIN()
        }

        buttonKayitOl.setOnClickListener{
            handler.insertUserDate(isim.text.toString(),soyad.text.toString(),email_adres.text.toString(),sifre.text.toString())
            showHome()
        }

        buttonGirisYap.setOnClickListener{
            if(handler.userPresent(login_email.text.toString(),login_password.text.toString()))
                Toast.makeText(this,"Giriş Başarılı",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"Email veya şifre hatalı",Toast.LENGTH_SHORT).show()
        }
    }

    private fun showRegistration()
    {
        registration_layout.visibility=View.VISIBLE
        login_layout.visibility=View.GONE
        home_11.visibility=View.GONE
    }
    private fun showLogIN()
    {
        registration_layout.visibility=View.GONE
        login_layout.visibility=View.VISIBLE
        home_11.visibility=View.GONE
    }
    private fun showHome()
    {
        registration_layout.visibility=View.GONE
        login_layout.visibility=View.GONE
        home_11.visibility=View.VISIBLE
    }*/
}
}
