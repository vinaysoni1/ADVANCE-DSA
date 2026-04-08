public class B_to_Decimal {
    public static int BD(int n){
        int pow =1;
        int res= 0;
        while(n>0){
            int rem = n%10;
            res = res + rem*pow;
            pow = pow*2;
            n = n/10;
        }
        return res;
    }
    public static void main(String[] args) {
       int n=1111;
    System.out.println(BD(n));
    }
    
}
