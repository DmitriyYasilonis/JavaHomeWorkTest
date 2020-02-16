public class Module2Task7 {
    // Task7
    public static void main(String[] args) {
        int intArray[] = new int[]{206, 430, 73, 30, 293, 322, 42, 36, 447, 229};
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        bubbleSortAscending(intArray);
        System.out.println("");
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        bubbleSortDescending(intArray);
        System.out.println("");
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    private static void bubbleSortAscending(int[] intArray) {
        int n = intArray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (intArray[j - 1] > intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }

    private static void bubbleSortDescending(int[] intArray) {
        int n = intArray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (intArray[j - 1] < intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }
}

