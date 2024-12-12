package com.example.customisedalertbox

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //First create a variable of type dialogue
lateinit var dialog : Dialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.btnClick)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

        //creating variable for the  custom_dialogue.xml design
        val buttonGood = findViewById<Button>(R.id.btnGood)
        val buttonFeedback = findViewById<Button>(R.id.btnFeedback)

        //now i am setting click listeners
        buttonGood.setOnClickListener {
            dialog.dismiss()
        }
        buttonFeedback.setOnClickListener {
            //giving toast
            Toast.makeText(this,"Your feedback is successfully submitted",Toast.LENGTH_SHORT).show()
        }

        myButton.setOnClickListener {
            dialog.show()
        }

    }
}
