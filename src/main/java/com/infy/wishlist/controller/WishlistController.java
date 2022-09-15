package com.infy.wishlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.infy.wishlist.entity.Wishlist;
import com.infy.wishlist.service.WishlistService;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Slf4j
public class WishlistController {
	
	@Autowired
	private WishlistService wishlistService;
	
	
	@PostMapping("/wishlist")
	public Wishlist addItemToWishlist(@RequestBody Wishlist wishlist) {
		return wishlistService.addItemToWishlist(wishlist);
	}
	
	@GetMapping("/wishlist")
	public List<Wishlist> getWishlist() {
		return wishlistService.getWishlist();
	}
	
	@GetMapping("/wishlist/user/{userId}")
	public List<Wishlist> getWishlistOfUser(@PathVariable("userId") Long userId){
		return wishlistService.getWishlistOfUser(userId);
	}
	
	
	@GetMapping("/wishlist/{id}")
	public Wishlist getItemById(@PathVariable("id") Long wishlistId) {
		return wishlistService.getItemById(wishlistId);
	}
	
	@PutMapping("/wishlist/{id}")
	public Wishlist updateItemById(@PathVariable("id") Long wishlistId, @RequestBody Wishlist wishlist) {
		return wishlistService.updateItemById(wishlistId, wishlist);
	}
	
	@DeleteMapping("/wishlist/{id}")
	public String deleteItemById(@PathVariable("id") Long wishlistId) {
		return wishlistService.deleteItemById(wishlistId);
	}

}
