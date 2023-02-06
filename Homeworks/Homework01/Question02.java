
import java.util.Scanner;
public class Question02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextInt();

        System.out.println(sumDigits(number));
}
    public static int sumDigits(long number){
        String n1 = Long.toString(number);
        int sumOfDigits = 0;
        for (int i = 0; i < n1.length(); i++){
            sumOfDigits += number % 10;
            number = number / 10;
        }
        return sumOfDigits;
    }
}