public class Problem_2 {
    public static int findFreq(int arr[],int n, int x){
        int count = 0;
       for (int t: arr){
        if (t==x){
            count++;
        }
       }
       return count;
    }
    public static void main(String[] args) {
        int arr [] ={1,2,2,3,1,4};
        int n = arr.length;
        int count = 0;
        int x = 1;
        System.out.println("The frequency of " + x + " is: " + findFreq(arr,n,x));
       
    }
}
