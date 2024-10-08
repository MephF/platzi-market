package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll();
    Optional<Product> findByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
