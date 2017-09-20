package everyRefrigerator.store;

import java.util.List;

import everyRefrigerator.domain.ExchangedHistory;

public interface RequestExchangeStore {

	public void createExchangeHistory(ExchangedHistory exchagedHistory);
	public List<ExchangedHistory> readExchangedListByUserId (String id);

	
}
