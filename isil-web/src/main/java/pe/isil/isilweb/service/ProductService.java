package pe.isil.isilweb.service;

import org.springframework.stereotype.Service;
import pe.isil.isilweb.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product(1, "Madera"),
                    new Product(2, "Clavos")
            )
    );

    public List<Product> getAll() {
        return products;
    }


}
