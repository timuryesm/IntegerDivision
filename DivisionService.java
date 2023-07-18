package ua.foxminded.javaspring.integerDivision.service;


import ua.foxminded.javaspring.integerDivision.utils.DivisionUtility;

import java.util.ArrayList;
import java.util.List;

import static ua.foxminded.javaspring.integerDivision.utils.DivisionPrinterUtils.printInputValues;
import static ua.foxminded.javaspring.integerDivision.utils.DivisionPrinterUtils.printSubtractionBlock;

public class DivisionService {

    private List<Integer> minuendNumbersList = new ArrayList<>();
    private List <Integer> maxSubtrahendList = new ArrayList<>();
    private List <Integer> resultSubtractionList = new ArrayList<>();
    private int indexNextMinuendElement = 0;
    private int dividend;
    private int divisor;

    public DivisionService(int dividend, int divisor)  {

        this.dividend = dividend;
        this.divisor = divisor;
    }

    public String printResult() {
        initializeListsValues();
        String indent = "";
        String result;
        int lengthDividend = Integer.toString(dividend).length();
        result = printInputValues(dividend, lengthDividend, divisor, maxSubtrahendList.get(0), dividend);
        for (int i = 1; i < minuendNumbersList.size(); i++) {
            indent += " ";
            result += printSubtractionBlock(indent, minuendNumbersList.get(i), maxSubtrahendList.get(i));
        }
        result += "\n" + indent + " " + dividend % divisor;
        return result;
    }

    private void initializeListsValues() {
        int minuend;
        int maxSubtrahend;
        int difference = 0;
        while (splitDividendToSeparatedNumbers().size() - 1 >= indexNextMinuendElement) {
            minuend = nextMinuendNumbers(difference);
            maxSubtrahend = DivisionUtility.findMaxSubtrahend(minuend, divisor);
            difference = minuend - maxSubtrahend;
            minuendNumbersList.add(minuend);
            maxSubtrahendList.add(maxSubtrahend);
            resultSubtractionList.add(difference);
        }
    }



    private int nextMinuendNumbers(int number) {
        List <Integer> separatedNumbers = splitDividendToSeparatedNumbers();
        String intToString = Integer.toString(number);
        int minuendNumbers = 0;
        int counter = 0;
        int arraySize = separatedNumbers.size() - 1;
        while (counter <= arraySize) {
            counter++;
            if (minuendNumbers < divisor && number >= 0) {
                intToString += Integer.toString(separatedNumbers.get(indexNextMinuendElement));
                minuendNumbers = Integer.parseInt(intToString);
                indexNextMinuendElement++;
            }
        }
        return minuendNumbers;
    }

    private ArrayList<Integer> splitDividendToSeparatedNumbers() {
        ArrayList<Integer> separatedNumbers = new ArrayList<>();
        if (dividend == 0) {
            maxSubtrahendList.add(0);
            resultSubtractionList.add(0);
        }
        for (int i = dividend; i > 0; i /= 10) {
            separatedNumbers.add(0, i % 10);
        }

        return separatedNumbers;
    }

}
