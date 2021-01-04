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
public class CetakNamaDanUmur {
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        String nama = input.nextLine();
        int tahun = input.nextInt();
        int umur = 2020 - tahun;
        System.out.printf("%s (%d tahun)", nama, umur);
       
    }
}
