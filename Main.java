package ua.foxminded.javaspring.integerDivision;

import ua.foxminded.javaspring.integerDivision.service.DivisionService;

public class Main {

    public static void main(String[] args) {

        try {
            DivisionService divisionService = new DivisionService(88888, 4);
            System.out.println(divisionService.printResult());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
