public class D_to_Binary {
    public static int DB(int n){
        int pow =1;
        int res= 0;
        while(n>0){
            int rem = n%2;
            res = res + rem*pow;
            pow = pow*10;
            n = n/2;
        }
        return res;
    }
    public static void main(String[] args) {
       int n=10;
    System.out.println(DB(n));
    }
}
