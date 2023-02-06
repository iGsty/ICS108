import java.util.ArrayList;
public class Container {
    private final int  maxWeight;
    private int sumOfWeights;
    ArrayList<Integer> arr = new ArrayList<>();

    public Container(int max){
        maxWeight = max;
    }
    public int getMax(){       // no need for a getter in this task, but its useful if we want to print the max weight
        return maxWeight;
    }
    public boolean addItem(int itemWeight){
        if (sumOfWeights + itemWeight <= maxWeight){
            arr.add(itemWeight);
            sumOfWeights+= itemWeight;
            return true;
        }
        return false;
    }
    public boolean maxItem(){              // this method is just to print the ( its full now ) statement.
        return sumOfWeights == maxWeight;
    }
}
