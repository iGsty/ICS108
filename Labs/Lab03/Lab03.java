import java.util.Scanner;
import java.util.Arrays;

public class Lab03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the contents of the array: ");
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        if (isValid(array))
            System.out.println("The array is valid");
        
        else
            System.out.println("The array is not valid");
    }

    public static boolean isValid(int[] array){
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++){

            if (array[i]!= i + 1){
                return false;
            }
        }
        return true;
    }
}