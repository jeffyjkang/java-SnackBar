package snackApp;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;
    private String vendingMachineName;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public int quantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public void buySnack(int quantity) {
        this.quantity = this.quantity - quantity;
    }

    public double getTotalCost(int quantity) {
        return cost * quantity;
    }

    // stretch vending machine name
    public String getVendingMachineName() {
        return vendingMachineName;
    }

    public void setVendingMachineName(String vendingMachineName) {
        this.vendingMachineName = vendingMachineName;
    }

    //
    @Override
    public String toString() {
        String rtnString = "name: " + name + "\n" + "quantity: " + quantity + "\n" + "cost: " + cost + "\n"
                + "vending machine id: " + vendingMachineId + "\n";
        return rtnString;
    }

}