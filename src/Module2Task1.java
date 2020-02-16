
import java.lang.reflect.Array;
import java.util.Scanner;

public class Module2Task1 {
// Task1
//	public static void main(String[] Strings) {
//		int i, a, count; 
//		for(a = 1; a <= 5000; a++)
//		{
//			count = 0;
//		    for (i = 2; i <= a/2; i++)
//		    {
//		    	if(a % i == 0)
//		    	{
//		    		count++;
//		    		break;
//		    	}
//		    }
//		    if(count == 0 && a != 1 )
//		    {
//		    	System.out.print(a + " ");
//		    }  
//		}
//	}
//}

// Task2
//	 public static void main(String[] Strings) {
//			double a = 1;
//			double b = 1;
//			double c = 1;
//	            double result = b * b - 4.0 * a * c;
//
//	            if (result < 0.0) {
//	                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
//	                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
//	                System.out.println("There is no solution");
//	            } 	            else if (result == 0.0) {
//	                System.out.println("There is only one root");
//	            } 
//	            else {
//	                System.out.println("Ok");
//	            }
//	    }
//	}
	
// Task3
//	  public static void main(String[] args) {
//		    Scanner input = new Scanner(System.in);
//		    
//		    System.out.print("Enter a year: ");
//		    int year = input.nextInt();
//		    
//		    switch (year % 12) {
//		      case 0: System.out.println("monkey"); break;
//		      case 1: System.out.println("rooster"); break;
//		      case 2: System.out.println("dog"); break;
//		      case 3: System.out.println("pig"); break;
//		      case 4: System.out.println("rat"); break;
//		      case 5: System.out.println("ox"); break;
//		      case 6: System.out.println("tiger"); break;
//		      case 7: System.out.println("rabbit"); break;
//		      case 8: System.out.println("dragon"); break;
//		      case 9: System.out.println("snake"); break;
//		      case 10: System.out.println("horse"); break;
//		      case 11: System.out.println("sheep"); break;
//		    }
//		  }
//		}
	
// Task4
//		public static void main(String[] args) {
//		int start = 10;
//		int end = 150;
//		int start2 = 9980;
//		int end2 = 10000;
//		for( int number = start; number <=end2; number++) {
//			if ((number>=start && number<=end)||(number>=start2&&number<=end2))
//		   if (number == 0) {
//			System.out.print("Number in words: Zero");
//		   } else {
//			System.out.println(numberToWord(number));
//		   }
//		 } 
//		}
//	 
//	   private static String numberToWord(int number) {
//	        String words = "";
//	        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
//	                      "seven", "eight", "nine", "ten", "eleven", "twelve",
//	                      "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
//	                      "eighteen", "nineteen" };
//		String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
//	                      "sixty", "seventy", "eighty", "ninety" };
//	 
//		if (number == 0) {
//		    return "zero";
//		}
//		if (number < 0) { 
//	           String numberStr = "" + number; 
//	           numberStr = numberStr.substring(1); 
//	           return "minus " + numberToWord(Integer.parseInt(numberStr));
//	        } 
//	        if ((number / 1000000) > 0) {
//		   words += numberToWord(number / 1000000) + " million ";
//		   number %= 1000000;
//		}
//		if ((number / 1000) > 0) {
//		    words += numberToWord(number / 1000) + " thousand ";
//		    number %= 1000;
//		}
//		if ((number / 100) > 0) {
//		     words += numberToWord(number / 100) + " hundred ";
//		     number %= 100;
//		}
//	 
//		if (number > 0) {
//		     if (number < 20) { 
//	                words += unitsArray[number];
//	             } else { 
//	                words += tensArray[number / 10]; 
//	                if ((number % 10) > 0) {
//			    words += "-" + unitsArray[number % 10];
//	                }  
//		     }
//	          }
//	 	  return words;
//	   }
//	}
	
// Task5
//	public static int search(int arr[], int x) 
//	{ 
//	    int n = arr.length; 
//	    for(int i = 0; i < n; i++) 
//	    { 
//	        if(arr[i] == x) 
//	            return i; 
//	    } 
//	    return -1; 
//	} 
//	  
//	public static void main(String args[]) 
//	{ 
//	    int arr[] = {158,207,392,62,315,434,487,268,405,241};  
//	    int x = 405; 
//	      
//	    int result = search(arr, x); 
//	    if(result == -1) 
//	        System.out.print("Element is not present in array"); 
//	    else
//	        System.out.print("Index " + result); 
//	} 
//	} 

// Task6	
//	  public static void main(String[] args) {
//    double[] arr = {206,430,73,30,293,322,42,36,447,229};
//    double total = 0;
//
//    for(int i=0; i<arr.length; i++){
//    	total = total + arr[i];
//    }
//    double mean = total / arr.length;
//    System.out.format("The mean is: %.2f", mean);
//}

//public static void main(String[] args)	 {
//int[] nums = {206,430,73,30,293,322,42,36,447,229};
//int n = nums.length;
//	Queue<Integer> min = new PriorityQueue<Integer>(n);
//	for (int num : nums) {
//		min.add(num);
//	}
//	if ((n & 1) == 0) {
//		n >>= 1;
//		n -= 1;
//	} else {
//		n >>= 1;
//	}
//	int i = 0;
//	while (i < n) {
//		min.remove();
//		i++;
//	}
//	System.out.print("median: " + min.remove()); 
//}

//   static int mode(int a[],int n) {
//      int maxValue = 0, maxCount = 0, i, j;
//
//      for (i = 0; i < n; ++i) {
//         int count = 0;
//         for (j = 0; j < n; ++j) {
//            if (a[j] == a[i])
//            ++count;
//         }
//
//         if (count > maxCount) {
//            maxCount = count;
//            maxValue = a[i];
//         }
//      }
//      return maxValue;
//   }
//   public static void main(String args[]){
//      int n = 5;
//      int a[] = {206,430,73,30,293,322,42,36,447,229};
//      System.out.println("Mode ::"+mode(a,n));
//   }

//public static void main(String[] args) {
//    double[] numArray = {206,430,73,30,293,322,42,36,447,229};
//    double SD = calculateSD(numArray);
//    System.out.format("Standard Deviation = %.3f", SD);
//}
//public static double calculateSD(double numArray[])
//{
//    double sum = 0.0, standardDeviation = 0.0;
//    int length = numArray.length;
//    for(double num : numArray) {
//        sum += num;
//    }
//    double mean = sum/length;
//    for(double num: numArray) {
//        standardDeviation += Math.pow(num - mean, 2);
//    }
//    return Math.sqrt(standardDeviation/length);
//}
//}
	
// Task7	
//	public static void main(String[] args) {
//	int intArray[] = new int[]{206,430,73,30,293,322,42,36,447,229};
//	System.out.println("Array Before Bubble Sort");
//	for(int i=0; i < intArray.length; i++){
//		System.out.print(intArray[i] + " ");
//	}
//	bubbleSort(intArray);
//	System.out.println("");
//	System.out.println("Array After Bubble Sort");
//	for(int i=0; i < intArray.length; i++){
//		System.out.print(intArray[i] + " ");
//	}
//
//}
//
//private static void bubbleSort(int[] intArray) {
//	
//	int n = intArray.length;
//	int temp = 0;
//	
//	for(int i=0; i < n; i++){
//		for(int j=1; j < (n-i); j++){
//			
//			if(intArray[j-1] > intArray[j]){
//				//swap the elements!
//				temp = intArray[j-1];
//				intArray[j-1] = intArray[j];
//				intArray[j] = temp;
//			}
//			
//		}
//	}
//
//}
//}

//public static void main(String[] args) {
//int intArray[] = new int[]{206,430,73,30,293,322,42,36,447,229};
//System.out.println("Array Before Bubble Sort");
//for(int i=0; i < intArray.length; i++){
//System.out.print(intArray[i] + " ");
//}
//bubbleSort(intArray);
//System.out.println("");
//System.out.println("Array After Bubble Sort");
//for(int i=0; i < intArray.length; i++){
//System.out.print(intArray[i] + " ");
//}
//
//}
//
//private static void bubbleSort(int[] intArray) {
//
//int n = intArray.length;
//int temp = 0;
//
//for(int i=0; i < n; i++){
//for(int j=1; j < (n-i); j++){
//	
//	if(intArray[j-1] < intArray[j]){
//		//swap the elements!
//		temp = intArray[j-1];
//		intArray[j-1] = intArray[j];
//		intArray[j] = temp;
//	}
//	
//}
//}
//
//}
//}