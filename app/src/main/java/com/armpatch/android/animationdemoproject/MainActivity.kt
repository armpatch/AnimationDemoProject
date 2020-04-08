package com.armpatch.android.animationdemoproject

import android.animation.Animator
import android.animation.AnimatorSet
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var spinButton: Button
    private lateinit var spinAnimator: Animator

    private lateinit var fadeButton: Button
    private lateinit var fadeAnimator: Animator

    private lateinit var shakeButton: Button
    private lateinit var shakeAnimators: List<Animator>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinButton = findViewById(R.id.spin_button)
        spinAnimator = getSpinAnimator(spinButton)
        spinButton.setOnClickListener { spinAnimator.start() }

        fadeButton = findViewById(R.id.fade_button)
        fadeAnimator = getFadeAnimator(fadeButton)
        fadeButton.setOnClickListener { fadeAnimator.start() }

        shakeButton = findViewById(R.id.shake_button)
        shakeAnimators = getShakeAnimators(shakeButton)
        shakeButton.setOnClickListener { playSet() }
    }

    fun playSet() {
        val animatorSet = AnimatorSet()
        animatorSet.playSequentially(shakeAnimators)
        animatorSet.start()
    }
}
