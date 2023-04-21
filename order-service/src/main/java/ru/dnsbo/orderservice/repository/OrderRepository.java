package ru.dnsbo.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dnsbo.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
