package kr.ac.kookmin.embedded.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

public class DiscountSale extends Sale {
	private double	discount;	// A percent of the price. Cannot be negative.
								
	public DiscountSale() {
		/** ���� �Ͻÿ� **/
		super("no name yet", 0);
		discount = 0;
	}
	
	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		/** ���� �Ͻÿ� **/
		super(theName, thePrice);
		discount = theDiscount;
	}
	
	public DiscountSale(DiscountSale originalObject) {
		/** ���� �Ͻÿ� **/
		super(originalObject.getName(), originalObject.getPrice());
		discount = originalObject.discount;
	}
	
	public static void announcement() {
		System.out.println("This is the DiscountSale class.");
	}
	
	public double bill() {
		/** ���� �Ͻÿ� **/
		return getPrice()/100*(100-discount);
	}
	
	public double getDiscount() {
		/** ���� �Ͻÿ� **/
		return discount;
	}
	
	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) {
		/** ���� �Ͻÿ� **/
		this.discount = newDiscount;
	}
	
	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill());
	}
	
	public boolean equals(Object otherObject) {
		/** ���� �Ͻÿ� **/
		if (otherObject == null){
			return false;
		}
		else if (getClass() != otherObject.getClass()){
			return false;
		}
		else {
			DiscountSale DC = (DiscountSale) otherObject;
			return (discount == DC.discount);
		}
			
	}
	
	public DiscountSale clone() {
		/** ���� �Ͻÿ�....  �ӽû����� ��� **/
		return new DiscountSale(this);
	}
}


