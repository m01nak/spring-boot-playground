package com.moinak.springbootplayground.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moinak.springbootplayground.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{}
