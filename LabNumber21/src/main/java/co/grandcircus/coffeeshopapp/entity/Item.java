package co.grandcircus.coffeeshopapp.entity;

import java.io.Serializable;

public class Item implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long itemId;
	private String name;
	private String description;
	private Long quantity;
	private Float price;

	public Item() {
	}

	public Item(Long itemId, String name, String description, Long quantity, Float price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

}
