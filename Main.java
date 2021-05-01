package interfaces;

public class Main {

	public static void main(String[] args) {	
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer fatma = new Customer(1, "Fatma", "Kaya");
		
		customerManager.add(fatma);
	}

}
