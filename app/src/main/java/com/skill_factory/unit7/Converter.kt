package com.skill_factory.unit7

import androidx.databinding.InverseMethod


object Converter {
    @InverseMethod("doubleToString")
    @JvmStatic fun stringToDouble(value: String): Double {
        return if (value.isNotEmpty())
            value.toDouble()
        else 0.0
    }

    @JvmStatic
    fun doubleToString(value: Double): String {
        return String().format("1.#",value)
    }

    @InverseMethod("rubToDollars")
    @JvmStatic
    fun dollarsToRub(value: Double) : Double {
        return value * 75;
    }

    @JvmStatic
    fun rubToDollars(value: Double) : Double {
        return value/ 75;
    }

}
