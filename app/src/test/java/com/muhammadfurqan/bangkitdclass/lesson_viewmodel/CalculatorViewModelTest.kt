package com.muhammadfurqan.bangkitdclass.lesson_viewmodel

import org.junit.Test

/**
 * @author by furqan on 23/04/2021
 */
class CalculatorViewModelTest {

    @Test
    fun testCalculationVolume() {
        // given
        val panjang = 10f
        val lebar = 10f
        val tinggi = 10f

        val viewModel = CalculatorViewModel()

        // when
        viewModel.calculateVolume(panjang, lebar, tinggi)

        // then
        assert(viewModel.result == 1000f)
    }

}