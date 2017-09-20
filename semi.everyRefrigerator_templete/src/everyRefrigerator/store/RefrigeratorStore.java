package everyRefrigerator.store;

import java.util.List;

import everyRefrigerator.domain.Product;

public interface RefrigeratorStore {

	public void deleteProduct(String id, String productId);
	public void createProduct(String id, String productId);
	public void createGiftProduct(Product product);
	public void updateExchangeState(Product product);
	public void updateWishProduct(String productId, String wishProductId);
	public List<Product> readProducts (boolean exchangeState, String id);
	public Product readProductByName(String productName);
	public List<Product> readProductWithoutCategory(String productName, boolean exchangeState);
	public List<Product> readProductsByCategory(String firstCategory, String middleCategory, String lastCategory);

}
