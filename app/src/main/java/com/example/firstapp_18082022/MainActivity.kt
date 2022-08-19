package com.example.firstapp_18082022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// Mi primer comentario
/*Mi
multiple comentario
osiosi
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton : Button = findViewById<Button>(R.id.button)
        val myEditText : EditText = findViewById<EditText>(R.id.EditText)
        val myTextView : TextView = findViewById<TextView>(R.id.TextView)

        var myString : String

        myButton.setOnClickListener{




            myString = myEditText.text.toString()
            if (myString == ""){


            }
            myTextView.text = myString

        }



    }
}