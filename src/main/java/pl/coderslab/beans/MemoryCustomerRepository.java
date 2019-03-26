package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class MemoryCustomerRepository implements CustomerRepository {
    private ArrayList<Customer> customers=new ArrayList<>();
    @Autowired
    @Qualifier("fileCustomerLogger")
    CustomerLogger customerLogger;

    @Override
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
        customerLogger.log();
    }

    @Override
    public void removeCustomer(Customer customer) {
        this.customers.remove(customer);
        customerLogger.log();
    }

    @Override
    public void showCustomers() {
        System.out.println(Arrays.toString(customers.toArray()));
        customerLogger.log();
    }
}
