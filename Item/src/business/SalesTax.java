/**
 * @class SalesTax
 * @author chahat
 * @description SalesTax class calculates the tax of each item depending upon its type.
 */

package business;

import java.util.ArrayList;

import business.exception.InvalidTypeException;
import constant.Constants;
import constant.Type;
import itemData.Item;

/**
 * @author chahat
 *
 */
public class SalesTax {

	SalesTax(ArrayList<Item> list) {
		try {
			// validateInputs();
			// processInputs();
			for (int i = 0; i < list.size(); i++) {

				double salesTax = 0.0d;
				double finalPrice = 0.0d;

				// double rawTx = 12.5;
				if (list.get(i).getItemType().equals(Type.RAW))
					salesTax += (Constants.TAX_RAW * list.get(i).getItemPrice()) / 100;
				else if (list.get(i).getItemType().equals(Type.MANUFACTURED))
					salesTax += (Constants.TAX_MANUFACTURED * list.get(i).getItemPrice()) / 100
							+ Constants.SURCHARGE_MANUFACTURED * (list.get(i).getItemPrice()
									+ (Constants.TAX_MANUFACTURED * list.get(i).getItemPrice()) / 100) / 100;
				else if (list.get(i).getItemType().equals(Type.IMPORTED)) {
					salesTax += (Constants.IMPORT_DUTY * list.get(i).getItemPrice()) / 100;
					if (salesTax <= 100)
						salesTax += 10;
					else if (salesTax > 100 && salesTax <= 200)
						salesTax += 15;
					else
						salesTax += (5 * salesTax) / 100;

				} else {
					throw new InvalidTypeException("Invalid Item Type");
				}
				finalPrice = (list.get(i).getItemPrice() + salesTax) * list.get(i).getItemQuantity();

				System.out.println("Item Name: " + list.get(i).getItemName());
				System.out.println("Item price: " + list.get(i).getItemPrice());
				// System.out.println("Item Quantity: "+ list.get(i).getItemQuantity());
				System.out.println("Sales tax liability per item: " + salesTax);
				System.out.println("Final price: " + finalPrice);
				System.out.println("\t");

			}
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
