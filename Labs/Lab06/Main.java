import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the maximum weight: ");
        int maxWeight = input.nextInt();
        Container c = new Container(maxWeight);


        boolean exitLoop = false;
        while (!exitLoop){

            System.out.print("Enter a weight (Type 0 to end): ");
            int weight = input.nextInt();
            if (weight == 0){
                System.out.println("You have stopped the program");
                exitLoop = true;
            }
            if (!c.addItem(weight)){
                System.out.print("The item was too heavy, enter another item: ");
            }
            if (c.maxItem()){
                System.out.println("the container is full now");
                exitLoop = true;
            }
        }
    }
}