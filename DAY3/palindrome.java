 class palindrome{
    public static void main(final String[] args) {
        final String s1 = "malayalam";
        String rev= "";
        final int n = s1.length();
        for(int i=n-1; i>=0; i--){
            rev = rev +s1.charAt(i);
        }
        // System.out.println(rev);
        if(s1.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println(" Not Palindrome");
        }
            
        }
    }
