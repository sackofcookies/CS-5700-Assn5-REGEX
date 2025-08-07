package org.detectors.email

import org.detectors.State
import org.detectors.InvalidState

class ValidEmailState: State{
    override val validEnd = true
    override fun consumeLetter(string: String): State {
        if (string in " @."){
            return InvalidState()
        }
        else {
            return this
        }
    }
}