package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.CustomerLogger;

public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerLogger customerLogger =context.getBean(CustomerLogger.class);
        customerLogger.log();

        context.close();
    }
}