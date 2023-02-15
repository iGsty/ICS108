import java.util.ArrayList;

class Container {
    private final int capacity = 10;
    private final ArrayList<Integer> contents = new ArrayList<>();

    public int getCapacity(){
        return capacity;
    }
    public void add(int weight) {
        if (weight <= capacity - totalWeight()) {
            contents.add(weight);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Integer content : contents) {
            total += content;
        }
        return total;
    }

    public ArrayList<Integer> getContents() {
        return contents;
    }
}
