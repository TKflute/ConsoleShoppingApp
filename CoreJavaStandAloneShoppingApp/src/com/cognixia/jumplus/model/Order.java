package com.cognixia.jumplus.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

	// maybe use an inner class called OrderItem like I did for .NET project (CartLine)
	// will maybe choose a diff collection based on how I need to access the items
	private List<OrderItem> orderItems = new ArrayList<OrderItem>();
	
	public class OrderItem{
		
		private long id;
		private Item item;
		private int qty;
		
	}
}
