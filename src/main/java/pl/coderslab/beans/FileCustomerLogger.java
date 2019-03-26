package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

@Component
@Primary
//@Qualifier("fileCustomerLogger")
public class FileCustomerLogger implements CustomerLogger {
    private String filename = "log.txt";

    @Override
    public void log() {
        LocalDateTime localDateTime = LocalDateTime.now();
        try (FileWriter out = new FileWriter(filename,true)) {
            out.write("<"+localDateTime.toLocalDate()+" "+localDateTime.toLocalTime()+">: Customer operation\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
