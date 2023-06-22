package com.moinak.springbootplayground.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moinak.springbootplayground.entity.Order;

interface OrderRepository extends JpaRepository<Order,Long>{}
