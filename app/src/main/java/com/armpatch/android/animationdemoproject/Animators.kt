package com.armpatch.android.animationdemoproject

import android.animation.Animator
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.view.View

fun getSpinAnimator(view: View): Animator {
    val spinAnimator = ObjectAnimator.ofFloat(view, View.ROTATION, 0f, 360f)
    spinAnimator.duration = 300

    return spinAnimator
}

fun getFadeAnimator(view: View): Animator {
    val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, 0.5f,1f)
    val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.5f,1f)
    val alpha = PropertyValuesHolder.ofFloat(View.ALPHA, 0f, 1f)

    val spinAnimator = ObjectAnimator.ofPropertyValuesHolder(view, scaleX, scaleY, alpha)
    spinAnimator.duration = 300

    return spinAnimator
}

fun getShakeAnimators(view: View): List<Animator> {
    val translationX1 = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, 0f, 20f)
    val translationX2 = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, 20f, -20f)
    val translationX3 = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, -20f, 0f)

    val shakeAnimator1 = ObjectAnimator.ofPropertyValuesHolder(view,translationX1)
    val shakeAnimator2 = ObjectAnimator.ofPropertyValuesHolder(view,translationX2)
    val shakeAnimator3 = ObjectAnimator.ofPropertyValuesHolder(view,translationX3)

    shakeAnimator1.duration = 100
    shakeAnimator2.duration = 100
    shakeAnimator3.duration = 100

    return listOf(shakeAnimator1, shakeAnimator2, shakeAnimator3)
}

