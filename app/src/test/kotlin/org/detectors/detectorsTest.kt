package org.detectors

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.detectors.int.IntDetector
import org.detectors.float.FloatDetector
import org.detectors.binary.BinaryDetector
import org.detectors.email.EmailDetector
import org.detectors.password.PasswordDetector
import org.detectors.password.FirstPasswordState

class DetectorsTest {
    @Test
    fun intGoodInput(){
        assertTrue(IntDetector().isValid("1"))
        assertTrue(IntDetector().isValid("123"))
        assertTrue(IntDetector().isValid("34523423524345345243460"))
    }
    @Test
    fun intBadInput(){
        assertFalse(IntDetector().isValid(""))
        assertFalse(IntDetector().isValid("0123"))
        assertFalse(IntDetector().isValid("123a"))
        assertFalse(IntDetector().isValid("0"))
    }
    @Test
    fun FloatGoodInput(){
        assertTrue(FloatDetector().isValid("1.0"))
        assertTrue(FloatDetector().isValid("123.34"))
        assertTrue(FloatDetector().isValid("0.20000"))
        assertTrue(FloatDetector().isValid("12349871234.12340981234098"))
        assertTrue(FloatDetector().isValid(".123"))
    }
    @Test
    fun FloatBadInput(){
        assertFalse(FloatDetector().isValid("a"))
        assertFalse(FloatDetector().isValid(""))
        assertFalse(FloatDetector().isValid(".a"))
        assertFalse(FloatDetector().isValid("0"))
        assertFalse(FloatDetector().isValid("123"))
        assertFalse(FloatDetector().isValid("123a"))
        assertFalse(FloatDetector().isValid("123.123."))
        assertFalse(FloatDetector().isValid("123.02a"))
        assertFalse(FloatDetector().isValid("123."))
        assertFalse(FloatDetector().isValid("012.4"))
    }
    @Test
    fun BinaryGoodInput(){
        assertTrue(BinaryDetector().isValid("1"))
        assertTrue(BinaryDetector().isValid("11"))
        assertTrue(BinaryDetector().isValid("101"))
        assertTrue(BinaryDetector().isValid("111111"))
        assertTrue(BinaryDetector().isValid("10011010001"))
    }
    @Test
    fun BinaryBadInput(){
        assertFalse(BinaryDetector().isValid(""))
        assertFalse(BinaryDetector().isValid("01"))
        assertFalse(BinaryDetector().isValid("10"))
        assertFalse(BinaryDetector().isValid("1000010"))
        assertFalse(BinaryDetector().isValid("100a01"))
        assertFalse(BinaryDetector().isValid("11a01"))
    }
    @Test
    fun EmailGoodInput() {
        assertTrue(EmailDetector().isValid("a@b.c"))
        assertTrue(EmailDetector().isValid("joseph.ditton@usu.edu"))
        assertTrue(EmailDetector().isValid("{}*$.&$*(@*$%&.*&*"))
    }
    @Test
    fun EmailBadInput() {
        assertFalse(EmailDetector().isValid("@b.c"))
        assertFalse(EmailDetector().isValid("a@b@c.com"))
        assertFalse(EmailDetector().isValid("a.b@b.b.c"))
        assertFalse(EmailDetector().isValid("a b@c.com"))
        assertFalse(EmailDetector().isValid(""))
        assertFalse(EmailDetector().isValid("a"))
        assertFalse(EmailDetector().isValid("a@"))
        assertFalse(EmailDetector().isValid("a@b"))
        assertFalse(EmailDetector().isValid("a@b."))
        assertFalse(EmailDetector().isValid("a@@"))
        assertFalse(EmailDetector().isValid("a@b.."))
    }
    @Test
    fun PasswordGoodInput() {
        assertTrue(PasswordDetector().isValid("aaaaH!aa"))
        assertTrue(PasswordDetector().isValid("1234567*9J"))
        assertTrue(PasswordDetector().isValid("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"))
    }
    @Test
    fun PasswordBadInput() {
        assertFalse(FirstPasswordState().validEnd)
        assertFalse(PasswordDetector().isValid("a"))
        assertFalse(PasswordDetector().isValid("aaaaaaaa!a"))
        assertFalse(PasswordDetector().isValid("aaaaaaaa!"))
        assertFalse(PasswordDetector().isValid("aaaHaaaaa"))
        assertFalse(PasswordDetector().isValid("aaaaaaaaH"))
        assertFalse(PasswordDetector().isValid("Abbbbbbbb!"))
        assertFalse(PasswordDetector().isValid("Abbbbbbbb!!"))
        assertFalse(PasswordDetector().isValid("Abbbbbbbb!a!"))
    }

}