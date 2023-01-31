package com.example.homework24.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.homework24.domain.PictureRepository
import com.example.homework24.domain.PictureUiData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PictureViewModel @Inject constructor(
    private val repository: PictureRepository
) : ViewModel() {

    private val _liveData = MutableLiveData<PictureUiData>()
    val liveData: LiveData<PictureUiData> get() = _liveData

    fun getPicture() {
        val picture = repository.getPicture()
        _liveData.value = picture
    }
}