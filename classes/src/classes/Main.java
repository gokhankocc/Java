package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerMenager;// = new CustomerManager();
		CustomerManager customerMenager2 = new CustomerManager();
		customerMenager=customerMenager2; //6. sat�rdaki new in bi anlam� kalmaz newsizde cali�abilir
		customerMenager.add();
		customerMenager.update();
		customerMenager.remove();
	}

}
