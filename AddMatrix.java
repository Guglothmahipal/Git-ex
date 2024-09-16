/* Java Program Addition of Matrix nD*/

import java.util.*;
class AddMatrix{
public static void main(String[] args){

  Scanner sc=new Scanner(System.in);
   int i, j, r, c;
    System.out.println("enter number of rows :");
     r=sc.nextInt();
     System.out.println("enter number of colom :");
     c=sc.nextInt();
      int arr1[][]=new int[r][c];
      int arr2[][]=new int[r][c];
      int arr3[][]=new int[r][c]; 
      
      System.out.println("Enter the elements of the first matrix"); 
       for(i=0;i<r;i++){
         for(j=0;j<c;j++){
          arr1[i][j]=sc.nextInt();
    }
  }
            System.out.println("Elements in the first matrix"); 
       for(i=0;i<r;i++){
         for(j=0;j<c;j++){
          System.out.print(arr1[i][j]+" ");
 
     }
         System.out.println();

   }
       System.out.println("Enter the elements of the second matrix");
         for(i=0;i<r;i++){
         for(j=0;j<c;j++){
          arr2[i][j]=sc.nextInt();

     }
   }
       System.out.println("Elements in the Second matrix"); 
       for(i=0;i<r;i++){
         for(j=0;j<c;j++){
          System.out.print(arr2[i][j]+" ");
 
     }
         System.out.println();
   }

      System.out.println("addition of matrics=");
        for(i=0;i<r;i++){
         for(j=0;j<c;j++){
          arr3[i][j]=arr1[i][j]+arr2[i][j];

      }
    }
          
       for(i=0;i<r;i++){
         for(j=0;j<c;j++){
          System.out.print(arr3[i][j]+" ");
 
     }
         System.out.println();
   }    
  
 }
}