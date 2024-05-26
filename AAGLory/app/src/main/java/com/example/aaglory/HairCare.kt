package com.example.aaglory

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aaglory.databinding.ActivityHairCareBinding


class HairCare : AppCompatActivity() {
    private lateinit var binding: ActivityHairCareBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHairCareBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Misalkan Anda memiliki beberapa CardView di layout activity_home.xml
        binding.urutanHairCareCard.setOnClickListener {
            val intent = Intent(this, UrutanHairCare::class.java)
            startActivity(intent)
        }
    }

}