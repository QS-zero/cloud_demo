package org.example.service.impl;

import org.example.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return String.format("Hello %s", name);
    }
}
