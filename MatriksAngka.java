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
public class MatriksAngka {
      public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int u = input.nextInt();
    
   for (int i = 0; i < u; i++) {
            for (int j = 0; j < u; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    
    
  }
}
