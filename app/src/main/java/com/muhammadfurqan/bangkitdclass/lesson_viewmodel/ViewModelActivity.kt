package com.muhammadfurqan.bangkitdclass.lesson_viewmodel

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.lifecycle.ViewModelProvider
import com.muhammadfurqan.bangkitdclass.R

class ViewModelActivity : AppCompatActivity() {

    private lateinit var viewModel: CalculatorViewModel

    private lateinit var etPanjang: AppCompatEditText
    private lateinit var etLebar: AppCompatEditText
    private lateinit var etTinggi: AppCompatEditText
    private lateinit var btnVolume: AppCompatButton
    private lateinit var tvResult: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        viewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        etPanjang = findViewById(R.id.et_panjang)
        etLebar = findViewById(R.id.et_lebar)
        etTinggi = findViewById(R.id.et_tinggi)

        tvResult = findViewById(R.id.tv_result)
        tvResult.text = viewModel.result.toString()

        btnVolume = findViewById(R.id.btn_calculate_volume)
        btnVolume.setOnClickListener {
            onCalculate()
        }
    }

    private fun onCalculate() {
        try {
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            val tinggi = etTinggi.text.toString().toFloat()

            viewModel.calculateVolume(panjang, lebar, tinggi)

            tvResult.text = viewModel.result.toString()

        } catch (t: Throwable) {
            Toast.makeText(this, "Please input the correct number", Toast.LENGTH_SHORT).show()
        }
    }

}