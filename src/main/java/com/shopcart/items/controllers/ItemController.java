package com.shopcart.items.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopcart.items.entity.Item;

@RestController
public class ItemController {

	@GetMapping("/items")
	  List<Item> fetchAll() {
		List<Item> lItems = new ArrayList<Item>();
		lItems.add(new Item("Luigi", "1000", "Action figure"));
	    return lItems;
	  }
}
