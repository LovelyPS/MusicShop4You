package com.niit.music.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int s_id;
	@Column private String s_name;
	@Column private Set<Product> products;
/**
 * @param s_id
 * @param s_name
 * @param products
 */
public Supplier(int s_id, String s_name, Set<Product> products) {
	super();
	this.s_id = s_id;
	this.s_name = s_name;
	this.products = products;
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
 * @return the s_name
 */
public String getS_name() {
	return s_name;
}
/**
 * @param s_name the s_name to set
 */
public void setS_name(String s_name) {
	this.s_name = s_name;
}
/**
 * @return the products
 */
public Set<Product> getProducts() {
	return products;
}
/**
 * @param products the products to set
 */
public void setProducts(Set<Product> products) {
	this.products = products;
}
  
  
}
