public class MainClass {

    public static void main(String[] args) {
        Circle c = new Circle(0, 2, "red");
        Rectangle r = new Rectangle(4, 5, "blue");
        ComplexShape cs = new ComplexShape();
        cs.addShape(c);
        cs.addShape(r);
        cs.draw();
    }
}
