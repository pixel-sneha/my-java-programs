public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 5;
        this.y = 5;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {  // Copy constructor
        this.x = p.x;
        this.y = p.y;
    }

    public void display() {
        System.out.printf("Point(%d, %d)%n", x, y);
    }

    public static void main(String[] args) {
        Point pDefault = new Point();
        Point pParam = new Point(2, 3);
        Point pCopy = new Point(pParam);

        System.out.print("Default constructor: ");
        pDefault.display();

        System.out.print("Parameterized constructor: ");
        pParam.display();

        System.out.print("Copy constructor (from parameterized): ");
        pCopy.display();
    }
}