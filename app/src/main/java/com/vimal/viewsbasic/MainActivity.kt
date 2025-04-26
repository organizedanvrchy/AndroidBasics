package com.vimal.viewsbasic

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

/* Views
   Simple building block of a user interface.

   Views are small rectangular boxes that can
   be TextView, EditText, or even a button.

   They occupy the area on the screen in a
   rectangular area and are responsible for
   drawing and event handling.
 */

/* ViewGroup
   A special subclass of the View Class that
   serves as a container for multiple Views.

   There are several useful widgets that extend
   the ViewGroup Class, such as LinearLayout.

   Most are actually subclasses of another
   ViewGroup known as Layout.
 */

class MainActivity : AppCompatActivity() {
    lateinit var myTextView: TextView
    lateinit var myEditText: EditText
    lateinit var myButton: Button
    lateinit var myImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Set the content view of an activity to a specified layout.
        setContentView(R.layout.activity_main)

        // Initialize Views
        myTextView = findViewById(R.id.textView1)
        myTextView.setText("Hi there!")

        myEditText = findViewById(R.id.editText1)
        var myText = myEditText.text.toString()

        myButton = findViewById(R.id.button1)
        myButton.setOnClickListener {
            // This is the code that will be executed
            // when the button is clicked.
            Toast.makeText(this, "You're Signed Up, Nice!", Toast.LENGTH_SHORT).show()

            myImageView.setImageResource(R.drawable.cool)
        }

        myImageView = findViewById(R.id.image1)


    }
}

