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
public class KurangBagusSangatBagus {
     public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int nilai = input.nextInt();
    
    if (nilai > 75){
      System.out.println("Sangat Bagus");
    }else if (nilai > 54){
      System.out.println("Bagus");
    }else {
      System.out.println("Kurang");
    }
   
  } 
}
