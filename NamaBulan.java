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
public class NamaBulan {
     public static void main(String[] args) {
    
   
        Scanner input = new Scanner(System.in);
        String[] bulan = {
                "Nomor tidak valid",
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
                "Nomor tidak valid"
        };

        // Input bulan
      
        int nomorBulan = input.nextInt();

        System.out.println(   bulan[nomorBulan] );

    
  } 
}
