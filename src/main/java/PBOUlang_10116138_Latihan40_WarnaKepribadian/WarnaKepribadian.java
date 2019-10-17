/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOUlang_10116138_Latihan40_WarnaKepribadian;

import java.util.Scanner;

/**
 *
 * @author Aradnu
 */
public class WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String warnaK;
        String nama;
        Warna warna = new Warna();
        Scanner scanner = new Scanner(System.in);

        System.out.print(Warna.ANSI_RED + "YUK "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_GREEN + "CEK "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_YELLOW + "KEPRIBADIANMU "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_CYAN + "DARI "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_PURPLE + "WARNA "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_BLUE + "FAVORITMU "
                + Warna.ANSI_RESET + "\n");

        System.out.print("\n" + Warna.ANSI_RED_BACKGROUND + Warna.ANSI_WHITE
                + "\t MERAH \t\t\n" + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_GREEN_BACKGROUND + Warna.ANSI_WHITE
                + "\t HIJAU \t\t\n" + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_YELLOW_BACKGROUND + Warna.ANSI_WHITE
                + "\t KUNING \t\n" + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_BLUE_BACKGROUND + Warna.ANSI_WHITE
                + "\t BIRU \t\t\n" + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_PURPLE_BACKGROUND + Warna.ANSI_WHITE
                + "\t UNGU \t\t\n\n" + Warna.ANSI_RESET);

        System.out.print("PILIH WARNA FAVORITMU : ");
        warnaK = scanner.next();
        System.out.print("NAMA KAMU : ");
        nama = scanner.next();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + nama.toUpperCase() + "====");
        Warna.hasilTest(warnaK);
    }
    
}
