package com.estudojpa.course.repositories;

import com.estudojpa.course.entities.OrderItem;
import com.estudojpa.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
