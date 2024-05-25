package com.example.aaglory

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aaglory.databinding.ActivitySkincareBinding


class Skincare : AppCompatActivity() {
    private lateinit var binding: ActivitySkincareBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkincareBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Misalkan Anda memiliki beberapa CardView di layout activity_home.xml
        binding.cardView1.setOnClickListener {
            val intent = Intent(this, SerumWajah::class.java)
            startActivity(intent)
        }
    }

}