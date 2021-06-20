package com.example.jdbc.entity;

import java.util.Date;

public class OrderEntity {  
	private int id;
	private int member_id;
	private String  order_sn;
	private Date create_time;
	private Double total_amount;
	private Double freight_amount;
	private Double promotion_amount;
	private Double integration_amount;
	private Double coupon_amount;
	private int pay_type;
	private int source_type;
	private int status;
	private int order_type;
	private String delivery_company;
	private String delivery_sn;
	private int auto_confirm_day;
	private String receiver_name;
	private String receiver_phone;
	private String receiver_post_code;
	private String receiver_province;
	private String receiver_city;
	private String receiver_region;
	private String receiver_detail_address;
	private String note;
	private int confirm_status;
	private int delete_status;
	private int use_integration;
	private Date payment_time;
	private Date delivery_time;
	private Date receive_time;
	private Date comment_time;
	private Date modify_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public String getOrder_sn() {
		return order_sn;
	}
	public void setOrder_sn(String order_sn) {
		this.order_sn = order_sn;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(Double total_amount) {
		this.total_amount = total_amount;
	}
	public Double getFreight_amount() {
		return freight_amount;
	}
	public void setFreight_amount(Double freight_amount) {
		this.freight_amount = freight_amount;
	}
	public Double getPromotion_amount() {
		return promotion_amount;
	}
	public void setPromotion_amount(Double promotion_amount) {
		this.promotion_amount = promotion_amount;
	}
	public Double getIntegration_amount() {
		return integration_amount;
	}
	public void setIntegration_amount(Double integration_amount) {
		this.integration_amount = integration_amount;
	}
	public Double getCoupon_amount() {
		return coupon_amount;
	}
	public void setCoupon_amount(Double coupon_amount) {
		this.coupon_amount = coupon_amount;
	}
	public int getPay_type() {
		return pay_type;
	}
	public void setPay_type(int pay_type) {
		this.pay_type = pay_type;
	}
	public int getSource_type() {
		return source_type;
	}
	public void setSource_type(int source_type) {
		this.source_type = source_type;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getOrder_type() {
		return order_type;
	}
	public void setOrder_type(int order_type) {
		this.order_type = order_type;
	}
	public String getDelivery_company() {
		return delivery_company;
	}
	public void setDelivery_company(String delivery_company) {
		this.delivery_company = delivery_company;
	}
	public String getDelivery_sn() {
		return delivery_sn;
	}
	public void setDelivery_sn(String delivery_sn) {
		this.delivery_sn = delivery_sn;
	}
	public int getAuto_confirm_day() {
		return auto_confirm_day;
	}
	public void setAuto_confirm_day(int auto_confirm_day) {
		this.auto_confirm_day = auto_confirm_day;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	public String getReceiver_phone() {
		return receiver_phone;
	}
	public void setReceiver_phone(String receiver_phone) {
		this.receiver_phone = receiver_phone;
	}
	public String getReceiver_post_code() {
		return receiver_post_code;
	}
	public void setReceiver_post_code(String receiver_post_code) {
		this.receiver_post_code = receiver_post_code;
	}
	public String getReceiver_province() {
		return receiver_province;
	}
	public void setReceiver_province(String receiver_province) {
		this.receiver_province = receiver_province;
	}
	public String getReceiver_city() {
		return receiver_city;
	}
	public void setReceiver_city(String receiver_city) {
		this.receiver_city = receiver_city;
	}
	public String getReceiver_region() {
		return receiver_region;
	}
	public void setReceiver_region(String receiver_region) {
		this.receiver_region = receiver_region;
	}
	public String getReceiver_detail_address() {
		return receiver_detail_address;
	}
	public void setReceiver_detail_address(String receiver_detail_address) {
		this.receiver_detail_address = receiver_detail_address;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getConfirm_status() {
		return confirm_status;
	}
	public void setConfirm_status(int confirm_status) {
		this.confirm_status = confirm_status;
	}
	public int getDelete_status() {
		return delete_status;
	}
	public void setDelete_status(int delete_status) {
		this.delete_status = delete_status;
	}
	public int getUse_integration() {
		return use_integration;
	}
	public void setUse_integration(int use_integration) {
		this.use_integration = use_integration;
	}
	public Date getPayment_time() {
		return payment_time;
	}
	public void setPayment_time(Date payment_time) {
		this.payment_time = payment_time;
	}
	public Date getDelivery_time() {
		return delivery_time;
	}
	public void setDelivery_time(Date delivery_time) {
		this.delivery_time = delivery_time;
	}
	public Date getReceive_time() {
		return receive_time;
	}
	public void setReceive_time(Date receive_time) {
		this.receive_time = receive_time;
	}
	public Date getComment_time() {
		return comment_time;
	}
	public void setComment_time(Date comment_time) {
		this.comment_time = comment_time;
	}
	public Date getModify_time() {
		return modify_time;
	}
	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}
	
}
