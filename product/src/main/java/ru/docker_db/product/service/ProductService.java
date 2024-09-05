package ru.docker_db.product.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.docker_db.product.domain.Product;
import ru.docker_db.product.repository.ProductRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
