package snackApp;

public class Main {
    private static void workWithData() {
        // instantiate 2 customers
        Customer cust1 = new Customer("Jane", 45.25);
        Customer cust2 = new Customer("Bob", 33.14);
        // instantiate 3 vending machines
        VendingMachine vend1 = new VendingMachine("Food");
        VendingMachine vend2 = new VendingMachine("Drink");
        VendingMachine vend3 = new VendingMachine("Office");
        // instantiate 5 snacks
        Snack snack1 = new Snack("Chips", 36, 1.75, 1);
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack snack3 = new Snack("Pretzel", 30, 2.00, 1);
        Snack snack4 = new Snack("Soda", 24, 2.50, 2);
        Snack snack5 = new Snack("Water", 20, 2.75, 2);
        // print data
        System.out.println("*** Query Data \n");
        System.out.println(cust1);
        System.out.println(cust2);
        System.out.println(vend1.getName() + ", " + "id: " + vend1.getId());
        System.out.println(vend2.getName() + ", " + "id: " + vend2.getId());
        System.out.println(vend3.getName() + ", " + "id: " + vend3.getId());
        System.out.println("\n");
        System.out.println(snack1);
        System.out.println(snack2);
        System.out.println(snack3);
        System.out.println(snack4);
        System.out.println(snack5);
    }

    public static void main(String[] args) {
        workWithData();
    }
}