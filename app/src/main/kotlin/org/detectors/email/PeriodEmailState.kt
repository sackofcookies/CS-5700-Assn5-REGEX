package org.detectors.email

import org.detectors.State
import org.detectors.InvalidState

class PeriodEmailState: State{
    override val validEnd = false
    override fun consumeLetter(string: String): State {
        if (string in " @"){
            return InvalidState()
        }
        else if (string in "."){
            return PeriodFoundEmailState()
        }
        else {
            return this
        }
    }
}