class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
         if(B.length>A.length)
        findMedianSortedArrays(B,A);
        int totallength = A.length + B.length;
        
        if(totallength  % 2 == 0){
        int a=A.length,b=B.length;
            int c1 = 0,c2 = 0;
            for(int i =0;i<=(totallength/2) ;i++){
                c2=c1;
                if(a>0 && b>0)
                {
                    if(A[A.length-a]>=B[B.length-b] )
                    {
                       c1=B[B.length-b];
                       b--;
                    }else{
                        c1=A[A.length-a];
                        a--;
                    }
                }else if(a>0 && b<= 0){
                    c1=A[A.length-a];
                    a--;
                }else{
                    c1=B[B.length-b];
                       b--;
                }
            }
            return (c1+c2)/2.0;
        }
        else{
            int a=A.length,b=B.length;
            int c1 = 0;
            int[] arr =new int[10000];
            for(int i =0;i<=totallength/2 ;i++){
                if(a>0 && b>0)
                {
                    if(A[A.length-a]>=B[B.length-b] )
                    {
                       c1=B[B.length-b];
                       b--;
                    }else{
                        c1=A[A.length-a];
                        a--;
                    }
                }else if(a>0 && b<= 0){
                    c1=A[A.length-a];
                    a--;
                }else{
                    c1=B[B.length-b];
                       b--;
                }
            }
            return c1;
            
        }
    }
}
