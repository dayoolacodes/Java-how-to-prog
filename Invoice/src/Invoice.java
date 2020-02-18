
public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantityOfItem;
	private double pricePerItem;
	
	
	public Invoice() {
	}
	public Invoice(String partNum, String partDes, int qtyOfIt, double pricePerItem) {
		partNumber = partNum;
		partDescription = partDes;
		quantityOfItem = qtyOfIt;
		this.pricePerItem = 5;
		if (quantityOfItem < 0) {
			this.quantityOfItem = 0;
		}
		if(pricePerItem < 0) {
			this.pricePerItem = 0.0;
		}
		
		
		
	}
	
	public double getInvoiceAmount() {
		double amount = quantityOfItem * pricePerItem;
		return amount;
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
		if (quantityOfItem < 0) {
			this.quantityOfItem = 0;
		}
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		
		this.pricePerItem = pricePerItem;
		
	}
	
}
