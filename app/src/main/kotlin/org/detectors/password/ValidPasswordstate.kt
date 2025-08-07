package org.detectors.password

import org.detectors.State
import org.detectors.InvalidState
import org.detectors.SPECIAL_CHARS

class ValidPasswordState: State{
    override val validEnd = true
    override fun consumeLetter(string: String): State {
        if (string in SPECIAL_CHARS){
            return CapitalSpecialPasswordState()
        }
        else {
            return this
        }
    }
}