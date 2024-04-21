package question2;

import java.util.Scanner;

public class XYZ {

	
	    public static Product[] acceptProductInformation(Scanner sc) {
		Product[] products=new Product[5];
		for(int i=0;i<=5;i++) {
		
     	System.out.println("Enter product "+(i+1)+" Details");
     	System.out.println("Enter PId: ");
     	int pid=sc.nextInt();
     	System.out.println("Enter Price ");
     	double price=sc.nextDouble();
     	System.out.println("Enter Quantity: ");
     	int quantity=sc.nextInt();
     	products[i]=new Product(pid, price, quantity);     	
		}
		return products;
			}
	
	public static int findMaxPricePid(Product[] products) {
		double maxPrice = Double.MIN_VALUE;
        int maxPid = -1;
        for (Product product : products) {
            if (product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
                maxPid = product.getpID();
            }
           
        }
        return maxPid;
      
    }
	 public static double calculateTotalAmount(Product[] products) {
	        double totalAmount = 0;
	        for (Product product : products) {
	            totalAmount += product.getPrice() * product.getQuantity();
	        }
	        return totalAmount;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	    
	        Product[] products = acceptProductInformation(sc);

	        int maxPid = findMaxPricePid(products);
	        System.out.println("PID of the product with the highest price: " + maxPid);

	        double totalAmount = calculateTotalAmount(products);
	        System.out.println("Total amount spent on all products: RS" + totalAmount);

	        sc.close();
	    }
	}