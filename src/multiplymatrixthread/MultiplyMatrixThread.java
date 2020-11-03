/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplymatrixthread;

/**
 *
 * @author rewas
 */
public class MultiplyMatrixThread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[][] ar1 = {{2,3,1},{2,-7,4}};
        int[][] ar2 = {{3,4,5},{1,1,4},{2,1,4}};
        
        //check if number of columns in array1 equals number of rows in array2
        if(ar1[0].length==ar2.length){
            //create array3 for result
             int[][] ar3 = new int[ar1.length][ar2[0].length];
             //Split each row in the first matrix into a thread
            for(int i=0 ;i<ar1.length;i++){
                ThreadMethod tm =new ThreadMethod(i,ar1, ar2,ar3);
                Thread t = new Thread(tm);
                t.start();
            }
            //print the result of multiply
            for(int i=0 ;i<ar3.length;i++){
                for(int j=0; j<ar3[0].length;j++){
                    System.out.print(ar3[i][j]+" ");
                }
               System.out.println();
            }
        }
        
    }
   

}
