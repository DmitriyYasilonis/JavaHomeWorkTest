import java.util.PriorityQueue;
import java.util.Queue;

public class Module2Task6 {
    // Task6
//     MEAN
    public static void main(String[] args) {
        double[] arr = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229};
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        double mean = total / arr.length;
        System.out.format("The mean is: %.2f", mean);
    }
// MEDIAN
//    public static void main(String[] args) {
//        int[] nums = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229};
//        int n = nums.length;
//        Queue<Integer> min = new PriorityQueue<Integer>(n);
//        for (int num : nums) {
//            min.add(num);
//        }
//        if ((n & 1) == 0) {
//            n >>= 1;
//            n -= 1;
//        } else {
//            n >>= 1;
//        }
//        int i = 0;
//        while (i < n) {
//            min.remove();
//            i++;
//        }
//        System.out.print("median: " + min.remove());
//    }
// MODE
//    public static int mode(int a[], int n) {
//        int maxValue = 0, maxCount = 0, i, j;
//
//        for (i = 0; i < n; ++i) {
//            int count = 0;
//            for (j = 0; j < n; ++j) {
//                if (a[j] == a[i])
//                    ++count;
//            }
//            if (count > maxCount) {
//                maxCount = count;
//                maxValue = a[i];
//            }
//        }
//        return maxValue;
//    }
//    public static void main(String args[]) {
//        int n = 5;
//        int a[] = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229};
//        System.out.println("Mode ::" + mode(a, n));
//    }
//STANDART DEVIATION
//    public static void main(String[] args) {
//        double[] numArray = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229};
//        double SD = calculateSD(numArray);
//        System.out.format("Standard Deviation = %.3f", SD);
//    }
//    public static double calculateSD(double numArray[]) {
//        double sum = 0.0, standardDeviation = 0.0;
//        int length = numArray.length;
//        for (double num : numArray) {
//            sum += num;
//        }
//        double mean = sum / length;
//        for (double num : numArray) {
//            standardDeviation += Math.pow(num - mean, 2);
//        }
//        return Math.sqrt(standardDeviation / length);
//    }
}
