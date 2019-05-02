package pe.isil.business;

import pe.isil.model.ICar;

public class SalesManagement {

    ICar car;

    public SalesManagement() {
    }

    public SalesManagement(ICar car) {
        this.car = car;
    }

    public void setCar(ICar car) {
        this.car = car;
    }

    public void buy() {
        System.out.println(this.car.getDescription());
    }
}
