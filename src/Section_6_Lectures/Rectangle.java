package Section_6_Lectures;

public class Rectangle extends Shape {

    private int width;
    private int height;


    // 1st constructor
    public Rectangle(int x, int y) {
        this(x, y, 0, 0);// calls 2nd constructor
    }

    // 2nd constructor
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getX() {
        return super.getX();
    }

    public int getY() {
        return super.getY();
    }
}
