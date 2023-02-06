import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("How many courses? ");

        int courses = input.nextInt();

        System.out.println("Enter letter grade, credit hours for " + courses + " courses:");

        int hours = 0;
        int sumOfHours = 0;

        double credits = 0.0;
        double sumOfCredits = 0.0;

        String letter;
        double gpa = 0.0;

        for (int i = 0; i < courses; i++) {

            letter = input.next();

            hours = input.nextInt();

            sumOfHours += hours;

            switch (letter) {

                case ("A+") -> credits = (hours * 4.0);

                case ("A")  -> credits = (hours * 3.75);

                case ("B+") -> credits = (hours * 3.5);

                case ("B")  -> credits = (hours * 3.0);

                case ("C+") -> credits = (hours * 2.5);

                case ("C")  -> credits = (hours * 2.0);

                case ("D+") -> credits = (hours * 1.5);

                case ("D")  -> credits = (hours * 1.0);

                case ("F")  -> credits = (hours * 0.0);
            }

            sumOfCredits += credits;

        }

        gpa = (sumOfCredits / sumOfHours);
        System.out.println("GPA = "+gpa);

    }
}
