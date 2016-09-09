package org.ly.service;

import org.ly.domain.Stock;

public interface StockService {
	Stock save(Stock stock);

	Stock findById(String id);
}
