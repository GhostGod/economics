package org.liuyang.service;

import org.liuyang.domain.Stock;
/**
 * 股票服务层接口
 * @author liuyang
 * @Email y_liu@hiersun.com | 745089707@qq.com
 * @Date 2016年9月9日
 */
public interface StockService {
	
	/**
	 * 保存或修改股票
	 * @param stock 股票
	 * @return
	 */
	Stock saveOrUpdate(Stock stock);

	/**
	 * 根据id查询股票
	 * @param id 股票ID
	 * @return
	 */
	Stock findById(String id);
}
