/**
 * 
 */
package Retail_Bookstore.model;

/**
 * @author PR262530
 *
 */
public class Item {

	Integer itemNo;
	String itemName;
	String description;
	Integer price;
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Item(Integer itemNo, String itemName, String description, Integer price) {
		super();
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
	}

	
}
