package org.morfly.gradle.lib1

//import androidx.appcompat.app.AppCompatActivity
import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
//import org.morfly.gradle.app.ui.R
import org.morfly.gradle.lib1.R // gradle
import org.morfly.gradle.lib1.BR // gradle
//import org.morfly.gradle.app.databinding.databinding.ActivityMainBinding

import org.morfly.gradle.lib1.databinding.ActivityMain1Binding // gradle


class Lib1Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main_1)

        val binding: ActivityMain1Binding = DataBindingUtil.setContentView(this, R.layout.activity_main_1)
        val viewModel = MainViewModel1()
        binding.vm1 = viewModel
        BR.vm1
//        binding.res = ResViewModel()
    }
}