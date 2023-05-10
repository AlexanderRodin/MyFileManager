package com.example.myfilemanager.presentation

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfilemanager.databinding.ActivityFileListBinding
import java.io.File


class FileListActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityFileListBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val path = intent.getStringExtra("path")
        val root = path?.let { File(it) }
        val filesAndFolders: Array<File> = root!!.listFiles() as Array<File>

        if (filesAndFolders.isEmpty()) {
            binding.noFilesTextview.visibility = View.VISIBLE
            return
        }
        binding.noFilesTextview.visibility = View.INVISIBLE

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MyAdapter(applicationContext, filesAndFolders)


    }
}