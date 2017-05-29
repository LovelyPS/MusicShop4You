package com.niit.music.model;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="U_MAILID")
	String u_mail;
	@Column(name="U_NAME")
    private String u_name;
	@Column(name="U_PASSWORD")
	private String u_password;
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="CART_ID")
	private Cart cart;
	@OneToMany(targetEntity=Orders.class,mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Orders> orders;
	private String role;
	/**
	 * @param u_mail
	 * @param u_name
	 * @param u_password
	 * @param cart_id
	 * @param orders
	 * @param role
	 */
	public User(String u_mail, String u_name, String u_password, Cart cart, Set<Orders> orders, String role) {
		super();
		this.u_mail = u_mail;
		this.u_name = u_name;
		this.u_password = u_password;
		this.cart = cart;
		this.orders = orders;
		this.role = role;
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
	 * @return the u_name
	 */
	
	public String getU_name() {
		return u_name;
	}
	/**
	 * @param u_name the u_name to set
	 */
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	/**
	 * @return the u_password
	 */
	
	public String getU_password() {
		return u_password;
	}
	/**
	 * @param u_password the u_password to set
	 */
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	/**
	 * @return the cart_id
	 */
	
	public Cart getCart_id() {
		return cart;
	}
	/**
	 * @param cart_id the cart_id to set
	 */
	public void setCart_id(Cart cart) {
		this.cart = cart;
	}
	/**
	 * @return the orders
	 */
	
	public Set<Orders> getOrders() {
		return orders;
	}
	/**
	 * @param orders the orders to set
	 */
	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
