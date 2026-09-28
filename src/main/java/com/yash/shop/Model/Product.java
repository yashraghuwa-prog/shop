package com.yash.shop.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private  int product_id;
    private  String product_name;
    private  int product_price;


}
