package org.liuyang.service.impl;

import javax.transaction.Transactional;

import org.liuyang.domain.Stock;
import org.liuyang.repository.StockRepository;
import org.liuyang.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 股票服务层实现
 * @author liuyang
 * @Email y_liu@hiersun.com | 745089707@qq.com
 * @Date 2016年9月9日
 */
@Service
@Transactional
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository stockRepository;

	@Override
	public Stock saveOrUpdate(Stock stock) {
		return stockRepository.save(stock);
	}

	@Override
	public Stock findById(String id) {
		return stockRepository.findOne(id);
	}

}
