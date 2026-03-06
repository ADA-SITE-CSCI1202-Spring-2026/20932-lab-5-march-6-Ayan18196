public class Main {
    public static void main(String[] args) {
        
        Point p = new Point(10, 10);
        System.out.println("Point starts at: " + p);
        p.moveUp();
        p.moveRight();
        System.out.println("Point moved to: " + p);

        
        Circle c = new Circle(0, 0, 5);
        System.out.println("Circle starts at: " + c);
        c.moveDown();
        c.moveLeft();
        System.out.println("Circle moved to: " + c);
    }
}