import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class NormalInputKtTest {

    @Test
    fun 入力例_1() {
        val input =
                "1 2 3"
        val output =
                "123"

        assertIO(input, output);
    }


    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        func()

        assertEquals(sysOut.toString(), output + System.lineSeparator())
    }
}
