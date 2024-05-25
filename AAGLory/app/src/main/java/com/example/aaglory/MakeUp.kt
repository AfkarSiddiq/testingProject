package com.example.aaglory

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aaglory.databinding.ActivityMakeupBinding


class MakeUp : AppCompatActivity() {
    private lateinit var binding: ActivityMakeupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMakeupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Misalkan Anda memiliki beberapa CardView di layout activity_home.xml
        binding.cardView4.setOnClickListener {
            val intent = Intent(this, Lips::class.java)
            startActivity(intent)
        }
    }
}