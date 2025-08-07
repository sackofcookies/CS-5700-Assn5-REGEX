package org.detectors.email

import org.detectors.State
import org.detectors.InvalidState

class FirstEmailState: State{
    override val validEnd = false
    override fun consumeLetter(string: String): State {
        if (string in " "){
            return InvalidState()
        }
        else if (string in "@"){
            return AtEmailState()
        }
        else {
            return this
        }
    }
}