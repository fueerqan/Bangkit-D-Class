package com.muhammadfurqan.bangkitdclass

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.muhammadfurqan.bangkitdclass.lesson_viewmodel.ViewModelActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnGoToViewModel: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGoToViewModel = findViewById(R.id.btn_go_to_view_model)
        btnGoToViewModel.setOnClickListener {
            navigateToViewModel()
        }
    }

    private fun navigateToViewModel() {
        startActivity(Intent(this, ViewModelActivity::class.java))
    }
}