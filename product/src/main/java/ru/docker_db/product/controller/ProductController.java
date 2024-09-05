package ru.docker_db.product.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.docker_db.product.domain.Product;
import ru.docker_db.product.service.ProductService;

@Controller
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product) {
        productService.save(product);
        return "redirect:/index";
    }


}
