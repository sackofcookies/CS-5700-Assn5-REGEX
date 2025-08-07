package org.detectors.binary

import org.detectors.State
import org.detectors.DIGITS
import org.detectors.InvalidState

class ValidBinaryState: State{
    override val validEnd = true
    override fun consumeLetter(string: String): State {
        if (string in "1"){
            return this
        }
        else if (string in "0"){
            return MiddleBinaryState()
        }
        else {
            return InvalidState()
        }
    }
}