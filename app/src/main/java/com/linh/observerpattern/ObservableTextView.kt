package com.linh.observerpattern

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView

class ObservableTextView(context: Context, attrs: AttributeSet) :
    androidx.appcompat.widget.AppCompatTextView(context, attrs), Observer {

    override fun update(data: Any) {
        this.text = data.toString()
    }
}