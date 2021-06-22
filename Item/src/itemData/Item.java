
/**
 * @class Item
 * @author chahat
 * @description Item class contains getter and setter methods.
 *
 */
package itemData;

import constant.Type;

public class Item {
	public String itemName, itemType;
	public float itemPrice;
	public int itemQuantity;
	public Type type;

	public Item(String itemName, String itemType, float itemPrice, int itemQuantity, Type type) {
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
		this.type = type;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Type getItemType() {
		return type;
	}

	public void setItemType(Type type) {
		this.type = type;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

}