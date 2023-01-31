package com.example.homework24.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.example.homework24.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val vm by viewModels<PictureViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm.liveData.observe(this) {
            Glide
                .with(this)
                .load(it.picture)
                .into(findViewById<ImageView>(R.id.ivPicture))
        }
        vm.getPicture()
    }
}