package com.yash.shop.Controllers;
import com.yash.shop.Model.Product;
import com.yash.shop.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping ("/Products")

    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping ("/Products/{productId}")
    public Product getProductById(@PathVariable int productId){
        return service.getProductById(productId);
    }

    @PostMapping("/Products")
    public void addProduct( @RequestBody Product product){
         service.addProduct(product);
    }

    @PutMapping("/Products")
    public void updateProduct( @RequestBody Product product){
        service.updateProduct(product);
    }

    @DeleteMapping("/Products/{product_id}")
    public void deleteProduct(@PathVariable int product_id){
        service.deleteProduct(product_id);
    }
}
