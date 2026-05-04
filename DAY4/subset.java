import java.util.ArrayList;
import java.util.List;

class subset {

    public static List<List<Integer>> subsets(int[] arr) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();

        // Loop through all possible subsets
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subset = new ArrayList<>();

            // Loop through all elements of the input array
            for (int j = 0; j < n; j++) {
               
                // Check if the jth bit is set
                if ((i & (1 << j)) != 0) {
                    subset.add(arr[j]);
                }
            }

            // Add subset to result
            res.add(subset);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> res = subsets(arr);

        for (int i = 0; i < res.size(); i++) {      
            List<Integer> subset = res.get(i);     
            System.out.print("[");                  
            for (int j = 0; j < subset.size(); j++) { 
                System.out.print(subset.get(j));  
                if (j != subset.size() - 1) 
                    System.out.print(", ");      
            }
            System.out.println("]");              
        }
    }
}