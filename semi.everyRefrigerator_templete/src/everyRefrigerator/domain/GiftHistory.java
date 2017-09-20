package everyRefrigerator.domain;

import java.sql.Date;
import java.util.List;

public class GiftHistory {

	private String giftId;
	private User sendUser;
	private User receivedUser;
	private List<Product> products;
	private boolean receivedCheck;
	private Date giftDate;
	private Message message;
	public String getGiftId() {
		return giftId;
	}
	public void setGiftId(String giftId) {
		this.giftId = giftId;
	}
	public User getSendUser() {
		return sendUser;
	}
	public void setSendUser(User sendUser) {
		this.sendUser = sendUser;
	}
	public User getReceivedUser() {
		return receivedUser;
	}
	public void setReceivedUser(User receivedUser) {
		this.receivedUser = receivedUser;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public boolean isReceivedCheck() {
		return receivedCheck;
	}
	public void setReceivedCheck(boolean receivedCheck) {
		this.receivedCheck = receivedCheck;
	}
	public Date getGiftDate() {
		return giftDate;
	}
	public void setGiftDate(Date giftDate) {
		this.giftDate = giftDate;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	
	
	
}
