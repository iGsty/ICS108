import java.util.Scanner;
public class Lab02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many letter grades? ");
        int number = input.nextInt();
        printNRandomLetterGrades(number);

        input.close();     // this is not important
    }
    public static void printNRandomLetterGrades(int n){

        String[] grades = new String[] {"A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"};

        for (int i = 0; i < n; i++){

            String randomGrade = grades[ 1 + (int) (Math.random() * 9)];
            System.out.println(randomGrade);
        }

    }
}