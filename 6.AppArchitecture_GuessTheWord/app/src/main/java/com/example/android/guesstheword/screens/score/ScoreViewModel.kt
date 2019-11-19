package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class ScoreViewModel(finalScore : Int) : ViewModel() {

    private val _score = MutableLiveData<Int>()
    val score : LiveData<Int>
        get() = _score

    private val _eventPlayAgainClicked = MutableLiveData<Boolean>()
    val eventPlayAgainClicked : LiveData<Boolean>
        get() = _eventPlayAgainClicked

    init {
        Timber.i("Final score is : ${finalScore}")

        _score.value = finalScore
        _eventPlayAgainClicked.value = false
    }

    fun onPlayAgain(){
        _eventPlayAgainClicked.value = true
    }

    fun onPlayAgainCompleted(){
        _eventPlayAgainClicked.value = false
    }

    override fun onCleared() {
        Timber.i("onCleared called")
        super.onCleared()
    }
}