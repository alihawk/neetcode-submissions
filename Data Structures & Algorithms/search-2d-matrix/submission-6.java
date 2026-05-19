class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i =0; i<rows;i++){
            int left = 0;
            int right = matrix[0].length -1 ;

            if(target<=matrix[i][cols-1]){
            while(left<=right){            
            {
                int mid = left + (right -left)/2;

                if(matrix[i][mid] == target){
                    System.out.println("Whats happening here: " + matrix[i][mid]);
                    return true;
                }else if(matrix[i][mid]>target){
                    right = mid -1;
                }else{
                    left = mid +1;
                }
           }}
            }
        }


        return false;
        
    }
}
