package com.example.myfilemanager.presentation

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfilemanager.R

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var textView: TextView
    var imageView: ImageView

    init {
        textView = itemView.findViewById(R.id.file_name_text_view)
        imageView = itemView.findViewById(R.id.icon_view)
    }
}
