import junit.framework.TestCase.assertEquals
import org.junit.Test





class BirthDataGeneratorTest {
   private val birthDataGenerator = BirthDateGenerator()
    @Test
    fun test() {


        val expected = "10.03.1967"
        val actual: String = birthDataGenerator.generateDate()
        assertEquals(expected, actual)
    }


}



