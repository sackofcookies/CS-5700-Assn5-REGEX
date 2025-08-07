package org.detectors

import org.detectors.float.FloatDetector
import org.detectors.binary.BinaryDetector
import org.detectors.email.EmailDetector
import org.detectors.password.PasswordDetector

fun main(){
    val string = "Abbbbbbbb!"
    println(PasswordDetector().isValid(string))
}