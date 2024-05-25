package com.example.aaglory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aaglory.databinding.ActivityLipsBinding


class Lips: AppCompatActivity() {
    private lateinit var binding: ActivityLipsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLipsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}