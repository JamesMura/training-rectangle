//Understands the behaviour of a four sided shape.

public class Shape {

    private final int length;
    private final int width;


    public Integer area() {
        return length * width;
    }

    public Integer perimeter() {
        return 2 * (length + width);
    }

    public static Shape getSquare(int length) {
        return new Shape(length, length);
    }

    public static Shape getRectangle(int length, int width) {
        return new Shape(length, width);
    }

    private Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }
}
