/*
Nama : Muhamad Fathur Rahman
Nim  : 21343055
Prodi: Teknik Informatika
*/

package Latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader1 {
    public static void main(String args []) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

        String a, b;
        Float angka1, angka2, jumlah;

        try {
            System.out.print("Masukkan angka pertama : ");
            a = dataIn.readLine();
            angka1 = Float.parseFloat(a);

            System.out.print("Masukkan angka kedua : ");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b);

            jumlah = angka1 + angka2;
            System.out.println("Jumlah : " + jumlah);
        }

        catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
    }
}

