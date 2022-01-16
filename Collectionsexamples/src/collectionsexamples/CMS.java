package collectionsexamples;

import java.util.ArrayList;
import java.util.Scanner;

public class CMS {
	Scanner sc = new Scanner(System.in);
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	Customer c = null;

	public void addCustomer(Customer c) {
		customerList.add(c);
	}

	public void showCustomers() {
		System.out.println("List of customer.........");
		for (int i = 0; i < customerList.size(); i++) {
			System.out.println(customerList.get(i).getCustomerId() + "\t" + customerList.get(i).getCustomerName() + "\t"
					+ customerList.get(i).getCustomerEmail() + "\t" + customerList.get(i).getCustPhno());

		}
	}
	
	public Customer readCustomerDetails(Customer c) {
		System.out.println("Enter the customer details");
		System.out.println("Enter the customer id");
		sc.nextLine();
		c.setCustomerId(sc.nextInt());
		System.out.println("Enter the customer name");
		sc.nextLine();
		c.setCustomerName(sc.nextLine());
		System.out.println("Enter the customer email id");
		sc.nextLine();
		c.setCustomerEmail(sc.nextLine());
		System.out.println("Enter the phone num");
		sc.nextLine();
		c.setCustPhno(sc.nextLine());
		return c;
	}
	
	public Customer findCustomerById(int cid) {
		Customer c1 = new Customer();
		for(int i = 0;i<customerList.size(); i++) {
			if(customerList.get(i).getCustomerId() == cid) {
				c1 = customerList.get(i);
			}
		}
		return c1;
	}
	
	public String removeCustomer(Customer c) {
		if(customerList.remove(c)) {
			return "Removed successfully";
		}else {
			return "not found";
		}
	}
	
	public void showCustomerOperations() {
		char ch ='y';
		while(ch == 'y') {
			System.out.println("Enter the operation name to execute");
			System.out.println("1. to add customer");
			System.out.println("2. list all the customers");
			System.out.println("3. to delete the customers");
			
			int op = sc.nextInt();
			switch(op){
				case 1:
					c = new Customer();
					addCustomer(readCustomerDetails(c));
					break;
				case 2:
					showCustomers();
					break;
				case 3:
					System.out.println("Enter the product id to remove");
					int cid = sc.nextInt();
					Customer c2 = findCustomerById(cid);
					System.out.println(removeCustomer(c2));
					break;
				default:
					break;
						
			}
			System.out.println("do you want to continue?");
			ch = sc.next().charAt(0);
		}
	}

}
