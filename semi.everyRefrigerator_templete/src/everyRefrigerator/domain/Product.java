package everyRefrigerator.domain;

public class Product {

	private String productId;
	private String productName;
	private int price;
	private String image;
	private String firstCategory;
	private String middleCategory;
	private String lastCategory;
	private boolean exchangeState;
	private String userId;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getFirstCategory() {
		return firstCategory;
	}
	public void setFirstCategory(String firstCategory) {
		this.firstCategory = firstCategory;
	}
	public String getMiddleCategory() {
		return middleCategory;
	}
	public void setMiddleCategory(String middleCategory) {
		this.middleCategory = middleCategory;
	}
	public String getLastCategory() {
		return lastCategory;
	}
	public void setLastCategory(String lastCategory) {
		this.lastCategory = lastCategory;
	}
	public boolean getExchangeState() {
		return exchangeState;
	}
	public void setExchangeState(boolean exchangeState) {
		this.exchangeState = exchangeState;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
	
}
