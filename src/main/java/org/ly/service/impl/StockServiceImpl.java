package org.ly.service.impl;

import javax.transaction.Transactional;

import org.ly.domain.Stock;
import org.ly.repository.StockRepository;
import org.ly.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository stockRepository;

	@Override
	public Stock save(Stock stock) {
		return stockRepository.save(stock);
	}

	@Override
	public Stock findById(String id) {
		return stockRepository.findOne(id);
	}

}
