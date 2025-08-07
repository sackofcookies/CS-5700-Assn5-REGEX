package org.detectors

class InvalidState: State{
    override val validEnd = false
    override fun consumeLetter(string: String) = this
}