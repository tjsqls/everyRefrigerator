package everyRefrigerator.service;

import java.util.List;

import everyRefrigerator.domain.GiftHistory;

public interface GiftBoxService {

	public List<GiftHistory> findGiftListSendByMe(String id); 
	public List<GiftHistory> findMyReceivedGiftList(String id);
	public void registGiftHistory(GiftHistory giftHistory);
	public GiftHistory findGift(String giftId);

}
