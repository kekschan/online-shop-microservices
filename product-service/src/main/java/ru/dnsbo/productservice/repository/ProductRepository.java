package ru.dnsbo.productservice.repository;

import ru.dnsbo.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
