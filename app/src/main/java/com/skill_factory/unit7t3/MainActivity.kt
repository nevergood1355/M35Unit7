package com.skill_factory.unit7t3

import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.skill_factory.unit7t3.databinding.ActivityMainBinding

@BindingAdapter(value = ["color1", "color2", "color3"], requireAll = true)
fun setGradientBackground(view: ImageView, color1: Int, color2: Int, color3: Int) {
    val colors = intArrayOf(
        color1, color2, color3)
    val gd = GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, colors)
    gd.cornerRadius = 0F
    view.background = gd
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }
}











