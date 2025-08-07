package org.detectors

import org.detectors.Float.FloatDetector

fun main(){
    val string = ".0"
    println(FloatDetector().isValid(string))
}