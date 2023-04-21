package com.example.pixel_effect_

import android.graphics.ColorFilter
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView

object Effect {

    var effectmatrix = floatArrayOf(
        1f, 0f, 0f, 0f, 0f,
        0f, 1f, 0f, 0f, 0f,
        0f, 0f, 1f, 0f, 0f,
        0f, 0f, 0f, 1f, 0f
    )

    fun applyEffectNone(img: ImageView): ImageView {

        //grayscale
        val colorMatrix = floatArrayOf(
            1f, 0f, 0f, 0f, 0f,
            0f, 1f, 0f, 0f, 0f,
            0f, 0f, 1f, 0f, 0f,
            0f, 0f, 0f, 1f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun Effectharsh(img: ImageView): ImageView {
        val scale = 0.256f + 0.2f
        val trancelate = -0.124f * -1.4f + 0.156f
        //grayscale
        val colorMatrix = floatArrayOf(
            scale, 0f, 0f, 0f, 0f,
            0f, 1f, 0f, 0f, 0f,
            trancelate, 0f, scale, 0f, 0f,
            0f, 0f, 0f, 1f, scale
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect1(img: ImageView): ImageView {

        //grayscale
        val colorMatrix = floatArrayOf(
            0.213f, 0.715f, 0.072f, 0f, 0f,
            0.213f, 0.715f, 0.072f, 0f, 0f,
            0.213f, 0.715f, 0.072f, 0f, 0f,
            0f, 0f, 0f, 1f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect2(img: ImageView): ImageView {

        //sepia
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrixSepia)
        img.colorFilter = cf
        return img
    }

    // Convert to grayscale, then apply brown color
    private val colorMatrixSepia: ColorMatrix
        private get() {
            val colorMatrix = ColorMatrix()
            colorMatrix.setSaturation(0f)
            val colorScale = ColorMatrix()
            colorScale.setScale(1f, 1f, 0.8f, 1f)
            // Convert to grayscale, then apply brown color
            colorMatrix.postConcat(colorScale)
            return colorMatrix
        }

    fun applyEffect3(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            0.5f, 0f, 0f, 0f, 0f,
            0f, 0.2f, 0f, 0f, 0f,
            0f, 0f, -1.8f, 0f, 0f,
            -1f, 0f, 0f, 1f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect4(img: ImageView): ImageView {
        val scale = 2f + 1.2f
        val translate = (-.5f * scale + .5f) * 255f
        val colorMatrix = floatArrayOf(
            scale, 0f, 0f, 0f, translate,
            0f, scale, 0f, 0f, translate,
            0f, 0f, scale, 0f, translate,
            0f, 0f, 0f, 1f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect5(img: ImageView): ImageView {
        val scale = 0.5f + 1f
        val translate = (-.5f * scale + .5f) * 255f
        val colorMatrix = floatArrayOf(
            scale, 0f, 0f, 0f, translate,
            0f, scale, 0f, 0f, translate,
            0f, 0f, scale, 0f, translate,
            0f, 0f, 0f, 1f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect6(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            2f, 0f, 0f, 0f, 0f,
            0f, 2f, 0f, 0f, 0f,
            0f, 0f, 2f, 0f, 0f,
            0f, 0f, 0f, 0.5f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect7(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            2f, 0f, 0f, 0f, 0f,
            0f, 2f, 0f, 0f, 0f,
            0f, 0f, 2f, 0f, 0f,
            0f, 0f, 0f, 1f, 0f,
            -0.1f, -0.1f, -0.1f, 0f, 1f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect8(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            0f, 0f, 0f, 0f, 60f,
            0f, 0f, 0f, 0f, 60f,
            0f, 0f, 0f, 0f, 90f,
            -0.213f, -0.715f, -0.072f, 0f, 255f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect9(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            1f, 0f, 0f, 0f, -60f,
            0f, 1f, 0f, 0f, -60f,
            0f, 0f, 1f, 0f, -90f,
            0f, 0f, 0f, 1f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect10(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            1f, 0f, 0f, 0f, -60f,
            0f, 1f, 0f, 0f, -60f,
            0f, 0f, 1f, 0f, -90f,
            0.213f, 0.715f, 0.072f, 0f, 255f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect11(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            1f, 0f, 0f, 0f, -60f,
            0f, 1f, 0f, 0f, -60f,
            0f, 0f, 1f, 0f, -90f,
            -0.213f, -0.715f, -0.072f, 0f, 255f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect12(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            1f, 0f, 0f, 0f, 0f,
            0f, 1f, 0f, 0f, 0f,
            0f, 0f, 1f, 0f, 90f,
            0.213f, 0.715f, 0.072f, 0f, 255f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect13(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            0f, 0f, 0f, 0f, 0f,
            0f, 0f, 0f, 0f, 0f,
            0f, 0f, 0f, 0f, 0f,
            1f, 0f, 0f, 0f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect14(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            1.375f, 0f, 0f, 0f, 0f,
            0f, 1.390625f, 0f, 0f, 0f,
            0f, 0f, 1.1640625f, 0f, 0f,
            0f, 0f, 0f, 1.6796875f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect15(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            1.5234375f, 0f, 0f, 0f, 0f,
            0f, 1.203125f, 0f, 0f, 0f,
            0f, 0f, 1.015625f, 0f, 0f,
            0f, 0f, 0f, 1.28125f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect16(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            1.0390625f, 0f, 0f, 0f, 0f,
            0f, 1.3671875f, 0f, 0f, 0f,
            0f, 0f, 1.5f, 0f, 0f,
            0f, 0f, 0f, 1.4921875f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect17(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            1.5625f, 0f, 0f, 0f, 0f,
            0f, 1.565625f, 0f, 0f, 0f,
            0f, 0f, 1.0f, 0f, 0f,
            0f, 0f, 0f, 1.5234375f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffectnew(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            1.5625f, 0f, 0f, 0f, 0f,
            0f, 1.0f, 0f, 0f, 0f,
            0f, 0f, 1.0f, 0f, 0f,
            0f, 0f, 0f, 1.5234375f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect18(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            0.9609375f, 0f, 0f, 0f, 0f,
            0f, 1.6171875f, 0f, 0f, 0f,
            0f, 0f, 1.40625f, 0f, 0f,
            0f, 0f, 0f, 0.8046875f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect19(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            0.7109375f, 0f, 0f, 0f, 0f,
            0f, 1.34375f, 0f, 0f, 0f,
            0f, 0f, 1.35625f, 0f, 0f,
            0f, 0f, 0f, 1.9921875f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect20(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            1.0703125f, 0f, 0f, 0f, 0f,
            0f, 1.25f, 0f, 0f, 0f,
            0f, 0f, 1.140625f, 0f, 0f,
            0f, 0f, 0f, 1.4140625f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect21(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            1.1953125f, 0f, 0f, 0f, 0f,
            0f, 0.671875f, 0f, 0f, 0f,
            0f, 0f, 0.3984375f, 0f, 0f,
            0f, 0f, 0f, 0.7265625f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }

    fun applyEffect22(img: ImageView): ImageView {
        val colorMatrix = floatArrayOf(
            1.1953125f, 0f, 0f, 0f, 0f,
            0f, 0.671875f, 0f, 0f, 0f,
            0f, 0f, 0.3984375f, 0f, 0f,
            0f, 0f, 0f, 1.8671875f, 0f
        )
        effectmatrix = colorMatrix
        val cf: ColorFilter = ColorMatrixColorFilter(colorMatrix)
        img.colorFilter = cf
        return img
    }
}