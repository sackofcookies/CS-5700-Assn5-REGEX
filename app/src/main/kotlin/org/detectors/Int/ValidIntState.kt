package org.detectors.int

import org.detectors.State
import org.detectors.DIGITS
import org.detectors.InvalidState

class ValidIntState: State{
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