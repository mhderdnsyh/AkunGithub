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
public class MenghitungJumlahPerbaris {
      public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int matrix[][] = new int[5][5];
    
    for (int i = 0; i < 5; i++){
      for (int j = 0; j < 5; j++){
        matrix[i][j] = input.nextInt();
      }
    }
    int hasil = 0;
    for (int i = 0; i < 5; i++){
      for (int j = 0; j < 5;j++){
        hasil += matrix[i][j];
      }
      System.out.println(hasil);
      hasil = 0;
    }
  }
}
