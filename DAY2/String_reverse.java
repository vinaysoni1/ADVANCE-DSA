class String_reverse{
    public static void main(String args[]){
       String s1 = "123456789";
       int n = s1.length();

       for(int i=n-1;i>=0;i--){
        System.out.println(s1.charAt(i));
       }
    }
}