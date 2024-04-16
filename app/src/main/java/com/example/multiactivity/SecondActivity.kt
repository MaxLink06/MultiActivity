package com.example.multiactivity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var textName: TextView
    private lateinit var textProfession: TextView
    private lateinit var textSociety: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
        button = findViewById(R.id.button)
        textName = findViewById(R.id.textViewInputName)
        textProfession = findViewById(R.id.textViewInputProfession)
        textSociety = findViewById(R.id.textViewInputSociety)
        val intent = intent
        val name = intent.getStringExtra("Name")
        val profession = intent.getStringExtra("Profession")
        val society = intent.getStringExtra("Society")
        textName.text = name
        textProfession.text = profession
        textSociety.text = society
    }
}