package com.example.praktikum7.viewmodel

import android.R
import androidx.compose.runtime.mutableStateOf

class SiswaViewModel : viewmodel() {
    private val _statusUI = mutableStateFlow(siswa())

    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(ls:MutableList<String>){
        _statusUI.update {statusSaatIni ->
            statusSaatIni.copy(
                nama = ls[0],
                gender = ls[1],
            )
        }
    }



}