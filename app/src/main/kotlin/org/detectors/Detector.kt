package org.detectors


abstract class Detector{
    abstract protected var state: State
    abstract protected fun otherConditions(string: String): Boolean   

    fun isValid(string: String): Boolean {
        if (otherConditions(string)){
            for (letter in string){
                state = state.consumeLetter(letter.toString())
            }
            return state.validEnd
        }
        else {
            return false
        }
    }
}