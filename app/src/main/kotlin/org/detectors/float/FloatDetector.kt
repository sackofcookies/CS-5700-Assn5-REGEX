package org.detectors.float

import org.detectors.Detector
import org.detectors.State

class FloatDetector: Detector(){
    
    override protected var state: State = FirstFloatState()
    override fun otherConditions(string: String) = true
}