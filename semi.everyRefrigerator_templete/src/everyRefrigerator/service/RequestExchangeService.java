package everyRefrigerator.service;

import java.util.List;

import everyRefrigerator.domain.ExchangedHistory;
import everyRefrigerator.domain.Product;

public interface RequestExchangeService {

	public Product findByProductId(String productId);
	public List<ExchangedHistory> findExchangedListByUserId (String id);

}
