import java.util.Scanner;
import java.util.ArrayList;
public class Lab04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int objects = input.nextInt();  // getting the number of objects

        int n = 1;                      // just an increment number for containers
        ArrayList<Integer> weights = new ArrayList<>();

        System.out.print("Enter the weights of the objects: ");
        for (int i = 0; i < objects; i++){
            weights.add(input.nextInt());    // adding the inputs to the ArrayList
        }
        System.out.println(weights);

        for (int i = 0; i < weights.size(); i++) {

            boolean exitLoop = false;
            for (int j = 1; j < weights.size() && !exitLoop; j++)

                if (weights.get(i) + weights.get(j) <= 10) {
                    System.out.println("Container "+n+" contains objects with weight " + weights.get(i) + " " + weights.get(j));
                    weights.remove(j);
                    weights.remove(i);
                    i--;
                    n++;
                    exitLoop = true;
                }
        }
        for (int numbers : weights){
            System.out.println("Container "+n+" contains objects with weight " +numbers);
            n++;
        }
    }
}