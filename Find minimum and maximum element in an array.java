class Compute 
{
    static pair getMinMax(long a[], long n)  
   {
       pair p = null;
       
       long max=Integer.MIN_VALUE;
       long min = Integer.MAX_VALUE;
       
       for(int i=0; i<n; i++){
           if(a[i] > max){
               max = a[i];
           }
           if(a[i]<min){
               min = a[i];
           }
       }
       
       p = new pair(min,max);
       
       return p;
   }
}