package com.estore.ecommerce.ecommerce.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

@Repository
public class EcommerceDaoImpl implements EcommerceDao{
	
	private EntityManager entityManager;
	
	@Autowired
	public EcommerceDaoImpl(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}

	@Override
	public UserInfo getUserInfo() {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(UserInfo.class, 1);
	}

	@Override
	public CardInformation getCardInfo() {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(CardInformation.class, 1);
	}

	@Override
	public void register(UserInfo userInfo) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(userInfo);
	}

	@Override
	public void upsertProduct(ProductMaster productMaster) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(productMaster);
	}

	@Override
	public void upsertRating(Ratings ratings) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(ratings);
	}

	@Override
	public void upsertWishlist(Wishlist wishlist) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(wishlist);
	}

	@Override
	public void upsertWishlist(PurchaseTransaction purchaseTransaction) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(purchaseTransaction);
	}

	@Override
	public void upsertCardInfo(CardInformation cardInformation) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(cardInformation);
	}

	@Override
	public void upsertDeliveryAddress(DeliveryAddress deliveryAddress) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(deliveryAddress);
	}

	@Override
	public void helpSupport(HelpSupport helpSupport) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(helpSupport);
	}

	@Override
	public void addToCart(CartList cartList) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(cartList);
	}

	@Override
	@Transactional
	public void removeFromCart(CartList cartList) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("delete from CartList where user_id = :userId and product_id = :productId");
		query.setParameter("userId",cartList.getUserId());
		query.setParameter("productId",cartList.getProductId());
		query.executeUpdate();
	}

	@Override
	public void upsertSiteInfo(SiteInformation siteInformation) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(siteInformation);
	}
}
