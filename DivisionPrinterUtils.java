package ua.foxminded.javaspring.integerDivision.utils;

import java.util.Collections;

public class DivisionPrinterUtils {

    public static String printInputValues(int number, int length, int divisor, int subtrahend, int dividend) {
        int lengthSubtrahend = Integer.toString(subtrahend).length();
        return (String.format(" " + number + "%1$" + length + "s" + divisor + "\n", "|")
                + String.format("-" + "%1$" + (length * 2 - 1) + "s", " ")
                + String.format("%1$" + length + "s" + "\n", " ").join("", Collections.nCopies(length, "-"))
                + String.format("\n" + " " + subtrahend + "%1$" + ((length - lengthSubtrahend) + length) + "s"
                        + dividend / divisor + "\n", "|")
                + String.format(" " + "%1$" + length + "s" + "\n", " ").join("", Collections.nCopies(length, "_")));
    }

    public static String printSubtractionBlock(String indent, int minuendNumber, int maxSubtrahend) {
        return ((String.format("\n" + indent + minuendNumber + "\n") + String.format(indent + "-" + "\n")
                + String.format(indent + maxSubtrahend + "\n") + String.format(indent + "____")));
    }
}
