package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.shopping.entity.Cart;

/**
 * The Interface ShoppingCartRepository.
 */
@Repository
public interface ShoppingCartRepository extends JpaRepository<Cart, String>, JpaSpecificationExecutor<Cart> {

}
