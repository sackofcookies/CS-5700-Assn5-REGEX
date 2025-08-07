package org.detectors.password

import org.detectors.State
import org.detectors.InvalidState
import org.detectors.CAPITALS

class SpecialPasswordState: State{
    override val validEnd = false
    override fun consumeLetter(string: String): State {
        if (string in CAPITALS){
            return ValidPasswordState()
        }
        else {
            return this
        }
    }
}