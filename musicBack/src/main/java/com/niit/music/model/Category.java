package com.niit.music.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column private int c_id;
	@Column private String c_name;
	@Column private String c_desc;
	@Column private List<Product> products;
	
	/**
	 * @param c_id
	 * @param c_name
	 * @param c_desc
	 */
	public Category(int c_id, String c_name, String c_desc) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_desc = c_desc;
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
