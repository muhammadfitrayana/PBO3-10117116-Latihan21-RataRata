/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan21.ratarata;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Rata-Rata
 *  
 */


public class PBO310117116Latihan21RataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int n, jml, nilai[];
        float rata, jumlah = 0;
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        
        nilai = new int[n];
        
        for(int i=0; i<=n-1; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = input.nextInt();
            
        }
        
        for(int j=0; j<=n-1; j++) {
            jumlah = jumlah + nilai[j];
        }
    
        rata = jumlah / n;
        
        System.out.println("");
        System.out.println("Maka, Rata-Rata Nilainya Adalah " + rata);
        
        System.out.println("Developed by : Muhammad Fitrayana");
    }
    
}
