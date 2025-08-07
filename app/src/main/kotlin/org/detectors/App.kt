package org.detectors

import org.detectors.float.FloatDetector

fun main(){
    val string = ".0"
    println(FloatDetector().isValid(string))
}