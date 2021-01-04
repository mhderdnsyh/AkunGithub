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
public class PilihJurusanKuliah {
      public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int paket = input.nextInt();
        
        switch (paket){
           case 1:
                System.out.println("Selamat datang di jurusan Teknik Informatika");
                break;
            case 2:
                System.out.println("Selamat datang di jurusan Sistem Informasi");
                break;
            case 3:
                System.out.println("Selamat datang di jurusan Teknik Elektro");
                break;
            case 4:
                System.out.println("Selamat datang di jurusan Teknik Industri");
                break;
            case 5:
                System.out.println("Selamat datang di jurusan Matematika Terapan");
                break;
        }
  }
}
