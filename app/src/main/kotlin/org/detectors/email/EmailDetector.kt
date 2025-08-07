package org.detectors.email

import org.detectors.Detector
import org.detectors.State

class EmailDetector: Detector(){
    
    override protected var state: State = FirstEmailState()
    override fun otherConditions(string: String) = true
}