package org.detectors

import org.detectors.float.FloatDetector
import org.detectors.binary.BinaryDetector

fun main(){
    val string = "10101"
    println(BinaryDetector().isValid(string))
}