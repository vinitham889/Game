import java.util.ArrayList;
import java.util.List;

public  class ShoppingCart
  
  {
	public static void main(String[] args)
	{
		List<Product>basket = new ArrayList<>();
		basket.add(new Product("Leather",1100,18,1));
		basket.add(new Product("Umbrella",900,12,2));
		basket.add(new Product("Cigarette",200,28,3));
		basket.add(new Product("Honey",100,0,4));
		
		double totalAmount =0;
		double maxGST =0;
		String maxGSTProduct = "";
		
		for(Product product :basket)
		{
			totalAmount+= product.getTotalPrice();
			if(product.unitPrice>=500)
			{
				totalAmount-= product.getTotalPrice()*0.05;// apply 5% discount
			}
			if(product.getTotalGST()>maxGST)
			{
				maxGST = product.getTotalGST();
				maxGSTProduct = product.productName;
			}
			
		}
		
		System.out.println("Product with maximum GST: "+maxGSTProduct+" : "+maxGST);
		System.out.println("Total amount to be paid : Rs. "+(totalAmount));
	}
  }
		
		
		
	




