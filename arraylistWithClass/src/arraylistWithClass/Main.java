package arraylistWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customers =new ArrayList<Customer>();
		Customer g�khan = new Customer(1,"g�khan","ko�");
		customers.add(g�khan);
		Customer ali = new Customer(2,"ali","ko�");
		customers.add(ali);
		Customer kadir = new Customer(3,"kadir","ko�");
		customers.add(kadir);
		
		customers.remove(ali);
		for(Customer i:customers) {
			System.out.println(i.name);
		}

	}

}
