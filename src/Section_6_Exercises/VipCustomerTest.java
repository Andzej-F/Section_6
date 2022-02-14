package Section_6_Exercises;

public class VipCustomerTest {

    public static void main(String[] args) {
        // testing 1st constructor
        VipCustomer customer = new VipCustomer();
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        System.out.println();

        // testing 2nd constructor
        VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());

        System.out.println();

        // testing 2nd constructor
        VipCustomer customer3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmail());
    }
}
