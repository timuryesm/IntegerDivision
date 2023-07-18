package ua.foxminded.javaspring.integerDivision.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionUtilityTest {

    @Test
    void findMaxSubtrahend_whenInput1LikeSubtrahend_thenExpectedMaxSubtrahend10() {

        int actual  = DivisionUtility.findMaxSubtrahend(10,1);
        int expected = 10;

        assertEquals(expected,actual);
    }
    
    @Test
    void findMaxSubtrahend_whenInput5LikeSubtrahend_thenExpectedMaxSubtrahend5() {
        int actual = DivisionUtility.findMaxSubtrahend(51, 5);
        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    void findMaxSubtrahend_whenInput9LikeSubtrahend_thenExpectedMaxSubtrahend9() {
        int actual = DivisionUtility.findMaxSubtrahend(93, 9);
        int expected = 90;
        assertEquals(expected, actual);
    }

    @Test
    void findMaxSubtrahend_whenInput3LikeSubtrahend_thenExpectedMaxSubtrahend0() {
        int actual = DivisionUtility.findMaxSubtrahend(29, 3);
        int expected = 27;
        assertEquals(expected, actual);
    }

}