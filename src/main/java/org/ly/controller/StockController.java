package org.ly.controller;

import org.ly.domain.Stock;
import org.ly.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StockController {

	@Autowired
	private StockService stockService;

	@RequestMapping("stock")
	@ResponseBody
	public Stock add() {
		Stock stock = new Stock();
		stock.setId("123");
		return stockService.save(stock);
	}
	
	@RequestMapping("index")
	public String index(Model model) {
		Stock stock = stockService.findById("123");
		model.addAttribute("stock", stock);
		return "index";
	}
}
