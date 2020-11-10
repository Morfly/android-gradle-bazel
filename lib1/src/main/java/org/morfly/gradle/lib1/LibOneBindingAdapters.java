package org.morfly.gradle.lib1;

import android.widget.TextView;

import androidx.databinding.BindingAdapter;

public class LibOneBindingAdapters {

    @BindingAdapter("lib_number")
    public static void customText(TextView view, int libNumber) {
        view.setText(libNumber + " (as lib number)");
    }
}
