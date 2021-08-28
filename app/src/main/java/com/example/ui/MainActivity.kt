package com.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ui.databinding.ActivityMainBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val database = Firebase.database
        val ref = database.reference

        binding.buttonClicked.setOnClickListener{
            ref.child("clicked").setValue("button clicked!")
        }
    }
}