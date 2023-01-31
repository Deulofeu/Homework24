package com.example.homework24.data.mappers

import com.example.homework24.data.models.PictureResponse
import com.example.homework24.domain.PictureUiData
import javax.inject.Inject

class PictureUiMapper @Inject constructor() {

    operator fun invoke(response: PictureResponse): PictureUiData = with(response) {
        PictureUiData(
            picture = picture.orEmpty()
        )
    }
}