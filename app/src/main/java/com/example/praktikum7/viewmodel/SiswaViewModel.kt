package com.example.praktikum7.viewmodel

import androidx.compose.runtime.mutableStateOf

class SiswaViewModel : viewmodel() {
    private val _statusUI = mutableStateFlow(siswa())

    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()



}