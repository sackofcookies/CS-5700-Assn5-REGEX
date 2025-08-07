package org.detectors.Float

import org.detectors.State
import org.detectors.DIGITS
import org.detectors.InvalidState

class DigitsFloatState: State{
    override val validEnd = false
    override fun consumeLetter(string: String): State {
        if (string in DIGITS){
            return this
        }
        else if (string in "."){
            return PeriodFloatState()
        }
        else {
            return InvalidState()
        }
    }
}