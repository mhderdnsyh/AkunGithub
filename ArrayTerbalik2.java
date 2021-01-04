/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62813
 */
import java.util.*;
public class ArrayTerbalik2 {
      public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int jumlah = input.nextInt();
    int[] nilai = new int[jumlah];
    for (int i = 0; i < jumlah; i++) {
         nilai[i] = input.nextInt();
    }
    
    for(int i=0; i < nilai.length/2; i++){
        int temp = nilai[i];
        nilai[i] = nilai[(nilai.length-1) -i];
        nilai[(nilai.length-1) -i] = temp;
      
    }
    System.out.println(Arrays.toString(nilai) );
    
  }
}
