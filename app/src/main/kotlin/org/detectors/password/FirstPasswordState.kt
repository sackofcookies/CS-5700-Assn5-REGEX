package org.detectors.password

import org.detectors.State
import org.detectors.InvalidState
import org.detectors.SPECIAL_CHARS
import org.detectors.CAPITALS

class FirstPasswordState: State{
    override val validEnd = false
    override fun consumeLetter(string: String): State {
        if (string in SPECIAL_CHARS){
            return SpecialPasswordState()
        }
        else if (string in CAPITALS){
            return CapitalPasswordState()
        }
        else {
            return this
        }
    }
}