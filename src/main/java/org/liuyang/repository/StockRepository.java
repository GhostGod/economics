package org.liuyang.repository;

import org.liuyang.domain.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
/**
 * 股票数据访问层接口
 * @author liuyang
 * @Email y_liu@hiersun.com | 745089707@qq.com
 * @Date 2016年9月9日
 */
@Repository
public interface StockRepository extends JpaRepository<Stock, String>, JpaSpecificationExecutor<Stock> {

}
