package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.Customer;
import pl.coderslab.beans.CustomerLogger;
import pl.coderslab.beans.MemoryCustomerRepository;

public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerLogger customerLogger =context.getBean(CustomerLogger.class);
        customerLogger.log();
        Customer customer = new Customer(1,"Ala","Nowak","AN");
        MemoryCustomerRepository memoryCustomerRepository = context.getBean(MemoryCustomerRepository.class);
        memoryCustomerRepository.addCustomer(customer);
        memoryCustomerRepository.showCustomers();
        context.close();
    }
}