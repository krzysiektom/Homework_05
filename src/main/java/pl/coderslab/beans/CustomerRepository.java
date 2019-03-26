package pl.coderslab.beans;

public interface CustomerRepository {
    void addCustomer(Customer customer);
    void removeCustomer(Customer customer);
    void showCustomers();
}
