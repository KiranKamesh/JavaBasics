package product;

import java.util.Scanner;

public class StoreProductObjectsInArray {
	public static void main(String[] args) {

		Product[] productArray = new Product[3];

		// first way to store an object
		Product p1 = new Product(11, "Fan", 2300, "Electrical");
		Product p2 = new Product(12, "Bread", 40, "Diary");
		Product p3 = new Product(14, "Smartphone", 34400, "Electronics");

		productArray[0] = p1;
		productArray[1] = p2;
		productArray[2] = p3;

     	Scanner sc = new Scanner(System.in);

		for (Product product : productArray) {
			System.out.println(product.toString());
		}


		System.out.println("Enter the id to search");
		int pid = sc.nextInt();
		try {
			for (int i = 0; i < productArray.length; i++) {
				if (productArray[i].getProductId() == pid) {
					System.out.println("Product found");
				} else {
					throw new ProductNotFoundException("The following product is not found");
				}
			}
		} catch (ProductNotFoundException p) {
			System.out.println(p.getMessage());
		} finally {
			sc.close();
		}

	}
}
