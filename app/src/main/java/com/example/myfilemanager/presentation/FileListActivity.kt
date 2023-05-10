package com.example.myfilemanager.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfilemanager.databinding.ActivityFileListBinding


class FileListActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityFileListBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}