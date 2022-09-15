package com.infy.wishlist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "wishlist")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wishlist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long wishlistId;
	private Long userId;
	private Long productId;
	public Long getWishlistId() {
		return wishlistId;
	}
	public void setWishlistId(Long wishlistId) {
		this.wishlistId = wishlistId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	
	

}
