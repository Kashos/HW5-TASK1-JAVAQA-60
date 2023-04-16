package ru.netology.javaqa60.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
    public void mustRestForThreeMonths() {

        VacationService service = new VacationService();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustRestForTwoMonths() {

        VacationService service = new VacationService();

        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }
}
