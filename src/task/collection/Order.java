package task.collection;

public class Order {

    private int id;
    private String customer;
    private int totalAmount;

    public Order(int id, String customer, int totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }
    /////Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    /////Getters
    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
}
