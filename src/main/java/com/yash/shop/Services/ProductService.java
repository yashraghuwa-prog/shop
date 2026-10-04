package com.yash.shop.Services;

import com.yash.shop.Model.Product;
import com.yash.shop.repository.ProductRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service

public class ProductService {
    @Autowired
    ProductRepo Repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 50000),
//            new Product(102, "Canon Camera", 70000),
//            new Product(103, "shure mic", 10000)));


    public List<Product> getProducts(){
        return Repo.findAll();
    }
    public Product getProductById(int productId) {
        return Repo.findById(productId).orElse(new Product()) ;
    }

    public void addProduct(Product product) {
       Repo.save(product);
    }

    public void updateProduct(Product product) {
       Repo.save(product);

    }

    public void deleteProduct(int product) {
        Repo.deleteById(product);
    }
}
