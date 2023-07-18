package ua.foxminded.javaspring.integerDivision.utils;

public class DivisionUtility {

    public static StringBuilder result = new StringBuilder();
    public static StringBuilder quotient = new StringBuilder();
    public static StringBuilder String = new StringBuilder();

    public DivisionUtility() {

    }

    public static String makeDivider(int reminderNumber, int tab) {
        return assemblyString(tab, ' ') + assemblyString(calculateDigit(reminderNumber), '-');
    }

    public static void modifyResulttoview(Integer dividend, Integer divisor) {

        char n = '\n';
        char s = '|';
        int[] index = new int[3];

        for (int i = 0, j = 0; i < result.length(); i++) {
            if (result.charAt(i) == n) {
                index[j] = i;
                j++;
            }
            if (j == 3) {
                break;
            }
        }

        int tab = calculateDigit(dividend) + 1 - index[0];
        result.insert(index[2], assemblyString(tab, ' ') + s + quotient.toString());
        result.insert(index[1], assemblyString(tab, ' ') + s + assemblyString(quotient.length(), '-'));
        result.insert(index[0], s + divisor);
        result.replace(1, index[0], dividend.toString());
    }

    public static int calculateDigit(int i) {
        return (int) Math.log10(i) + 1;
    }

    public static String assemblyString(int numberOfSymbols, char symbol) {

        for (int i = 0; i < numberOfSymbols; i++) {
            String.append(symbol);
        }
        return String.toString();
    }

    public static int findMaxSubtrahend(int number, int subtrahend) {
        int maxSubtrahend = 0;
        if (number >= subtrahend && subtrahend != 0) {
            while (number >= maxSubtrahend + subtrahend) {
                maxSubtrahend += subtrahend;
            }
        }
        return maxSubtrahend;
    }

}
