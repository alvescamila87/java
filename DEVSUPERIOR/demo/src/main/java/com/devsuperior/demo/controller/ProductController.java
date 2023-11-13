package com.devsuperior.demo.controller;

import com.devsuperior.demo.entities.Departament;
import com.devsuperior.demo.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping
    public List<Product> getObjects() {

        Departament d1 = new Departament(1L, "Tech");
        //d1.setId(1L);
        //d1.setName("Tech");

        Departament d2 = new Departament(2L, "Pet");

        Product p1 = new Product(1L, "Macbook Pro", 4000.00, d1);
        Product p2 = new Product(2L, "PC Gamer", 5000.00, d1);
        Product p3 = new Product(3L, "Pet House", 300.00, d2);

        List<Product> list = Arrays.asList(p1, p2, p3);

        return list;

    }
}
