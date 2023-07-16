package com.awakelab.oskar.ejercicio10kotlin

class FoldablePhone(isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {
    var isFoldablePhone: Boolean = false
    override fun switchOn() {
        if (!isFoldablePhone) {
            isScreenLightOn = true
        }
    }

    fun foldableOpen() {
        isFoldablePhone = true
    }

    fun foldableClose() {
        isFoldablePhone = false
    }
}

