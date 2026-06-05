class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] m1=new int[r][c];
        if(r*c != m*n) return mat;
           int x=0;
           int y=0;
           for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                m1[x][y]=mat[i][j];
                y++;
                if(y==c){
                    y=0;
                    x++;
                }
            }
           }
         return m1;
       
    }
}