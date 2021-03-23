/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugase_switchcase;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class TugasE_SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menu;
        String jawab;
        String salah;
        String name;
        
        Scanner all = new Scanner (System.in);
        
        System.out.println("             CAFE CERIA      ");
        System.out.println("            ANEKA MINUMAN    ");
        System.out.println("-----------------------------");
        System.out.println("           SPECIAL MENU     :");
        System.out.println("        1. Soft drinks       ");
        System.out.println("        2. Mix juice         ");
        System.out.println("        3. Mix Juice         ");
        System.out.println("        4. Soda milk         ");
        System.out.println("        5. Tea               ");
        System.out.print("Masukkan nama pembeli");
        name = all.nextLine();
        System.out.println("");
        
        System.out.print("Silahkan masukkan pilihan anda : ");
        menu = all.nextLine();
        switch (menu){
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft drink");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + name + " telah berkunjung di cafe Ceria");
                break;
            case "2":
                System.out.println("Minuman yang anda pesan adalah Mix Juice");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + name + " telah berkunjung di cafe Ceria");
                break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah Mix Nescafe");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + name + " telah berkunjung di cafe Ceria");
                break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda Milk");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + name + " telah berkunjung di cafe Ceria");
                break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + name + " telah berkunjung di cafe Ceria");
                break;
            default:
                System.out.println("Silahan anda memilih pilihan yang telah tersedia di daftar menu kami");
                
                
        }
                
                
        
    }
    
}
