public class Module2Task2 {
// Task2
	 public static void main(String[] Strings) {
			double a = 1;
			double b = 1;
			double c = 1;
	            double result = b * b - 4.0 * a * c;

	            if (result < 0.0) {
	                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
	                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
	                System.out.println("There is no solution");
	            } 	            else if (result == 0.0) {
	                System.out.println("There is only one root");
	            }
	            else {
	                System.out.println("Ok");
	            }
	    }
	}

