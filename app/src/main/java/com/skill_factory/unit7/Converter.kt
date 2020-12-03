package com.skill_factory.unit7

import androidx.databinding.InverseMethod


object Converter {
    @JvmStatic
    fun stringToDouble(value: String): Double {
        return if (value.isNotEmpty())
            value.toDouble()
        else 0.0
    }

    @JvmStatic
    @InverseMethod("stringToDouble")
    fun doubleToString(value: Double): String {
        return value.toString()
    }

    @JvmStatic
    fun dollarsToRub(value: Double): Double {
        return value * 75;
    }

    @JvmStatic
    @InverseMethod("dollarsToRub")
    fun rubToDollars(value: Double): Double {
        return value / 75;
    }
}
