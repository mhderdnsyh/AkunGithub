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
public class SpecialSwitchCase {
      public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int paket = input.nextInt();
        
    switch (paket){
       case 1:
                System.out.println("Satu");
                System.out.println("Dua");
                System.out.println("Tiga");
                break;
            case 2:
                System.out.println("Dua");
                System.out.println("Tiga");
                break;
            case 3:
            System.out.println("Tiga");
                break; 
    }    
    
  }
}
