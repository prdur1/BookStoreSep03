package Retail_Bookstore.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Retail_Bookstore.model.Item;
import Retail_Bookstore.model.User;

public class ItemDB {
	
	public List<Item> items = new ArrayList<Item>();
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public ItemDB(){
		
		Item item1 = new Item(new Integer(101), "TV", "Television", new Integer(2000));
		Item item2 = new Item(new Integer(102), "Fridge", "Television", new Integer(2000));
		Item item3 = new Item(new Integer(103), "Mobile", "Television", new Integer(2000));
		Item item4 = new Item(new Integer(104), "Washing Machine", "Television", new Integer(2000));
		
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		
	}
	


}
