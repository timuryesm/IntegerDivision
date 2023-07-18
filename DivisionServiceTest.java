package ua.foxminded.javaspring.division;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.foxminded.javaspring.integerDivision.service.DivisionService;


public class DivisionServiceTest {

    @Test
    void printResult_whenInput1000And3Digits_thenReturnDefaultResult() {
        DivisionService divisionService = new DivisionService(1000000,3);
        String expected = " 1000000      |3\n" +
                          "-             -------\n" +
                          " 9            |333333\n"   +
                          "_______\n" +
                          " 10\n" +
                          " -\n" +
                          " 9\n" +
                          " ____\n" +
                          "  10\n" +
                          "  -\n" +
                          "  9\n" +
                          "  ____\n" +
                          "   10\n" +
                          "   -\n" +
                          "   9\n" +
                          "   ____\n" +
                          "    10\n" +
                          "    -\n" +
                          "    9\n" +
                          "    ____\n" +
                          "     10\n" +
                          "     -\n" +
                          "     9\n" +
                          "     ____\n" +
                          "      1";
        assertEquals( expected, divisionService.printResult());
    }

    @Test
    void printResult_whenInput10And5Digits_thenReturnDefaultResult() {
        DivisionService divisionService = new DivisionService(10, 5);
        String expected = " 10 |5\n" +
                          "-   --\n" +
                          " 10 |2\n" +
                          "__\n" +
                          " 0";
        assertEquals(expected, divisionService.printResult());
    }

    @Test
    void printResult_whenInput123456And2Digits_thenReturnDefaultResult() {
        DivisionService divisionService = new DivisionService(123456, 2);
        String expected = " 123456     |2\n" +
                          "-           ------\n" +
                          " 12         |61728\n"   +
                          "______\n" +
                          " 3\n" +
                          " -\n" +
                          " 2\n" +
                          " ____\n" +
                          "  14\n" +
                          "  -\n" +
                          "  14\n" +
                          "  ____\n" +
                          "   5\n" +
                          "   -\n" +
                          "   4\n" +
                          "   ____\n" +
                          "    16\n" +
                          "    -\n" +
                          "    16\n" +
                          "    ____\n" +
                          "     0";
        assertEquals(expected, divisionService.printResult());
    }
    
    @Test
    void printResult_whenInput5678And4Digits_thenReturnDefaultResult() {
        DivisionService divisionService = new DivisionService(5678, 4);
        String expected = " 5678   |4\n" +
                          "-       ----\n" +
                          " 4      |1419\n" +
                          "____\n" +
                          " 16\n" +
                          " -\n" +
                          " 16\n" +
                          " ____\n" +
                          "  7\n" +
                          "  -\n" +
                          "  4\n" +
                          "  ____\n" +
                          "   38\n" +
                          "   -\n" +
                          "   36\n" +
                          "   ____\n" +
                          "    2";
        assertEquals(expected, divisionService.printResult());
    }

}
