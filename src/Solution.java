import java.util.*;
public class Solution {
    
   
//	static int[]A= {1,2,5,1,2};
	static int[]A= {7,6,7,8,3};
    int[]B=new int[A.length];
    
    int lenght; int count;
    int num=0;
    
    public void removeDup(int[]A)
    {
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        
         int i=0,q=1,j=0; 
   
        for (; i<A.length; i++,j++){

        	num=A[i]^A[q];
        	
           System.out.println("hereis the num" +num);
            if(num==0)
             {  i++;
                q++;
             }
     //       count +=1;
            B[j]=A[i];
           
           
        }
        System.out.println(j);
        System.out.println(Arrays.toString(B));
      //  B.length=j;
    }
    
    
 //below method scans through array of int and replace dup int values with 0 w/o using any other Array.

    public void geetaremoveDup(int[] A) {
    	for(int j=0;j<A.length-1;j++) {
    		if(A[j]==A[j+1]) {
    			A[j]=0;
    		}
    	}
     
    	System.out.println(Arrays.toString(A));
    	
    	
    }
    
    public static void main(String[] args)
    {
        
        new Solution().removeDup(A);
        new Solution().geetaremoveDup(A);    //geeta's new method to remove dup from array, replacing to 0.
        
    }
    
}