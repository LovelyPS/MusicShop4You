package com.niit.music.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cart implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="CART_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int cart_id;
    @ManyToOne
    @JoinColumn(name="P_ID")
	private Product product;
	@Column(name="C_PRICE")
    private int c_price;
	@Column(name="C_QUANTITY")
    private int c_quantity;
	@Column(name="C_STATUS")
	private int c_status;
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getC_price() {
		return c_price;
	}
	public void setC_price(int c_price) {
		this.c_price = c_price;
	}
	public int getC_quantity() {
		return c_quantity;
	}
	public void setC_quantity(int c_quantity) {
		this.c_quantity = c_quantity;
	}
	public int getC_status() {
		return c_status;
	}
	public void setC_status(int c_status) {
		this.c_status = c_status;
	}
	public Cart(int cart_id, Product product, int c_price, int c_quantity, int c_status) {
		super();
		this.cart_id = cart_id;
		this.product = product;
		this.c_price = c_price;
		this.c_quantity = c_quantity;
		this.c_status = c_status;
	}
	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", product=" + product + ", c_price=" + c_price + ", c_quantity="
				+ c_quantity + ", c_status=" + c_status + "]";
	}
	public Cart() {
		super();
	}
	
	
	
	
	

}
