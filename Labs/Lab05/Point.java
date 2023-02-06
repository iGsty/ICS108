class Point {
    private double x;
    private double y;
    Point() {
        this(0,0);
    }
    Point(double x, double second) {
        this.x = x;
        y = second;

    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(Point p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }
}



