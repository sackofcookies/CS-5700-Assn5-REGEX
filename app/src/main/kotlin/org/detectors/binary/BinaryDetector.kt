package org.detectors.binary

import org.detectors.Detector
import org.detectors.State

class BinaryDetector: Detector(){
    
    override protected var state: State = FirstBinaryState()
    override fun otherConditions(string: String) = true
}