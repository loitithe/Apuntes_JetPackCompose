package com.example.apuntes_jetpackcompose.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var counterState = mutableStateOf(0)
    fun increment() {
        counterState.value++
    }
}