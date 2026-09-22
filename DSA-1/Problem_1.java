class Problem_1 {
    static boolean isSorted(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        if (isSorted(arr, n)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}