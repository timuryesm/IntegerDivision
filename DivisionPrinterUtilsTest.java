package ua.foxminded.javaspring.integerDivision.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionPrinterUtilsTest {


    @Test
    public void printSubtractionBlock_whenInputAllSameNumbers_thenReturnsSubtractionBlockWithEqualsDigits(){
        String actual  = DivisionPrinterUtils.printInputValues(1,1,1,1,1);
        String expected =
                " 1|1\n" +
                "- -\n" +
                " 1|1\n" +
                "_";

       assertEquals(expected,actual);
    }

    @Test
    public void printInputValues_whenInputNegativeNumbers_thenReturnSubtractionBlockWithNegativeSigns(){
        String actual = DivisionPrinterUtils.printInputValues(-12345, 6, -123, -10, -987);
        String expected =
                " -12345     |-123\n" +
                "-           ------\n" +
                " -10        |8\n" +
                "______";

        assertEquals(expected, actual);
    }
    
    @Test
    public void printInputValues_whenInputZeroDividend_thenReturnSubtractionBlockWithZeroResult() {
        String actual = DivisionPrinterUtils.printInputValues(0, 4, 123, 10, 0);
        String expected =
                " 0   |123\n" +
                "-       ----\n" +
                " 10     |0\n" +
                "____";

        assertEquals(expected, actual);
    }
}
