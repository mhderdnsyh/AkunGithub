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
public class GanjilGenap {
     public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int angka = input.nextInt();
    
    String output = angka % 2 == 0 ? "Genap" : "Ganjil";
    
    System.out.printf("%s",  output);
    
    
  } 
}
