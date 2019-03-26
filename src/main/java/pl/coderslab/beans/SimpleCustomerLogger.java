package pl.coderslab.beans;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SimpleCustomerLogger implements CustomerLogger {
    @Override
    public void log() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("<"+localDateTime.toLocalDate()+" "+localDateTime.toLocalTime()+">: Customer operation");
    }
}
