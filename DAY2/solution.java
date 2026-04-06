public class solution {
    public static int multiply(String s1, String s2){
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        return num1*num2;
    }
    public static void main(String args[]){
       String s1 ="123456789";
       String s2 = "987654321";
    int result = multiply(s1, s2);
    System.out.println(result);
    }
}
