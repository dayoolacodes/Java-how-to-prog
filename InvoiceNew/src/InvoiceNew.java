
public class InvoiceNew {
	private String partNumber;
	private String partDescription;
	private int quantityOfItem;
	private double pricePerItem;
	
	
	public InvoiceNew() {
		// TODO Auto-generated constructor stub
	}
	
	public String getPartNumber() {
		return partNumber;
	}


	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}


	public String getPartDescription() {
		return partDescription;
	}


	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}


	public int getQuantityOfItem() {
		return quantityOfItem;
	}


	public void setQuantityOfItem(int quantityOfItem) {
		
		this.quantityOfItem = quantityOfItem;
	}


	public double getPricePerItem() {
		return pricePerItem;
	}


	public void setPricePerItem(double pricePerItem) {
		
		this.pricePerItem = pricePerItem;
		pricePerItem = 6;
	}
	public double getInvoiceAmount(int qtyOfItem, double pricePItem) {
		if (qtyOfItem < 0) {
			qtyOfItem = 0;
		}
		if (pricePItem < 0) {
			pricePItem = 0.0;
		}	
		double	amount = qtyOfItem * pricePItem;
		return amount;
		}
	
		
}
