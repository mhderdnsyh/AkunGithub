/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62813
 */
import java.io.*;
import java.util.*;

public class HitungAngkaGanjil {
      public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    int angka = 0;
    int totalganjil = 0;
    try {
      while (true) {
        angka = input.nextInt();
        if (angka % 2 != 0) {
          totalganjil++;
        }
      }
    }
    catch(NumberFormatException ex) {
      System.out.println (totalganjil);
    }
    catch (Exception ex) {
      System.out.println (totalganjil);
    }
      
}
}
