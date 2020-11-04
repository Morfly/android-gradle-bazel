package org.morfly.gradle.app

//import androidx.appcompat.app.AppCompatActivity
import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
//import org.morfly.gradle.app.ui.R
import org.morfly.gradle.R // gradle
//import org.morfly.gradle.app.databinding.databinding.ActivityMainBinding
import org.morfly.gradle.databinding.ActivityMainBinding // gradle


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel = MainViewModel()
        binding.vm = viewModel
        binding.res = ResViewModel()
    }
}