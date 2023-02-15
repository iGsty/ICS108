import java.util.Scanner;
import java.util.ArrayList;

public class Main {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    ArrayList<Container> containers = new ArrayList<>();

    System.out.print("Enter the number of objects: ");
    int n = input.nextInt();
    int[] objects = new int[n];

    System.out.print("Enter the weights of the objects: ");
        for (int i = 0; i < n; i++) {
        objects[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
                boolean placed = false;
                for (Container container : containers) {
                        if (container.totalWeight() + objects[i] <= container.getCapacity()) {
                                container.add(objects[i]);
                                placed = true;
                                break;
                        }
                }
                if (!placed) {
                    Container container = new Container();
                    container.add(objects[i]);
                    containers.add(container);
                }
        }

        for (int i = 0; i < containers.size(); i++) {
        System.out.println("Container " + i + " contains objects with weights " + containers.get(i).getContents());
                }

        System.out.println("Total number of containers needed: " + containers.size());
        }
}
