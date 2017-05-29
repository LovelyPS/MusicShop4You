package com.niit.music.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="C_ID") private int c_id;
	@Column(name="C_NAME") private String c_name;
	@Column(name="C_DESC") private String c_desc;	
	
	@OneToMany(targetEntity=Product.class,mappedBy = "category", cascade = CascadeType.ALL)
	private Set<Product> products;
    
	public Category(){super();}
	
	
	/**
	 * @param c_id
	 * @param c_name
	 */
	public Category(int c_id, String c_name) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
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
	/**
	 * @param c_id
	 * @param c_name
	 * @param c_desc
	 * @param products
	 */
	public Category(int c_id, String c_name, String c_desc, Set<Product> products) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_desc = c_desc;
		this.products = products;
	}
	/**
	 * @return the c_id
	 */
	public int getC_id() {
		return c_id;
	}
	/**
	 * @param c_id the c_id to set
	 */
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	/**
	 * @return the c_name
	 */
	public String getC_name() {
		return c_name;
	}
	/**
	 * @param c_name the c_name to set
	 */
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	/**
	 * @return the c_desc
	 */
	public String getC_desc() {
		return c_desc;
	}
	/**
	 * @param c_desc the c_desc to set
	 */
	public void setC_desc(String c_desc) {
		this.c_desc = c_desc;
	}
	
	

}
