package com.example.petmarket.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.petmarket.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        // tao tên là đào duy mat lon
        super.onCreate(savedInstanceState)
        binding= ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView3.setOnClickListener {
            startActivity(Intent(this@IntroActivity,SignInActivity::class.java))
        }
        binding.startBtn.setOnClickListener {
            startActivity(Intent(this@IntroActivity,MainActivity::class.java))
        }

    }
}