package javatest;

import java.util.Scanner;

public void Customer(String name, String password) {
	

	Scanner s =new Scanner(System.in);
	String name= sc.nextLine();
	String password= sc.nextLine();
	
	
}

public void product() {
	Scanner s =new Scanner(System.in);
	int id =s.nextInt();
	String productname= s.nextLine();
	
}

public class QuestionTwo {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int i;
		
		
		Customer c =new Customer();
		Products p =new Products();
		Orders o= new Orders();
		
		do {
			
			System.out.println("press 1 to register a customer");
			System.out.println("press 2 to create a product ");
			System.out.println("press 3 to create a order");
		
		
		
	
		switch( sc.nextInt()) {
		case 1: p.Customer();
			break;
		case 2: c.Product();
		break;
		case 3:o.Order();
		break;
		
		}
	}while(i<4);
		
}

}
