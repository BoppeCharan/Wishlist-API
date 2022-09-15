package com.infy.wishlist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.wishlist.entity.Wishlist;

public interface WishlistRepository extends JpaRepository< Wishlist, Long > {

	List<Wishlist> findByUserId(Long userId);

	Wishlist findByWishlistId(Long wishlistId);

}
