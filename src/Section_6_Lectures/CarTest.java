package Section_6_Lectures;

public class CarTest {

    public static void main(String[] args) {
       Car porsche=new Car();
       Car subaru=new Car();

        porsche.setModel("911");
        System.out.println("Model is "+porsche.getModel());
    }
}
