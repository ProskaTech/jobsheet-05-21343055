/*
Nama : Muhamad Fathur Rahman
Nim  : 21343055
Prodi: Teknik Informatika
*/

package Latihan;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String [] args){
        float angka1, angka2, jumlah;
        Scanner dataMasuk = new Scanner(System.in);
        
        System.out.print("Masukkan angka ke-1 : ");
        angka1 = dataMasuk.nextFloat();

        System.out.print("Masukkan angka ke-2 : ");
        angka2 = dataMasuk.nextFloat();

        jumlah = angka1 + angka2;

        System.out.println("Masukkan angka ke-1 : " + angka1);
        System.out.println("Masukkan angka ke-2 : " + angka2);
        System.out.println("Jumlah : " + jumlah);
    }    
}
