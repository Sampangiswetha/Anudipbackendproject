package com.coffeeshoporderingsystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Menu")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Item_Id")
	private int itemId;

	@Column(name = "Item_Name")
	private String itemName;

	@Column(name = "Description")
	private String description;

	@Column(name = "Quantity")
	private int quantity;

	@Column(name = "Price")
	private int price;

	// Constructors
	public Menu() {}

	public Menu(String itemName, String description, int quantity, int price) {
		this.itemName = itemName;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	// Getters and setters
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
