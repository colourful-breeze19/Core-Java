/**
 * @class Input
 * @author chahat
 * @description Input class takes the details of each item from the user
 *
 */

package business;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import constant.Type;
import itemData.Item;

public class Input {
	ArrayList<Item> list = new ArrayList<>();

	/**
	 * @param null
	 * @return null
	 */
	public void inputs() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// declaring variables
		String itemName, itemType;
		float itemPrice;
		int itemQuantity;
		String choice;

		do {

			// Taking user inputs for each values
			try {
				System.out.println("Enter item name: ");
				itemName = sc.next();

				System.out.println("Enter item price: ");
				itemPrice = sc.nextFloat();

				System.out.println("Enter item quantity: ");
				itemQuantity = sc.nextInt();

				System.out.println("Enter item type: ");
				itemType = sc.next();
				itemType = itemType.toUpperCase();
				Type type = Type.valueOf(itemType);

				Item item = new Item(itemName, itemType, itemPrice, itemQuantity, type);
				list.add(item);

			}

			catch (InputMismatchException e) {
				System.out.println("Enter valid data");
				choice = sc.next();
			}

			finally {
				System.out.print("Do you want to enter details of any other item? (y/n)");
				choice = sc.next();

				System.out.println("\t");
			}
		} while (choice.equalsIgnoreCase("Y"));

	}

	public void getList() {
		new SalesTax(list);

	}

}
