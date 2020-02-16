public class Module2Task5 {
    // Task5
    public static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {158, 207, 392, 62, 315, 434, 487, 268, 405, 241};
        int x = 405;

        int result = search(arr, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Index " + result);
    }
}
