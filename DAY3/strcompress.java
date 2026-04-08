public class strcompress {
    public static String compressed(String s1) {
        
        int n=s1.length();
        if(n==0){
            return "";
        }
         StringBuilder compressed = new StringBuilder();
        int count =1;
        for(int i=0; i<n; i++){
            if (i + 1 < n && s1.charAt(i) == s1.charAt(i + 1)) {
            count++;
        } else {
            // Append character and its count
            compressed.append(s1.charAt(i)).append(count);
            count = 1; // Reset count for the next character
        }
        }
        return  compressed.toString();
    }
    public static void main(String[] args) {
        String s1 = "aabbbccd";
        
        System.out.println(compressed(s1));
    }
}
