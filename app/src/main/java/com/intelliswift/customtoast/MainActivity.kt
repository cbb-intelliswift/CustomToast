package com.intelliswift.customtoast

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.intelliswift.customtoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var animateIcon: Boolean = false
    private var changeFont: Boolean = false
    private var setCustomIcon: Boolean = false
    private var setCustomBackground: Boolean = false
    private var changeTextColor: Boolean = false
    private var setCustomIconAnim: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {

            animateIconSwitch.setOnCheckedChangeListener { _, isChecked ->
                animateIcon = isChecked
            }
            changeFontSwitch.setOnCheckedChangeListener { _, isChecked ->
                changeFont = isChecked
            }
            customIconSwitch.setOnCheckedChangeListener { _, isChecked ->
                setCustomIcon = isChecked
            }
            customBgSwitch.setOnCheckedChangeListener { _, isChecked ->
                setCustomBackground = isChecked
            }
            textColorSwitch.setOnCheckedChangeListener { _, isChecked ->
                changeTextColor = isChecked
            }
            customIconAnimSwitch.setOnCheckedChangeListener { _, isChecked ->
                setCustomIconAnim = isChecked
            }

            defaultBtn.setOnClickListener {
                CustomToast.customToast(
                    context = this@MainActivity,
                    message = "This is Default Toast!",
                    duration = CustomToast.LENGTH_SHORT,
                    type = CustomToast.DEFAULT,
                    isIconAnimated = animateIcon,
                    customIcon = if (setCustomIcon) R.drawable.intelliswift else null,
                    font = if (changeFont) R.font.helveticabold else null,
                    customBackground = if (setCustomBackground) R.drawable.bg_custom_toastic else null,
                    textColor = if (changeTextColor) Color.RED else null,
                    customIconAnimation = if (setCustomIconAnim) R.anim.bounce else null
                ).show()
            }
        }
    }
}