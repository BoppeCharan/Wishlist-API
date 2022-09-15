package com.infy.wishlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.wishlist.entity.Wishlist;
import com.infy.wishlist.repository.WishlistRepository;

@Service
public class WishlistService {
	
	
	@Autowired
	private WishlistRepository wishlistRepository;

	public Wishlist addItemToWishlist(Wishlist wishlist) {
		return wishlistRepository.save(wishlist);
	}

	public List<Wishlist> getWishlist() {
		return wishlistRepository.findAll();
	}

	public List<Wishlist> getWishlistOfUser(Long userId) {
		return wishlistRepository.findByUserId(userId);
	}

	public Wishlist getItemById(Long wishlistId) {
		return wishlistRepository.findByWishlistId(wishlistId);
	}

	public Wishlist updateItemById(Long wishlistId, Wishlist wishlist) {
		Wishlist db = wishlistRepository.findByWishlistId(wishlistId);
		db.setWishlistId(wishlistId);
		db.setUserId(wishlist.getUserId());
		db.setProductId(wishlist.getProductId());
		return wishlistRepository.save(db);
	}

	public String deleteItemById(Long wishlistId) {
		Wishlist db = wishlistRepository.findByWishlistId(wishlistId);
		wishlistRepository.delete(db);
		return "deleted";
	}

}
