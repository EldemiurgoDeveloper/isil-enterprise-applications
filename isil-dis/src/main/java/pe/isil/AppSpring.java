package pe.isil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpring {

    public static void main(String[] args) {
        System.out.println("Running Spring ...");

        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");

        Gallery gallery = app.getBean("gallery", Gallery.class);
        gallery.shared();

    }

}
