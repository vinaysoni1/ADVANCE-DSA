public class possible_substring {
    public static String SubString(String s){
        int n = s.length();
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j--){
                res.add(s.substring(i, j+1));

            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "abc";
        String res = SubString(s);
        System.out.println(res);
    }
}
