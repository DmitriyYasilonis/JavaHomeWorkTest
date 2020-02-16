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
        } else if (result == 0.0) {
            System.out.println("There is only one root");
        } else {
            System.out.println("Ok");
        }
    }
}

//public class Module2Task7 {
//	// Task7
//	public static void main(String[] args) {
//		int intArray[] = new int[]{206,430,73,30,293,322,42,36,447,229};
//		System.out.println("Array Before Bubble Sort");
//		for(int i=0; i < intArray.length; i++){
//			System.out.print(intArray[i] + " ");
//		}
//		bubbleSort(intArray);
//		System.out.println("");
//		System.out.println("Array After Bubble Sort");
//		for(int i=0; i < intArray.length; i++){
//			System.out.print(intArray[i] + " ");
//		}
//	}
//
////private static void bubbleSort(int[] intArray) {
////	int n = intArray.length;
////	int temp = 0;
////	for(int i=0; i < n; i++){
////		for(int j=1; j < (n-i); j++){
////			if(intArray[j-1] > intArray[j]){
////				temp = intArray[j-1];
////				intArray[j-1] = intArray[j];
////				intArray[j] = temp;
////			}
////		}
////	}
////}
////}
//
////public static void main(String[] args) {
////int intArray[] = new int[]{206,430,73,30,293,322,42,36,447,229};
////System.out.println("Array Before Bubble Sort");
////for(int i=0; i < intArray.length; i++){
////System.out.print(intArray[i] + " ");
////}
////bubbleSort(intArray);
////System.out.println("");
////System.out.println("Array After Bubble Sort");
////for(int i=0; i < intArray.length; i++){
////System.out.print(intArray[i] + " ");
////}
////}
//
//	private static void bubbleSortTwo(int[] intArray) {
//
//		int n = intArray.length;
//		int temp = 0;
//
//		for (int i = 0; i < n; i++) {
//			for (int j = 1; j < (n - i); j++) {
//
//				if (intArray[j - 1] < intArray[j]) {
//					//swap the elements!
//					temp = intArray[j - 1];
//					intArray[j - 1] = intArray[j];
//					intArray[j] = temp;
//				}
//			}
//		}
//	}}

