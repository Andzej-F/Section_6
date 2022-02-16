package Section_6_Lectures;

public class RectangleTest {
    public static void main(String[] args) {


        Rectangle rectangle1 = new Rectangle(22, 15);
        System.out.println(rectangle1.getWidth());// 0
        System.out.println(rectangle1.getHeight()); // 0
        System.out.println(rectangle1.getX());// 22
        System.out.println(rectangle1.getY());// 15

        System.out.println();

        Rectangle rectangle2 = new Rectangle(-3, 2, 12, 18);
        System.out.println(rectangle2.getWidth());// 12
        System.out.println(rectangle2.getHeight()); // 18
        System.out.println(rectangle2.getX());// -3
        System.out.println(rectangle2.getY());// 2

    }
}
