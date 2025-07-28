package org.example.project.utils

fun formatPrice(value: Float): String {
    val rounded = (value * 100).toInt() / 100.0f
    val intPart = rounded.toInt()
    val decimalPart = ((rounded - intPart) * 100).toInt()
    return "€$intPart,${decimalPart.toString().padStart(2, '0')}"
}
