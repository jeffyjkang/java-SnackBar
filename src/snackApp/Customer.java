package snackApp;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public int getId() {
        return id;
    }

    public void addCash(double cash) {
        this.cashOnHand = this.cashOnHand + cash;
    }

    public void buySnack(double cash) {
        this.cashOnHand = this.cashOnHand - cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    @Override
    public String toString() {
        String rtnStr = "name: " + name + "\n" + "cash on hand: " + cashOnHand + "\n";
        return rtnStr;
    }
}