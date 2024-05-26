package com.example.aaglory

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aaglory.databinding.ActivityBodyCareBinding


class BodyCare : AppCompatActivity() {
    private lateinit var binding: ActivityBodyCareBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBodyCareBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Misalkan Anda memiliki beberapa CardView di layout activity_home.xml
        binding.BodySerumCard.setOnClickListener {
            val intent = Intent(this, BodySerum::class.java)
            startActivity(intent)
        }
    }

}