package org.detectors.password

import org.detectors.State
import org.detectors.InvalidState
import org.detectors.SPECIAL_CHARS

class CapitalSpecialPasswordState: State{
    override val validEnd = false
    override fun consumeLetter(string: String): State {
        if (string in SPECIAL_CHARS){
            return this
        }
        else {
            return ValidPasswordState()
        }
    }
}