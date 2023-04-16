package ru.netology.javaqa60.services;
public class VacationService {
    public int calculate (int income, int expences, int threshold) {
        int check = 0; // Счет клиента
        int monthsOfRest = 0; // Месяцы отпуска
        for (int month = 0; month < 12; month++) {
            if (check >= threshold) {
                monthsOfRest++;
                check = (check - expences) /3;
            } else {
                check = check + income - expences;
            }
        }
        return monthsOfRest;
    }
}
