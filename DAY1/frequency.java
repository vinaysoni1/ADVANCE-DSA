public class frequency {
    public static int freq(int a, int target) {
        int count = 0;
        while (a > 0) {
            int rem = a % 10;
            if (rem == target) {
                count++;
            }
            a = a / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 1999;
        int target =9 ;
        System.out.println(freq(a, target));
    }
}
