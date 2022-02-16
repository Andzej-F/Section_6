package Section_6_Lectures;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.printSum(20, 15);
        Calculator.printSum(5, 10);
        CalculatorTest.printHello();
    }

    public static void printHello() {
        System.out.println("Hello");
    }
}
