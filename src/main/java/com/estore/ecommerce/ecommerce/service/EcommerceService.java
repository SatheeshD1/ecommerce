package com.estore.ecommerce.ecommerce.service;

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

public interface EcommerceService {
	
	UserInfo getUserInfo();

	CardInformation getCardInfo();

	void register(UserInfo userInfo);

	void upsertProduct(ProductMaster productMaster);

	void upsertRating(Ratings ratings);

	void upsertWishlist(Wishlist wishlist);

	void purchase(PurchaseTransaction purchaseTransaction);

	void upsertCardInfo(CardInformation cardInformation);

	void upsertDeliveryAddress(DeliveryAddress deliveryAddress);

	void helpSupport(HelpSupport helpSupport);

	void addToCart(CartList cartList);

	void removeFromCart(CartList cartList);

	void upsertSiteInfo(SiteInformation siteInformation);

	void uploadProductCsv(String fileUrl);

}
