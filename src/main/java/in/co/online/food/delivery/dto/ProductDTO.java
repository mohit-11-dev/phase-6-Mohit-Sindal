package in.co.online.food.delivery.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="PRODUCT")
@Getter
@Setter
public class ProductDTO extends BaseDTO {

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
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public CategoryDTO getCategory() {
		return category;
	}
	public void setCategory(CategoryDTO category) {
		this.category = category;
	}
	public Set<CartDTO> getCarts() {
		return carts;
	}
	public void setCarts(Set<CartDTO> carts) {
		this.carts = carts;
	}
	public Set<OrderDTO> getOrders() {
		return orders;
	}
	public void setOrders(Set<OrderDTO> orders) {
		this.orders = orders;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Column(name="NAME",length = 225)
	private String name;
	@Column(name="DESCRIPTION",length = 225)
	private String description;
	@Column(name="PRICE",length = 225)
	private String price;
	@Column(name="IMAGE",columnDefinition = "LONGBLOB")
	private byte[] image;
	
	@Transient
	private long categoryId;
	
	@ManyToOne
	@JoinColumn(name="CATEGORY",nullable = false)
	private CategoryDTO category;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "product")
	private Set<CartDTO> carts;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "product")
	private Set<OrderDTO> orders;
	
	@Override
	public String getKey() {
		return String.valueOf(id);
	}
	@Override
	public String getValue() {
		return name;
	}

}
