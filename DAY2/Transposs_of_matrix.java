
public class Transposs_of_matrix {
    public static int[][] transposs(int arr[][]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int result[][] = transposs(arr);
        for(int row[]: result){
            for(int element: row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
