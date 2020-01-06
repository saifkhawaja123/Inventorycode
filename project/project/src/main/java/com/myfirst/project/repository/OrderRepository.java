package com.myfirst.project.repository;

import com.myfirst.project.domain.Order;
import com.myfirst.project.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>
{
}
