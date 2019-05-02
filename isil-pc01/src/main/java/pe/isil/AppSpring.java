package pe.isil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.isil.business.SalesManagement;

public class AppSpring {

    public static void main(String[] args) {

        System.out.println("Sales Management Spring");

        ApplicationContext app =
                new ClassPathXmlApplicationContext("beans.xml");

        SalesManagement salesManagementAudi =
                app.getBean("salesManagementAudi", SalesManagement.class);
        salesManagementAudi.buy();

        SalesManagement salesManagementMercedes =
                app.getBean("salesManagementMercedes", SalesManagement.class);
        salesManagementMercedes.buy();

    }
}
