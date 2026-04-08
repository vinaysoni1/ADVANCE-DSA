public class nonRep{
    public static char nonrepeating(String s){
        int n = s.length();

        for(int i = 0; i < n; i++){
            boolean found = false;

            for(int j = 0; j < n; j++){
                if(s.charAt(i) == s.charAt(j) && i != j){
                    found = true;
                    break;
                }
            }

            if(!found){
                return s.charAt(i);
            }
        }

        return '$';
    }

    public static void main(String[] args) {
        String s = "aabbccde";
        System.out.println(nonrepeating(s));
    }
}