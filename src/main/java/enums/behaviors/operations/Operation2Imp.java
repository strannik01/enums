package enums.behaviors.operations;

public class Operation2Imp {

	public static void main(String[] args) {
		double x = Double.parseDouble("5");
		double y = Double.parseDouble("6");
		
		for (Operation2 op : Operation2.values())
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
	}

}
