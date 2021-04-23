package com.muhammadfurqan.bangkitdclass.lesson_viewmodel

import androidx.lifecycle.ViewModel

/**
 * @author by furqan on 23/04/2021
 */
class CalculatorViewModel : ViewModel() {

    //    implementation for no live data
    var result: Float = 0f

//    private val _result = MutableLiveData<Float>()
//    val result: LiveData<Float>
//        get() = _result

    fun calculateVolume(panjang: Float, lebar: Float, tinggi: Float) {
//        Implementation for no live data
        result = panjang * lebar * tinggi

//        Live Data
//        _result.value = panjang * lebar * tinggi
//
//        viewModelScope.launch {
//            delay(3000)
//            _result.postValue(0.0101f)
//        }
    }

}