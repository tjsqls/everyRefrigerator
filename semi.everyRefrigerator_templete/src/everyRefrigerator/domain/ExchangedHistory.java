package everyRefrigerator.domain;

import java.sql.Date;
import java.util.List;

public class ExchangedHistory {

	private String exchangeId;
	private User requestUser;
	private User responseUser;
	private List<Product> requestUserProducts;
	private List<Product> responseUserProducts;
	private Date exchangeDate;
	public String getExchangeId() {
		return exchangeId;
	}
	public void setExchangeId(String exchangeId) {
		this.exchangeId = exchangeId;
	}
	public User getRequestUser() {
		return requestUser;
	}
	public void setRequestUser(User requestUser) {
		this.requestUser = requestUser;
	}
	public User getResponseUser() {
		return responseUser;
	}
	public void setResponseUser(User responseUser) {
		this.responseUser = responseUser;
	}
	public List<Product> getRequestUserProducts() {
		return requestUserProducts;
	}
	public void setRequestUserProducts(List<Product> requestUserProducts) {
		this.requestUserProducts = requestUserProducts;
	}
	public List<Product> getResponseUserProducts() {
		return responseUserProducts;
	}
	public void setResponseUserProducts(List<Product> responseUserProducts) {
		this.responseUserProducts = responseUserProducts;
	}
	public Date getExchangeDate() {
		return exchangeDate;
	}
	public void setExchangeDate(Date exchangeDate) {
		this.exchangeDate = exchangeDate;
	}
	
	
}
