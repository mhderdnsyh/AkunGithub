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
public class GambarPersegi {
      public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("");
    int nilai = input.nextInt();
    
    for (int i = 1; i <=nilai; i++){
      for (int j = 0; j <=nilai; j++){
        if (i==1 || i==nilai || j==0 || j==nilai){
          System.out.print("#");
        }else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
    
  }
}
