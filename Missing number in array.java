class Solution {
    int MissingNumber(int array[], int n) {
        int TotalSumOfN=0;
          int TotalSumOfArray=0;
          for(int i=1;i<=n;i++){
              TotalSumOfN=TotalSumOfN+i;
          }
          for(int j=0;j<array.length;j++){
              TotalSumOfArray=TotalSumOfArray+array[j];
          }
          
          int result=TotalSumOfN-TotalSumOfArray;
          return result;
    }
}