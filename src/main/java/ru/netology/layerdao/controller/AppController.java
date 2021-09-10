package ru.netology.layerdao.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.layerdao.repository.AppRepository;
import ru.netology.layerdao.repository.Product;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppController {

    private AppRepository appRepository;

    public AppController(AppRepository appRepository) {
        this.appRepository = appRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getCustomerProduct(@RequestParam("name") String name) {
        List<Product> products = appRepository.getProductName(name);
        List<String> productsName = new ArrayList<>(10);
        for(Product product : products) {
            productsName.add(product.getProductName());
        }
        return productsName;
    }
}
