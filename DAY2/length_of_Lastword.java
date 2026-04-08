public class length_of_Lastword {
    public static int lengthoflastword(String s){
       
        int count = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                if(count>0){
                    return count;
                }
            }
            else{
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args){
String s = "hello world";
int result = lengthoflastword(s);
System.out.println(result);
    }
}
