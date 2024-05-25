package com.example.aaglory
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.aaglory.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Misalkan Anda memiliki beberapa CardView di layout activity_home.xml
        binding.cardView3.setOnClickListener {
            val intent = Intent(this, Recomendation::class.java)
            startActivity(intent)
        }

        // Tambahkan OnClickListener untuk CardView lainnya jika ada
        binding.CardViewMakeUp.setOnClickListener {
//            Log.d("HomeActivity", "CardView1 clicked")
            val intent = Intent(this, MakeUp::class.java)
            startActivity(intent)
        }

        binding.CardViewSkincare.setOnClickListener{
            val intent = Intent(this, Skincare::class.java)
            startActivity(intent)
        }

    }
}