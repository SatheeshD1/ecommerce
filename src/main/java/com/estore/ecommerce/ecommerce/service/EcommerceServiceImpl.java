package com.estore.ecommerce.ecommerce.service;


import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

@Service
public class EcommerceServiceImpl implements EcommerceService {
	
	private EcommerceDao ecommerceDao;
	
	
	@Autowired
	public EcommerceServiceImpl(EcommerceDao theEcommerceDao) {
		ecommerceDao = theEcommerceDao;
	}
	
	@Override
	@Transactional
	public UserInfo getUserInfo() {
		return ecommerceDao.getUserInfo();
	}

	@Override
	public CardInformation getCardInfo() {
		return ecommerceDao.getCardInfo();
	}

	@Override
	public void register(UserInfo userInfo) {
		userInfo.setUserId(String.valueOf(UUID.randomUUID()));
		ecommerceDao.register(userInfo);
	}

	@Override
	public void upsertProduct(ProductMaster productMaster) {
		productMaster.setProductId(String.valueOf(UUID.randomUUID()));
		//Need to handle
		productMaster.setImageId(String.valueOf(UUID.randomUUID()));
		ecommerceDao.upsertProduct(productMaster);
	}

	@Override
	public void upsertRating(Ratings ratings) {
		ecommerceDao.upsertRating(ratings);
	}

	@Override
	public void upsertWishlist(Wishlist wishlist) {
		ecommerceDao.upsertWishlist(wishlist);
	}

	@Override
	public void purchase(PurchaseTransaction purchaseTransaction) {
		ecommerceDao.upsertWishlist(purchaseTransaction);
	}

	@Override
	public void upsertCardInfo(CardInformation cardInformation) {
		ecommerceDao.upsertCardInfo(cardInformation);
	}

	@Override
	public void upsertDeliveryAddress(DeliveryAddress deliveryAddress) {
		ecommerceDao.upsertDeliveryAddress(deliveryAddress);
	}

	@Override
	public void helpSupport(HelpSupport helpSupport) {
		ecommerceDao.helpSupport(helpSupport);
	}

	@Override
	public void addToCart(CartList cartList) {
		ecommerceDao.addToCart(cartList);
	}

	@Override
	public void removeFromCart(CartList cartList) {
		ecommerceDao.removeFromCart(cartList);
	}

	@Override
	public void upsertSiteInfo(SiteInformation siteInformation) {
		ecommerceDao.upsertSiteInfo(siteInformation);
	}

	@Override
	public void uploadProductCsv(String fileUrl) {
		ecommerceDao.uploadProductCsv(fileUrl);
	}
}