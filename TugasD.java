/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasd;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class TugasD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int price1;
        int price2;
        int price3;
        int price4;
        int price5;
        String total;
        String name;
        
       System.out.println("----------------------------------------");
       System.out.println("      Kharisma Agung Plaza < KAP >      ");
       System.out.println("         Promo Belanja berhadiah        ");
       System.out.println("   Khusus Pembelian 5 Barang Pertama    ");
       System.out.println("    Dengan harga minimum Rp. 10000,00   ");
       System.out.println("----------------------------------------");
       
       Scanner all=new Scanner (System.in);
       
       System.out.print("masukkan nama pembeli : ");
       name = all.nextLine();
       System.out.println("");
       System.out.println("Masukkan harga barang ke-1   : ");
       price1 = all.nextInt();
       System.out.println("Masukkan harga barang ke-2   : ");
       price2 = all.nextInt();
       System.out.println("Masukkan harga barang ke-3   : ");
       price3 = all.nextInt();
       System.out.println("Masukkan harga barang ke-4   : ");
       price4 = all.nextInt();
       System.out.println("Masukkan harga barang ke-5   : ");
       price5 = all.nextInt();
       
       int jumlah = price1 + price2 + price3 + price4 + price5;
       System.out.println("Total pembelian atas nama " + name + " adalah" + jumlah);
       
       if (jumlah >=100000){
           total = "Anda mendapatkan hadiah 1 buah mug cantik";
           System.out.println("");
           System.out.println("Selamat....");
           System.out.println(total);
           System.out.println("");
       }else{
           total = "";
       }
       System.out.println("---------------------------");
       System.out.println("          Terima Kasih     ");
        System.out.println(" Anda sudah berbelanja di Kharisma Agung Plaza");
       }
}
       
       
       
        
    
