package ru.netology.javaqa60.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")

    public void mustRestForMonths(int income, int expences, int threshold, int expected) {

        VacationService service = new VacationService();

        int actual = service.calculate(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }
/*
    @Test
    public void mustRestForTwoMonths() {

        VacationService service = new VacationService();

        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }
    */
}
