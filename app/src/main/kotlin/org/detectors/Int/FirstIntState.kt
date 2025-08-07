package org.detectors.int

import org.detectors.State
import org.detectors.NON_ZERO_DIGITS
import org.detectors.InvalidState

class FirstIntState: State{
    override val validEnd = false
    override fun consumeLetter(string: String): State {
        if (string in NON_ZERO_DIGITS){
            return ValidIntState()
        }
        else {
            return InvalidState()
        }
    }
}