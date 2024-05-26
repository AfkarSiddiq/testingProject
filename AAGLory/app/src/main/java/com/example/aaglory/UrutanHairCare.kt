package com.example.aaglory

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aaglory.databinding.ActivityUrutanHairCareBinding


class UrutanHairCare : AppCompatActivity() {
    private lateinit var binding: ActivityUrutanHairCareBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUrutanHairCareBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Misalkan Anda memiliki beberapa CardView di layout activity_home.xml
//        binding.urutanHairCareCard.setOnClickListener {
//            val intent = Intent(this, SerumWajah::class.java)
//            startActivity(intent)
//        }
    }

}