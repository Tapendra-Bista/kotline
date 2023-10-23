package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    private  lateinit var  myTextView: TextView
    private  lateinit var  image:ImageView
    private lateinit var  toggle:ToggleButton
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
myTextView = findViewById(R.id.textview)
        image = findViewById(R.id.image)
        toggle = findViewById(R.id.toggle)
toggle.setOnClickListener {
    if (toggle.isChecked){
        toggle.setBackgroundColor(Color.GREEN)
        image.isVisible = false
        myTextView.text = "Image isn't visible now  !"
    }else {
        image.isVisible = true
        toggle.setBackgroundColor(Color.RED)
        myTextView.text = "Image is visible now  !"
    }


}
    }
}