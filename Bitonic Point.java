class Solution {
    
    int findMaximum(int[] arr, int n) {
        int low = 0, high = n-1, mid = 0;
        
        while(low <= high) {
            mid = low + (high - low)/2;
            
            if((mid == 0 || arr[mid] >= arr[mid - 1]) && 
               (mid == n-1 || arr[mid] >= arr[mid + 1])) {
                return arr[mid];
            }
            
            if(mid > 0 && arr[mid-1] > arr[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return arr[mid];
    }
}