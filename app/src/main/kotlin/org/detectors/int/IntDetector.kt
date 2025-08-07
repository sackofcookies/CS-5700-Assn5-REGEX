package org.detectors.int

import org.detectors.Detector
import org.detectors.State

class IntDetector: Detector(){
    
    override protected var state: State = FirstIntState()
    override fun otherConditions(string: String) = true
}