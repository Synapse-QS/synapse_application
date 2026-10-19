package com.synapse.social.studioasinc.data.crypto

import java.util.Base64
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class SignalSafetyNumberGeneratorTest {
    private val keyA = Base64.getEncoder().encodeToString(byteArrayOf(1, 3, 5, 7, 9))
    private val keyB = Base64.getEncoder().encodeToString(byteArrayOf(2, 4, 6, 8, 10))

    @Test
    fun generatesSixtyDigitsInTwelveFiveDigitGroups() {
        val code = SignalSafetyNumberGenerator.generate("alice", keyA, "bob", keyB)
        assertEquals(60, code.length)
        assertTrue(code.all { it.isDigit() })
        assertEquals(12, code.chunked(5).size)
    }

    @Test
    fun bothParticipantsGenerateTheSameOrderIndependentCode() {
        val alice = SignalSafetyNumberGenerator.generate("alice", keyA, "bob", keyB)
        val bob = SignalSafetyNumberGenerator.generate("bob", keyB, "alice", keyA)
        assertEquals(alice, bob)
    }

    @Test
    fun changingAnIdentityKeyChangesTheCode() {
        val original = SignalSafetyNumberGenerator.generate("alice", keyA, "bob", keyB)
        val changed = SignalSafetyNumberGenerator.generate("alice", keyA, "bob", keyA)
        assertNotEquals(original, changed)
    }
}
