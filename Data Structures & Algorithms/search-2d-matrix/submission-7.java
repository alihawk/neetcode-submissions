class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i =0; i<rows;i++){
           

            if(target >= matrix[i][0] && target<=matrix[i][cols-1]){
            int left = 0;
            int right = matrix[0].length -1 ;
            while(left<=right){            
            {
                int mid = left + (right -left)/2;

                if(matrix[i][mid] == target){
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
