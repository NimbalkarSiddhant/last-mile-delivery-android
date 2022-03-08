package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openLoginPage(view: View) {
        Toast.makeText(this, "Wait", Toast.LENGTH_SHORT).show()
        val intent = Intent(this,LoginPageActivity::class.java)

        startActivity(intent)
    }

    fun openSignUpPage(view: View) {
        Toast.makeText(this, "Wait", Toast.LENGTH_SHORT).show()
        val intent = Intent(this,SignUpPageActivity::class.java)

        startActivity(intent)
    }

//    fun openMAINactivity2(view: View) {
//        Toast.makeText(this, "Wait", Toast.LENGTH_SHORT).show()
//        val intent = Intent(this,MainActivity2::class.java)
//
//        startActivity(intent)
//    }

//    fun openVehicleDetailsPage(view: View) {
//        Toast.makeText(this, "Wait", Toast.LENGTH_SHORT).show()
//        val intent = Intent(this,vehicleDetailsPage::class.java)
//
//        startActivity(intent)
//    }
}