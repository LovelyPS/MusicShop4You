package com.niit.music.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int p_id;
	
	@Column(name="brand") private String p_brand;
	@Column(name="name") private String p_name;
	@Column(name="desc") private String p_description;
	@Column(name="price") private int p_price;
	@Column(name="quantity") private int p_quantity;
	@Column(name="category") private String p_category;
	@Column(name="supplier") private String p_supplier;
	@Column(name="image") private String p_image;
	
	/**
	 * @param p_id
	 * @param p_brand
	 * @param p_name
	 * @param p_description
	 * @param p_price
	 * @param p_quantity
	 * @param p_category
	 * @param p_supplier
	 * @param p_image
	 */
	public Product()
	{
		
	}
	public Product(int p_id, String p_brand, String p_name, String p_description, int p_price, int p_quantity,
			String p_category, String p_supplier, String p_image) {
		super();
		this.p_id = p_id;
		this.p_brand = p_brand;
		this.p_name = p_name;
		this.p_description = p_description;
		this.p_price = p_price;
		this.p_quantity = p_quantity;
		this.p_category = p_category;
		this.p_supplier = p_supplier;
		this.p_image = p_image;
	}
	/**
	 * @return the p_id
	 */
	public int getP_id() {
		return p_id;
	}
	/**
	 * @param p_id the p_id to set
	 */
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	/**
	 * @return the p_brand
	 */
	public String getP_brand() {
		return p_brand;
	}
	/**
	 * @param p_brand the p_brand to set
	 */
	public void setP_brand(String p_brand) {
		this.p_brand = p_brand;
	}
	/**
	 * @return the p_name
	 */
	public String getP_name() {
		return p_name;
	}
	/**
	 * @param p_name the p_name to set
	 */
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	/**
	 * @return the p_description
	 */
	public String getP_description() {
		return p_description;
	}
	/**
	 * @param p_description the p_description to set
	 */
	public void setP_description(String p_description) {
		this.p_description = p_description;
	}
	/**
	 * @return the p_price
	 */
	public int getP_price() {
		return p_price;
	}
	/**
	 * @param p_price the p_price to set
	 */
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	/**
	 * @return the p_quantity
	 */
	public int getP_quantity() {
		return p_quantity;
	}
	/**
	 * @param p_quantity the p_quantity to set
	 */
	public void setP_quantity(int p_quantity) {
		this.p_quantity = p_quantity;
	}
	/**
	 * @return the p_category
	 */
	public String getP_category() {
		return p_category;
	}
	/**
	 * @param p_category the p_category to set
	 */
	public void setP_category(String p_category) {
		this.p_category = p_category;
	}
	/**
	 * @return the p_supplier
	 */
	public String getP_supplier() {
		return p_supplier;
	}
	/**
	 * @param p_supplier the p_supplier to set
	 */
	public void setP_supplier(String p_supplier) {
		this.p_supplier = p_supplier;
	}
	/**
	 * @return the p_image
	 */
	public String getP_image() {
		return p_image;
	}
	/**
	 * @param p_image the p_image to set
	 */
	public void setP_image(String p_image) {
		this.p_image = p_image;
	}
	
	

}
