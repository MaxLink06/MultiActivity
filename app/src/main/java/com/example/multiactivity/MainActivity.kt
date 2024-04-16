package com.example.multiactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var editTextName: EditText
    private lateinit var editTextProfession: EditText
    private lateinit var editTextSociety: EditText
    private lateinit var name: String
    private lateinit var profession: String
    private lateinit var society: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
        button = findViewById(R.id.button)
        editTextName = findViewById(R.id.textInputName)
        editTextProfession = findViewById(R.id.textInputProfession)
        editTextSociety = findViewById(R.id.textInputSociety)
        button.setOnClickListener{
            name = editTextName.text.toString()
            profession = editTextProfession.text.toString()
            society = editTextSociety.text.toString()
            val intent = Intent(applicationContext, SecondActivity::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("Profession", profession)
            intent.putExtra("Society", society)
            startActivity(intent)
        }
    }
}