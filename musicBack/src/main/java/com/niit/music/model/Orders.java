package com.niit.music.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Orders
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int o_id;
	@Column private String u_mail;
	@Column int payment;
	@Column int orderTotal;
	/**
	 * @param o_id
	 * @param u_mail
	 * @param payment
	 * @param orderTotal
	 */
	public Orders(int o_id, String u_mail, int payment, int orderTotal) {
		super();
		this.o_id = o_id;
		this.u_mail = u_mail;
		this.payment = payment;
		this.orderTotal = orderTotal;
	}
	/**
	 * @return the o_id
	 */
	public int getO_id() {
		return o_id;
	}
	/**
	 * @param o_id the o_id to set
	 */
	public void setO_id(int o_id) {
		this.o_id = o_id;
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
	 * @return the payment
	 */
	public int getPayment() {
		return payment;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(int payment) {
		this.payment = payment;
	}
	/**
	 * @return the orderTotal
	 */
	public int getOrderTotal() {
		return orderTotal;
	}
	/**
	 * @param orderTotal the orderTotal to set
	 */
	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	
	

}
