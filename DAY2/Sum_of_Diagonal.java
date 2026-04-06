class Sum_of_Diagonal{
    static void sumOfDiagonal(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("sum of diagonal elements is "+sum);
    }
    public static void main(String[] args) {
        //sum of digonal elements
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        sumOfDiagonal(arr);
        
    }
}