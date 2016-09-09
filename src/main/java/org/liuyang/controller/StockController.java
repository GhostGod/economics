package org.liuyang.controller;

import org.liuyang.domain.Stock;
import org.liuyang.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 股票控制器
 * @author liuyang
 * @Email y_liu@hiersun.com | 745089707@qq.com
 * @Date 2016年9月9日
 */
@Controller
public class StockController {

	@Autowired
	private StockService stockService;

	@RequestMapping("stock")
	@ResponseBody
	public Stock add() {
		Stock stock = new Stock();
		stock.setId("123");
		return stockService.saveOrUpdate(stock);
	}
	
	@RequestMapping("index")
	public String index(Model model) {
		Stock stock = stockService.findById("123");
		model.addAttribute("stock", stock);
		return "index";
	}
}
