/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62813
 */
public class OperatorPrecedence {
      public static void main(String[] args) {
        int x = 6;
        int y = 12;
        boolean hasil = x + x++ < y && y - x > 2;
        System.out.println( hasil );
    } 
}
