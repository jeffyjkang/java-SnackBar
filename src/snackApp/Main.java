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
        // System.out.println("*** Query Data \n");
        // System.out.println(cust1);
        // System.out.println(cust2);
        // System.out.println(vend1.getName() + ", " + "id: " + vend1.getId());
        // System.out.println(vend2.getName() + ", " + "id: " + vend2.getId());
        // System.out.println(vend3.getName() + ", " + "id: " + vend3.getId());
        // System.out.println("\n");
        // System.out.println(snack1);
        // System.out.println(snack2);
        // System.out.println(snack3);
        // System.out.println(snack4);
        // System.out.println(snack5);
        //
        // 1. Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print
        // quantity
        // of snack 4.
        cust1.buySnack(snack4.getTotalCost(3)); // decrement customer cash on hand
        snack4.buySnack(3); // decrement quantity of snack
        System.out.println("c1 cash on hand: " + cust1.getCashOnHand() + "\n"); // print cash on hand
        System.out.println("snack4 qty: " + snack4.quantity() + "\n"); // print quantity of snack
        // 2. Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print
        // quantity of snack 3.
        cust1.buySnack(snack3.getTotalCost(1)); // decrement customer cash on hand
        snack3.buySnack(1); // decrement quantity of snack
        System.out.println("c1 cash on hand: " + cust1.getCashOnHand() + "\n"); // print cash on hand
        System.out.println("snack3 qty: " + snack3.quantity() + "\n"); // print quantity of snack
        // 3. Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print
        // quantity of snack 4.
        cust2.buySnack(snack4.getTotalCost(2)); // decrement customer cash on hand
        snack4.buySnack(2); // decrement quantity of snack
        System.out.println("c2 cash on hand: " + cust2.getCashOnHand() + "\n"); // print cash on hand
        System.out.println("snack4 qty: " + snack4.quantity() + "\n"); // print quantity of snack
        // 4. Customer 1 finds $10. Print Customer 1 Cash on Hand.
        cust1.addCash(10.00); // increment customer cash on hand
        System.out.println("c1 cash on hand: " + cust1.getCashOnHand() + "\n"); // print cash on hand
        // 5. Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print
        // quantity of snack 2.
        cust1.buySnack(snack2.getTotalCost(1)); // decrement customer cash on hand
        snack2.buySnack(1); // decrement quantity of snack
        System.out.println("c1 cash on hand: " + cust1.getCashOnHand() + "\n"); // print cash on hand
        System.out.println("snack2 qty: " + snack2.quantity() + "\n"); // print quantity of snack
        // 6. Add 12 more items to snack 3. Print quantity of snack 3.
        snack3.addQuantity(12); // increment quantity of snack
        System.out.println("snack3 qty: " + snack3.quantity() + "\n"); // print quantity of snack
        // 7. Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print
        // quantity of snack 3.
        cust2.buySnack(snack3.getTotalCost(3)); // decrement customer cash on hand
        snack3.buySnack(3); // decrement quantity of snack
        System.out.println("c2 cash on hand: " + cust2.getCashOnHand() + "\n"); // print cash on hand
        System.out.println("snack3 qty: " + snack3.quantity() + "\n"); // print quantity of snack
    }

    public static void main(String[] args) {
        workWithData();
    }
}