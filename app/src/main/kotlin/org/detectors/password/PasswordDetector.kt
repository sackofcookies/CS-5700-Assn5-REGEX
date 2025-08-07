package org.detectors.password

import org.detectors.Detector
import org.detectors.State

class PasswordDetector: Detector(){
    
    override protected var state: State = FirstPasswordState()
    override fun otherConditions(string: String) = (string.length >= 8)
}