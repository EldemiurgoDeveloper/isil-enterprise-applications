package pe.isil.isilweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.isil.isilweb.model.Product;
import pe.isil.isilweb.service.ProductService;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public String getGreeting(Model model) {
        model.addAttribute("name", "Jose");
        return "product";
    }

    @GetMapping("/products")
    public String getProductList(Model model) {
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "products";
    }

}
