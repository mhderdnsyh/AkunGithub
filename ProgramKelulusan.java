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
public class ProgramKelulusan {
      public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int nilai = input.nextInt();
    
    if (nilai > 54){
      String output = "Selamat! Anda lulus dengan nilai " + nilai;
      System.out.println(output);
    }
    
    System.out.println("Program selesai");
   
  }
}
