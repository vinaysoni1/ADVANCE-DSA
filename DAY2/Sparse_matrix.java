public class Sparse_matrix {
    public static void sparse(int arr[][]){
        int n = arr.length;
        int top =0;
        int bottom = n-1;
        int left = 0;   
        int right = n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                if(arr[top][i]!=0){
                    System.out.print(arr[top][i]+" ");
                }
            }
            top++;
            for(int i=top;i<=bottom;i++){
                if(arr[i][right]!=0){
                    System.out.print(arr[i][right]+" ");
                }
            }
            right--;
            for(int i=right;i>=left;i--){
                if(arr[bottom][i]!=0){
                    System.out.print(arr[bottom][i]+" ");
                }
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                if(arr[i][left]!=0){
                    System.out.print(arr[i][left]+" ");
                }
            }
            left++; 
        }
    }
    public static void main(String args[]){
    int arr[][]={{1,2,3},
                {4,5,6},
                {7,8,9}};
    sparse(arr);
    }
}

