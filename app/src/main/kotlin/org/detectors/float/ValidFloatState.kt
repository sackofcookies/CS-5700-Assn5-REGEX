package org.detectors.float

import org.detectors.State
import org.detectors.DIGITS
import org.detectors.InvalidState

class ValidFloatState: State{
    override val validEnd = true
    override fun consumeLetter(string: String): State {
        if (string in DIGITS){
            return this
        }
        else {
            return InvalidState()
        }
    }
}