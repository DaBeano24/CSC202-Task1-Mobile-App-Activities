package com.CSC202Task1.geoquiz
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

const val ANSWER_SHOWN_KEY = "ANSWER_SHOWN_KEY"
class CheatViewsModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {
    // kept in the savedstate handle so that it will survive rotation and process death,
    //otherwise a cheater could just rotate the screen to wipe fact that they had already peeked at the answer.
    var isAnswerShown: Boolean
        get() = savedStateHandle.get(ANSWER_SHOWN_KEY) ?: false
        set(value) = savedStateHandle.set(ANSWER_SHOWN_KEY, value)
}