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
public class LabelTanggal {
      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        String[] bulan = {
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
        };

       
        
// input tsnggsl
int tanggal = input.nextInt();


// Input bulan
        
        int nomorBulan = input.nextInt();

        

        //input tahun
        int tahun = input.nextInt();
        
        //output
        System.out.println( tanggal  + " " + bulan[nomorBulan-1]+ " "  +  tahun
        );
      
        
  }
}
