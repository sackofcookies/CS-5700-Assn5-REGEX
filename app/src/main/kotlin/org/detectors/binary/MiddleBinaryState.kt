package org.detectors.binary

import org.detectors.State
import org.detectors.DIGITS
import org.detectors.InvalidState

class MiddleBinaryState: State{
    override val validEnd = false
    override fun consumeLetter(string: String): State {
        if (string in "0"){
            return this
        }
        else if (string in "1"){
            return ValidBinaryState()
        }
        else {
            return InvalidState()
        }
    }
}