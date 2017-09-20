package everyRefrigerator.store;

import java.util.List;

import everyRefrigerator.domain.GiftHistory;

public interface GiftBoxStore {

	public void createGiftHistory(GiftHistory giftHistory);
	public List<GiftHistory> readGiftListByUserId(String id);
	public List<GiftHistory> readMyReceivedGiftList(String id);
	public GiftHistory readGift(String giftId);

}
