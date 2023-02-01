package com.example.homework24.data

import com.example.homework24.data.mappers.PictureUiMapper
import com.example.homework24.domain.PictureRepository
import com.example.homework24.domain.PictureUiData
import javax.inject.Inject

class PictureRepositoryImpl @Inject constructor(
    private val service: Server,
    private val mapper: PictureUiMapper
) : PictureRepository {

    override fun getPicture(): PictureUiData {
        val response = service.getPicture()
        return mapper(response)
    }
}
