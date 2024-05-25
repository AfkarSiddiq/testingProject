package com.example.aaglory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aaglory.databinding.ActivitySerumWajahBinding


class SerumWajah : AppCompatActivity() {
    private lateinit var binding: ActivitySerumWajahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySerumWajahBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}