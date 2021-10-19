package com.ssm.controller;

import com.ssm.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ProductControllrt {
    @Resource
    ProductService service;



}
