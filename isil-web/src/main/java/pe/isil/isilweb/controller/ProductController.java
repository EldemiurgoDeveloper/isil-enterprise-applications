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

    @GetMapping( {"/", "/index"})
    public String index(){
        return "index";
    }

    @GetMapping("/products")
    public String getProductlist(Model model){
        model.addAttribute("products", productService.getAll());
        return "product";
    }


}
