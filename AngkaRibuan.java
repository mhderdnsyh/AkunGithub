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
public class AngkaRibuan {
      public static void main(String[] args) {
    Locale bahasa = new Locale("id"); 
    Scanner input = new Scanner(System.in);
    int angka = input.nextInt();
    
    System.out.printf(bahasa, "Rp%,d,-\n",angka);
  }
}
