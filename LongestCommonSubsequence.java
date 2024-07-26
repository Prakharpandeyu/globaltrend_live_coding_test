public int LongestCommonSubsequence(String str1,String str2){
    int n=str1.length();
    int m=str2.length();
    int[][] dpGrid=new int[n+1][m+1];
    for(int row=n-1;row>=0;row--){
        for(int col=m-1;col>=0;col--){
        if(str1.charAt(row)==str2.charAt(col)){
            dpGrid[row][col]=1+dpGrid[row+1][col+1];
        }else{
            dpGrid[row][col]=Math.max(dpGrid[row+1][col],dpGrid[row][col+1]);
        }
    }
}
return dpGrid[0][0];
}