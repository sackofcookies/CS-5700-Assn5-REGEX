package org.detectors

interface State{
    val validEnd: Boolean
    abstract fun consumeLetter(string: String): State
}