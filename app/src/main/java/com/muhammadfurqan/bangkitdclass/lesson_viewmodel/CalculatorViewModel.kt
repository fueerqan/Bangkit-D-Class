package com.muhammadfurqan.bangkitdclass.lesson_viewmodel

import androidx.lifecycle.ViewModel

/**
 * @author by furqan on 23/04/2021
 */
class CalculatorViewModel : ViewModel() {

    var result: Float = 0f

    fun calculateVolume(panjang: Float, lebar: Float, tinggi: Float) {
        result = panjang * lebar * tinggi
    }

}