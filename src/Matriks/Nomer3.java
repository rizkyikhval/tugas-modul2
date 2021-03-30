/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriks;

/**
 *
 * @author Lenovo
 */
public class Nomer3 {
   public static void main(String[] args) {
        int [][] A = {
            {4,8,10},
            {10,11,3}
        };
        int [][] B = {
            {5,6},
            {10,7},
            {15,9}
        };
        if(A[0].length == B.length) {
            int[][] C = new int [A.length][B[0].length];
            for(int i = 0; i<A.length; i++) {
             for(int j = 0; j<B[0].length; j++) {
                 for(int k = 0; k<A[0].length; k++){
                 C [i][j] += A[i][k] * B[k][j];
             }   
                
            }
        }
        for(int[]c : C ){
            for(int i : c) {
           System.out.print(i+" "); 
        }
            System.out.println();
        }
        System.out.println("MUHAMMAD RIZKY IKHVAL ALAMSYAH");
        }
    }
    
        
    }  

