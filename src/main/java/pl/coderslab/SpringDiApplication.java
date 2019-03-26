package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("test");
        context.close();
    }
}