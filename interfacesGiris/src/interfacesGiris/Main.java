package interfacesGiris;

public class Main {

	public static void main(String[] args) {
		
		/*CustomerManager customerManager = new CustomerManager();
		customerManager.customerdal =new OracleCustomerDal();
		customerManager.add();*/ //bu y�ntem genellikle unutuluyor 2. y�ntem a�ag�da constracter olarak yaz�labilir...
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();

	}

}
