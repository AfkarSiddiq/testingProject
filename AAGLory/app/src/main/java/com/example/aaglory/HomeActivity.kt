package com.example.aaglory
import android.content.Intent
import android.os.Bundle
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
//        binding.cardView2.setOnClickListener {
//            val intent = Intent(this, AnotherActivity::class.java)
//            startActivity(intent)
//        }
    }
}