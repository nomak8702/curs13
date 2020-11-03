package curs13.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userAge = 0;
        while (userAge != -1) {
            System.out.print("Introduceti varsta: ");
            try {
                userAge=scanner.nextInt();
                int birthYear = BirthYearCalculator.getBirthAge(userAge);
                System.out.println("Anul nasterii este " + birthYear);
            } catch (AgeException ex) {
                System.out.println(ex.getMessage());
            } catch (InputMismatchException ine) {
                System.out.println("Varsta nu e valida");
                scanner = new Scanner(System.in);
            }
        }
    }
}
