package app.src.main.java.org.morfly.gradle.app

import androidx.databinding.BindingAdapter
import android.widget.TextView

@BindingAdapter("text")
fun text(view: TextView, text: String) {
    view.setText(text)
}

@BindingAdapter("magic_number")
fun customText(view: TextView, magicNumber: Int) {
    view.setText(magicNumber.toString() + "")
}