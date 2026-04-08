 public class main{
    public static void Main(String [] args){
        String s1 = "vinaysoni";
        String s2 = "vinay";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.equals(s2));

        String rev= "";
        int n = s1.length();
        for(int i=n-1; i>=0; i--){
            rev = rev +s1.charAt(i);
        }
        System.out.println(rev);

    }

}