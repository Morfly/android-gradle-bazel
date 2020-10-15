package org.morfly.gradle.app;

import androidx.databinding.BindingAdapter;
import android.widget.TextView;


public class BindingAdapters {

    @BindingAdapter("text")
    public static void text(TextView view, String text) {
        view.setText(text);
    }

    @BindingAdapter("magic_number")
    public static void customText(TextView view, int magicNumber) {
        view.setText(magicNumber + "");
    }
}

