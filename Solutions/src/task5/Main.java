package task5;
/*
The Calendar class is an abstract class that provides methods for converting between a specific instant in
time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating
the calendar fields, such as getting the date of the next week.
You are given a date. You just need to write the method,findDay , which returns the day on that date. To simplify y
our task, we have provided a portion of the code in the editor.

Example
month = 8, day = 14, year 2017
The method should return  MONDAY as the day on that date.
 */

import java.time.LocalDate;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        System.out.println(findDay(8,14,2017));
    }

    public static String findDay(int month, int day, int year) {
        //Calendar calendar = Calendar.getInstance();
        //calendar.set(month, day, year);
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }
}
