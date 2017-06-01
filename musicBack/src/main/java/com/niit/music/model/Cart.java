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
	int cart_id;
    private Supplier supplier;
	private Product product;
	@Column(name="C_PRICE")
    private int c_price;
	@Column(name="C_QUANTITY")
    private int c_quantity;
	@Column(name="C_STATUS")
	private int c_status;
	
	
	/**
	 * @param cart_id
	 * @param supplier
	 * @param user
	 * @param product
	 * @param c_price
	 * @param c_quantity
	 * @param c_status
	 */
	public Cart(int cart_id, Supplier supplier, Product product, int c_price, int c_quantity, int c_status) {
		super();
		this.cart_id = cart_id;
		this.supplier = supplier;
		this.product = product;
		this.c_price = c_price;
		this.c_quantity = c_quantity;
		this.c_status = c_status;
	}
	/**
	 * @return the cart_id
	 */
	
	public int getCart_id() {
		return cart_id;
	}
	/**
	 * @param cart_id the cart_id to set
	 */
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	/**
	 * @return the supplier
	 */
	@ManyToOne
    @JoinColumn(name="S_ID")
	public Supplier getSupplier() {
		return supplier;
	}
	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	/**
	 * @return the user
	 */
	
	/**
	 * @return the c_price
	 */
	public int getC_price() {
		return c_price;
	}
	/**
	 * @param c_price the c_price to set
	 */
	public void setC_price(int c_price) {
		this.c_price = c_price;
	}
	/**
	 * @return the c_quantity
	 */
	public int getC_quantity() {
		return c_quantity;
	}
	/**
	 * @param c_quantity the c_quantity to set
	 */
	public void setC_quantity(int c_quantity) {
		this.c_quantity = c_quantity;
	}
	/**
	 * @return the c_status
	 */
	public int getC_status() {
		return c_status;
	}
	/**
	 * @param c_status the c_status to set
	 */
	public void setC_status(int c_status) {
		this.c_status = c_status;
	}
	/**
	 * @return the product
	 */
	@ManyToOne
    @JoinColumn(name="P_ID")
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	

}
