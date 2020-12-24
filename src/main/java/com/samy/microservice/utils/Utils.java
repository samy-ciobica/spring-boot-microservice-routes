package com.samy.microservice.utils;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<YearMonth> getDatesBetween(LocalDate start, LocalDate end) {
        YearMonth yearMonthStart = YearMonth.of(start.getYear(), start.getMonth());
        YearMonth yearMonthEnd = YearMonth.of(end.getYear(), end.getMonth());
        List<YearMonth> listYearMonth = new ArrayList<>();
        do {
            listYearMonth.add(yearMonthStart);
            yearMonthStart = yearMonthStart.plusMonths(1);
        } while (yearMonthStart.isBefore(yearMonthEnd));
        listYearMonth.add(yearMonthEnd);
        return listYearMonth;
    }
}
