package org.detectors.Float

import org.detectors.State
import org.detectors.DIGITS
import org.detectors.InvalidState
import org.detectors.NON_ZERO_DIGITS

class FirstFloatState: State{
    override val validEnd = false
    override fun consumeLetter(string: String): State {
        if (string in NON_ZERO_DIGITS){
            return DigitsFloatState()
        }
        else if (string in "."){
            return PeriodFloatState()
        }
        else if (string in "0"){
            return ZeroFloatState()
        }
        else {
            return InvalidState()
        }
    }
}