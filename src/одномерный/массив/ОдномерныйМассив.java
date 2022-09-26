/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package одномерный.массив;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class ОдномерныйМассив {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("---- Одномерный массив ----");
        int[][] nums2 = new int[10][10];
        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums2.length; j++){
                nums2[i][j] = random .nextInt(100);
            }
        }
        int sum = 0;
        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums2.length; j++){
                System.out.printf("%4d", nums2[i][j]);
            }
            System.out.println();
        }
        System.out.println();
            
    }  
}
