package com.estore.ecommerce.ecommerce.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.estore.ecommerce.ecommerce.dao.EcommerceDao;
import com.estore.ecommerce.ecommerce.entity.CardInformation;
import com.estore.ecommerce.ecommerce.entity.CartList;
import com.estore.ecommerce.ecommerce.entity.DeliveryAddress;
import com.estore.ecommerce.ecommerce.entity.HelpSupport;
import com.estore.ecommerce.ecommerce.entity.ProductMaster;
import com.estore.ecommerce.ecommerce.entity.PurchaseTransaction;
import com.estore.ecommerce.ecommerce.entity.Ratings;
import com.estore.ecommerce.ecommerce.entity.SiteInformation;
import com.estore.ecommerce.ecommerce.entity.UserInfo;
import com.estore.ecommerce.ecommerce.entity.Wishlist;
import com.estore.ecommerce.ecommerce.service.EcommerceService;


@RestController
public class EcommerceController {
	
	private EcommerceService ecommerceService ;
	 
	@Autowired
	public EcommerceController(EcommerceService theEcommerceService) {
		ecommerceService = theEcommerceService;
	}
 
	@GetMapping("/getUser")
	public UserInfo getUser() {
		return ecommerceService.getUserInfo();
	}
	
	@GetMapping("/getCard")
	public CardInformation getCard() {
		return ecommerceService.getCardInfo();
	}
	
	@PostMapping("/register")
	public void register(@RequestBody UserInfo userInfo) {
		if(Objects.nonNull(userInfo)){
			ecommerceService.register(userInfo);
		}
	}
	
	@PostMapping("/upsertProduct")
	public void upsertProduct(@RequestBody ProductMaster productMaster) {
		if(Objects.nonNull(productMaster)){
			ecommerceService.upsertProduct(productMaster);
		}
	}
	
	@PostMapping("/upsertRating")
	public void upsertRating(@RequestBody Ratings ratings) {
		if(Objects.nonNull(ratings)){
			ecommerceService.upsertRating(ratings);
		}
	}
	
	@PostMapping("/upsertWishlist")
	public void upsertWishlist(@RequestBody Wishlist wishlist) {
		if(Objects.nonNull(wishlist)){
			ecommerceService.upsertWishlist(wishlist);
		}
	}
	
	@PostMapping("/purchase")
	public void purchase(@RequestBody PurchaseTransaction purchaseTransaction) {
		if(Objects.nonNull(purchaseTransaction)){
			ecommerceService.purchase(purchaseTransaction);
		}
	}
	
	@PostMapping("/upsertCardInfo")
	public void upsertCardInfo(@RequestBody CardInformation cardInformation) {
		if(Objects.nonNull(cardInformation)){
			ecommerceService.upsertCardInfo(cardInformation);
		}
	}
	
	@PostMapping("/upsertDeliveryAddress")
	public void upsertDeliveryAddress(@RequestBody DeliveryAddress deliveryAddress) {
		if(Objects.nonNull(deliveryAddress)){
			ecommerceService.upsertDeliveryAddress(deliveryAddress);
		}
	}
	
	@PostMapping("/helpSupport")
	public void helpSupport(@RequestBody HelpSupport helpSupport) {
		if(Objects.nonNull(helpSupport)){
			ecommerceService.helpSupport(helpSupport);
		}
	}
	
	@PostMapping("/addToCart")
	public void addToCart(@RequestBody CartList cartList) {
		if(Objects.nonNull(cartList)){
			ecommerceService.addToCart(cartList);
		}
	}
	
	@PostMapping("/removeFromCart")
	public void removeFromCart(@RequestBody CartList cartList) {
		if(Objects.nonNull(cartList)){
			ecommerceService.removeFromCart(cartList);
		}
	}
	
	@PostMapping("/upsertSiteInfo")
	public void upsertSiteInfo(@RequestBody SiteInformation siteInformation) {
		if(Objects.nonNull(siteInformation)){
			ecommerceService.upsertSiteInfo(siteInformation);
		}
	}
}
