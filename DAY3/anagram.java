import java.util.Arrays;

class anagram {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "acb";
        char[] chars1 = s1.toCharArray(); 
        char[] chars2 = s2.toCharArray(); 
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        if(Arrays.equals(chars1,chars2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println(" Not Anagram");
        }
    }
}