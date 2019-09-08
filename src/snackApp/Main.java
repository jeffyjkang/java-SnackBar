package snackApp;

public class Main {
    private static void workWithData() {
        Customer cust1 = new Customer("Jane", 45.25);
        Customer cust2 = new Customer("Bob", 33.14);

        //
        System.out.println("*** Query Data \n");
        System.out.println(cust1);
        System.out.println(cust2);
    }

    public static void main(String[] args) {
        workWithData();
    }
}