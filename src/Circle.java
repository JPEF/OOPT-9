public class Circle implements Shape {

    private int corners;

    private int size;

    private String color;

    public Circle(int c, int s, String col) {
        corners = c;
        size = s;
        color = col;
    }
    
    public void draw() {
        System.out.println(color + " circle with " + corners + " corners and size of " + size);
    }

    
}
