package curs13.exercise;

public class BirthYearMain {
    public static void main(String[] args) {

        try {
            System.out.println(BirthYearCalculator.getBirthAge(15));
            System.out.println(BirthYearCalculator.getBirthAge(30));
            System.out.println(BirthYearCalculator.getBirthAge(5));
            System.out.println(BirthYearCalculator.getBirthAge(122));

        } catch (AgeException ageException) {
            System.out.println(ageException.getMessage());
        }
    }
}
