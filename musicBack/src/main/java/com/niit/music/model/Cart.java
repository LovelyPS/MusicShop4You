package com.niit.music.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cart 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int cart_id;
	@Column private int s_id;
	@Column private String u_mail;
	@Column private int c_price;
	@Column private int c_quantity;
	@Column private int c_status;
	/**
	 * @param cart_id
	 * @param s_id
	 * @param u_mail
	 * @param c_price
	 * @param c_quantity
	 * @param c_status
	 */
	public Cart(int cart_id, int s_id, String u_mail, int c_price, int c_quantity, int c_status) {
		super();
		this.cart_id = cart_id;
		this.s_id = s_id;
		this.u_mail = u_mail;
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
	 * @return the s_id
	 */
	public int getS_id() {
		return s_id;
	}
	/**
	 * @param s_id the s_id to set
	 */
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	/**
	 * @return the u_mail
	 */
	public String getU_mail() {
		return u_mail;
	}
	/**
	 * @param u_mail the u_mail to set
	 */
	public void setU_mail(String u_mail) {
		this.u_mail = u_mail;
	}
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
	

}
