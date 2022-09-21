/*
Nama : Muhamad Fathur Rahman
Nim  : 21343055
Prodi: Teknik Informatika
*/

package Latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard1 {
    public static void main(String args []) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

        String name = "", hoby = "";

        try {
            System.out.print("Nama anda : ");
            name = dataIn.readLine();
            System.out.print("Hobi anda : ");
            hoby = dataIn.readLine();
        }

        catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
        
        System.out.println("Jadi Hobi Anda " + hoby + ". Hobi yang bagus " + name );
    }
    
}
