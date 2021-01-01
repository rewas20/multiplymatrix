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
public class ThreadMethod implements Runnable{

    int RowNumber;
    int[][] array1,array2,multiplyResult;
    int Result=0;

    public ThreadMethod(int RowNumber, int[][] array1, int[][] array2, int[][] multiplyResult) {
        this.RowNumber = RowNumber;
        this.array1 = array1;
        this.array2 = array2;
        this.multiplyResult = multiplyResult;
    }
   
    @Override
    public void run() {
        int size = array2[0].length;
            for(int i=0;i<size;i++){
                 for(int j=0;j<size;j++){
                      Result+=array1[RowNumber][j]*array2[j][i];
                 }   
                 //put the result of multiply in array3 "multiplyResult"
                 multiplyResult[RowNumber][i]= Result;
                 Result = 0;
       }
       
    }
    
}
