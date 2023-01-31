package com.example.homework24.data

import com.example.homework24.data.models.PictureResponse
import javax.inject.Inject

class Server @Inject constructor() {

    fun getPicture() = PictureResponse("https://avatars.mds.yandex.net/i?id=bdf8097529e7f0b8c0562a6ad08d423b66fbf055-6018989-images-thumbs&n=13")
}