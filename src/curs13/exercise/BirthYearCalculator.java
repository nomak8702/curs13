package curs13.exercise;

import java.time.LocalDate;
import java.util.Scanner;

public class BirthYearCalculator {

    public static int getBirthAge(int age) throws AgeException {


        if (age > 0 && age <= 120) {
            return LocalDate.now().getYear() - age;
        } else {
            throw new AgeException("Age not valid! " + age);
        }
    }
}
