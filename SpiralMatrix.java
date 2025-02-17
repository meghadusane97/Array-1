// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left=0, right=n-1;
        int top=0, bottom=m-1;

        List<Integer> result = new ArrayList<>();

        while(top <= bottom && left <= right){
            //top row
            for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;

            //right wall
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;

            //bottom wall
            if(top <= bottom){
                for(int j=right;j>=left;j--){
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;

            //left wall
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;

        }
        return result;
    }
}