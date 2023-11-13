package com.devsuperior.demo.entities;

import com.devsuperior.demo.controller.ProductController;

public class Product {

    private Long id;
    private String name;
    private double price;

    private Departament departament;

    public Product() {

    }

    public Product(Long id, String name, double price, Departament departament) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.departament = departament;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
}
