import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

class SerpienteTest {

    @Test
    @DisplayName("Serpiente debe tener más de 0 anillas")
    fun getCuerpo() {
        // Arrange
        val serpiente = Serpiente()
        // Act
        val actual = serpiente.cuerpo
        // Assert
        assertNotNull(actual)
    }

    @Test
    @DisplayName("Una serpiente nueva debe tener edad 1 tras envejecer")
    fun envejecer() {
        // Arrange
        val serpiente = Serpiente()
        val expected = 1
        // Act
        serpiente.envejecer()
        val actual = serpiente.edad
        // Assert
        assertEquals(expected, actual)
    }

    @Test
    @DisplayName("toString() debe devolver la información de la serpiente")
    fun testToString() {
        // Arrange
        val serpiente = Serpiente()
        var patronColores = ""
        for (anilla in serpiente.cuerpo.indices) {
            patronColores += serpiente.cuerpo[anilla].color
        }
        val expected = "Anillas = $patronColores, edad = ${serpiente.edad}"
        // Act
        val actual = serpiente.toString()
        // Assert
        assertEquals(expected, actual)
    }
}