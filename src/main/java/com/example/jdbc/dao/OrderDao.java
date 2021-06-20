package com.example.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.jdbc.entity.OrderEntity;

@Repository
public class OrderDao {

	 @Autowired
	 private final JdbcTemplate jdbcTemplate;
	 
	 	

	 
	    public OrderDao(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
	    }
	    
	    public void Add1000000Users() {
	    	
	    	for (int i=0; i< 1000000; i++) {
	    		AddUser();
	    		}
	    }
	 
	    public int AddUser(){
	        String sql = "INSERT INTO shopping.shopping_order " + 
	        		"(member_id, " + 
	        		"order_sn, " + 
	        		"create_time, " + 
	        		"total_amount, " + 
	        		"freight_amount, " + 
	        		"promotion_amount, " + 
	        		"integration_amount, " + 
	        		"coupon_amount, " + 
	        		"pay_type, " + 
	        		"source_type, " + 
	        		"status, " + 
	        		"order_type, " + 
	        		"delivery_company, " + 
	        		"delivery_sn, " + 
	        		"auto_confirm_day, " + 
	        		"receiver_name, " + 
	        		"receiver_phone, " + 
	        		"receiver_post_code, " + 
	        		"receiver_province, " + 
	        		"receiver_city, " + 
	        		"receiver_region, " + 
	        		"receiver_detail_address, " + 
	        		"note, " + 
	        		"confirm_status, " + 
	        		"delete_status, " + 
	        		"use_integration, " + 
	        		"payment_time, " + 
	        		"delivery_time, " + 
	        		"receive_time, " + 
	        		"comment_time, " + 
	        		"modify_time) " + 
	        		"VALUES " + 
	        		"(?,?,sysdate(),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate(),sysdate(),sysdate(),sysdate(),sysdate()); ";
	        return jdbcTemplate.update(sql,2,
	        		"AZ900",
	        		200,
	        		100,
	        		300,
	        		400,
	        		200,
	        		1,
	        		1,
	        		1,
	        		1,
	        		"中通",
	        		"vscsc90087823929",
	        		10,
	        		"张伟怒",
	        		"273287289191",
	        		"2292020",
	        		"辽宁",
	        		"大连",
	        		"中山区",
	        		"还越山",
	        		"不加辣",
	        		1,
	        		2,
	        		2);
	    }
}
