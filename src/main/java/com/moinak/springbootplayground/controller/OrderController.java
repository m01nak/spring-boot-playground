package com.moinak.springbootplayground.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.moinak.springbootplayground.repository.OrderRepository;

@RestController
public class OrderController {
    
    @Autowired
    private OrderRepository repository;
}
