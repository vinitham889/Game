import java.util.ArrayList;
import java.util.List;
public class Product {
	String productName;
		double unitPrice;
		double gst;
		int quantity;

		
		public Product(String productName,double unitPrice,double gst,
		int quantity )
		{
			this.productName = productName;
			this.unitPrice=unitPrice;
			this.gst=gst;
			this.quantity = quantity;
			
			
		}
		public double getTotalPrice()
		{
			return unitPrice*quantity;
		}
		public double getTotalGST()
		{
			return (unitPrice*gst/100)*quantity;
		}
	}


