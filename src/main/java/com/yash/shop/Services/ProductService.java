package com.yash.shop.Services;

import com.yash.shop.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon Camera", 70000),
            new Product(103,"shure mic",10000)));
    public List<Product> getProducts(){
        return products;

    }

    public Product getProductById(int productId) {
        return products.stream().
                filter(p ->p.getProduct_id() ==productId).
                findFirst().get();
    }
    public Product addProduct(Product product){
        products.add(product);
        return product;
    }
}
