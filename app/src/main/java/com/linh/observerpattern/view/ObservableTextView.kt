package com.linh.observerpattern.view

import android.content.Context
import android.util.AttributeSet
import com.linh.observerpattern.common.utils.observer.Observer

class ObservableTextView(context: Context, attrs: AttributeSet) :
    androidx.appcompat.widget.AppCompatTextView(context, attrs),
    Observer {

    override fun update(data: Any) {
        this.text = data.toString()
    }
}