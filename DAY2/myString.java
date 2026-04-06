class MyString{
    public static void main(String args[]){
        String s1 = "Hello JS";
        String s2 = "Hello JAVA";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.equals(s2));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(0, 7));
        System.out.println(s1.contains("hey"));
        System.out.println(s1.replace(s1, s2));
        System.out.println(s1.replace('2', 'J'));

        String s3 = "Hello i am Vinay soni and Age is 19 Year old";
        int n = s3.length();
       System.out.println(n);
    }
}