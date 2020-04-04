package com.linh.observerpattern.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.linh.observerpattern.presentation.MainViewModel
import com.linh.observerpattern.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val viewModel : MainViewModel by inject()

    init {
        viewModel.getPosts()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.attach(textView_main_observableTextView)
    }

}
