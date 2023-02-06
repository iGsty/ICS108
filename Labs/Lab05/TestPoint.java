public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(10, 30.5);
        System.out.println("The distance between p1 and p2 is: "+ p1.distance(p2));

        System.out.println("the x is: "+ p2.getX());  // just to test the getter (getX)
    }
}
