/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62813
 */
import java.util.Scanner;
public class ArrayTerbalik {
      public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      int[]angka = new int[5];
      
      for (int i = 0; i < angka.length; i++){
          angka[i] = input.nextInt();
      }
      for(int i = 4; i >=0; i--){
          System.out.println(angka[i] + " ");
      }
  }
}
