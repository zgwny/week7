package com.example.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jdbc.dao.OrderDao;

@RestController
public class OrderController {

	@Autowired
	private OrderDao dao;
	
	@RequestMapping("/test")
	public String test() {
		
		final long start = System.currentTimeMillis();
		dao.Add1000000Users();
		return ("使用时间：" + (System.currentTimeMillis() - start) + " ms");
	}
}
