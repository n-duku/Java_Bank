package interfaces;

public interface IBranch {

    public boolean addCustomerTransaction(String customerName, double transaction);

    public boolean newCustomer(String customerName, Double initialTransaction);
}
