package everyRefrigerator.service;

import java.util.List;

import everyRefrigerator.domain.Product;

public interface RefrigeratorService {

	public void removeProduct(String id, String productId);
	public void sendGift(Product product, String receiverId);
	public void modifyWishProduct(String productId, String wishProductId);
	public void modifyExchangeState(Product product);
	public List<Product> findProdcuts (boolean exchangeState, String id);
	public Product findProductByName(String productName);
	public List<Product> findProductWithoutCategory(String productName, boolean exchangeState);
	public List<Product> findProductsByCategory(String firstCategory, String middleCategory, String lastCategory);
	public void recallProduct(Product product);

}
