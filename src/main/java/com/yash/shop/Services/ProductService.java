package com.yash.shop.Services;

import com.yash.shop.Model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Getter
@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon Camera", 70000),
            new Product(103,"shure mic",10000)));

    public Product getProductById(int productId) {
        return products.stream().
                filter(p ->p.getProduct_id() ==productId).
                findFirst().get();
    }
    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product product) {
        int idx=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProduct_id()==product.getProduct_id()){
                idx=i;
            }
        }
        products.set(idx,product);

    }
}
