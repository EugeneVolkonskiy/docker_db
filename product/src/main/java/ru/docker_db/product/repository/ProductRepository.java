package ru.docker_db.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.docker_db.product.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
