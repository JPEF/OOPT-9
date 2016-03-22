import java.util.ArrayList;

public class ComplexShape implements Shape {

    private ArrayList<Shape> shapes;

    public ComplexShape() {
        shapes = new ArrayList();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public void draw() {
        System.out.println("Drawing:");
        for (Shape s : shapes) {
            s.draw();
        }
    }
}
