package io.monkeypatch.mktd4.ex6

import org.junit.Assert
import org.junit.Test

class Ex6Test {

    @Test fun testJoinToString() {
        Assert.assertEquals("The function 'joinOptions' is implemented incorrectly", "[yes, no, may be]", joinOptions(listOf("yes", "no", "may be")))
    }

    @Test fun testVarArgs() {
        Assert.assertEquals("The function 'joinVarArgsOptions' is implemented incorrectly", "[yes, no, may be]", joinVarArgsOptions("yes", "no", "may be"))
    }
}