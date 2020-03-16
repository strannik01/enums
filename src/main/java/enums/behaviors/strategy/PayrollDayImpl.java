package enums.behaviors.strategy;

public class PayrollDayImpl {

	public static void main(String[] args) {
		int data = PayrollDay.MONDAY.pay(600, 5);
		System.out.println(data);
		
		
		int dat = PayrollDay.SATURDAY.pay(120, 3);
		System.out.println(dat);
	}

}
