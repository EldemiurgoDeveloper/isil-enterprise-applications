package pe.isil;

import pe.isil.business.SalesManagement;
import pe.isil.model.Audi;
import pe.isil.model.Mercedes;

public class App {

    public static void main(String[] args) {

        System.out.println("Sales Management ");

        SalesManagement salesManagement = new SalesManagement(new Audi());
        salesManagement.buy();

        salesManagement.setCar(new Mercedes());
        salesManagement.buy();
    }
}
