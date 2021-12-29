package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel (finalScore:Int) : ViewModel() {

    fun onPlayAgainComplete() {
        _eventPlayAgain.value = false
    }

    fun onPlayAgain() {
        _eventPlayAgain.value = true
    }
    // The current score
    private val _finalScore = MutableLiveData<Int>()
    val finalScore: LiveData<Int>
        get() = _finalScore

    private val _eventPlayAgain = MutableLiveData<Boolean>()
    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain

    init {
        Log.i("ScoreViewModel","Final score is $finalScore")
    }
}
