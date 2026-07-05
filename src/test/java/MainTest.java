import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Aufgabe 1 – sum()
    @Test
    void sum_shouldReturn5_whenGiven2And3() {
        //GIVEN
        int a = 2;
        int b = 3;
        int expected = 5;
        //WHEN
        int actual = Main.sum(a, b);
        //THEN
        assertEquals(expected, actual);
    }

    //Aufgabe 2 – isEven()
    @Test
    void isEven_shouldReturnTrue_whenGiven4() {
        assertTrue(Main.isEven(4));
    }
    @Test
    void isEven_shouldReturnFalse_whenGiven5() {
        assertFalse(Main.isEven(5));
    }

    //Aufgabe 3 – getFirstCharacter()
    @Test
    void getFirstCharacter_shouldReturnH_whenGivenHallo() {
        assertEquals("H", Main.getFirstCharacter("Hallo"));
    }
    @Test
    void getFirstCharacter_shouldReturnNull_whenGivenNull() {
        assertNull(Main.getFirstCharacter(null));
    }

    @Test
    void getFirstCharacter_shouldReturnNull_whenGivenEmptyString() {
        assertNull(Main.getFirstCharacter(""));
    }

    //Level 2: Medium
    //Aufgabe 4 – reverseString()
    @Test
    void reverseString_shouldReturnAvaj_whenGivenJava() {
        assertEquals("avaJ", Main.reverseString("Java"));
    }
    @Test
    void reverseString_shouldReturnOllah_whenGivenHallo() {
        assertEquals("ollaH", Main.reverseString("Hallo"));
    }
    @Test
    void reverseString_shouldReturnNull_whenGivenNull() {
        assertNull(Main.reverseString(null));
    }

    //Aufgabe 5 – isPalindrome()
    @Test
    void isPalindrome_shouldReturnTrue_whenGivenOtto() {
        assertTrue(Main.isPalindrome("Otto"));
    }

    @Test
    void isPalindrome_shouldReturnTrue_whenGivenAbcdcba() {
        assertTrue(Main.isPalindrome("abcdcba"));
    }
    @Test
    void isPalindrome_shouldReturnFalse_whenGivenJava() {
        assertFalse(Main.isPalindrome("Java"));
    }

    //Aufgabe 6 – countVowels()
    @Test
    void countVowels_shouldReturn2_whenGivenHallo() {
        assertEquals(2, Main.countVowels("Hallo"));
    }
    @Test
    void countVowels_shouldReturn2_whenGivenAnna() {
        assertEquals(2, Main.countVowels("Anna"));
    }

    //Level 3: Bonus
    //Aufgabe 7 – factorial()
    @Test
    void factorial_shouldReturn120_whenGiven5() {
        assertEquals(120, Main.factorial(5));
    }
    @Test
    void factorial_shouldReturn1_whenGiven0() {
        assertEquals(1, Main.factorial(0));
    }
    @Test
    void factorial_shouldThrowException_whenGivenMinus1() {
        assertThrows(IllegalArgumentException.class, () -> Main.factorial(-1));
    }

    //Aufgabe 8 – fibonacci()
    @Test
    void fibonacci_shouldReturn8_whenGiven6() {
        assertEquals(8, Main.fibonacci(6));
    }
    @Test
    void fibonacci_shouldReturn55_whenGiven10() {
        assertEquals(55, Main.fibonacci(10));
    }
    @Test
    void fibonacci_shouldThrowException_whenGivenMinus2() {
        assertThrows(IllegalArgumentException.class, () -> Main.fibonacci(-2));
    }

    //Aufgabe 9 – mergeArrays()
    @Test
    void mergeArrays_shouldMergeTwoArrays() {
        //GIVEN
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4, 5};
        //WHEN
        int[] expected = {1, 2, 3, 4, 1, 2, 3, 4, 5};
        //THEN
        assertArrayEquals(expected,  Main.mergeArrays(a, b));
    }

}