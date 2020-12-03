package com.skill_factory.unit7

import androidx.databinding.ObservableDouble
import androidx.databinding.ObservableInt

class User(_cash: Double) {
    val cashObservable = ObservableDouble(_cash)
    var cash = _cash
    set(value) {
        field = value
        cashObservable.set(value)
    }
}
