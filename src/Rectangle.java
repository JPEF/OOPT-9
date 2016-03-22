public class Rectangle implements Shape {

    
    private int corners;

    private int size;

    private String color;

    public Rectangle(int c, int s, String col) {
        corners = c;
        size = s;
        color = col;
    }
    
    public void draw() {
        System.out.println(color + " rectangle with " + corners + " corners and size of " + size);
    }

    
}
