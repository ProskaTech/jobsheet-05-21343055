/*
Nama : Muhamad Fathur Rahman
Nim  : 21343055
Prodi: Teknik Informatika
*/

package Tugas;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas1 {
    public static void main(String[]args){
        Scanner dataMasuk =new Scanner(System.in);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String word3=" ";

        System.out.print("Enter word1:");
        String word1 =dataMasuk.nextLine();

        System.out.print("Enter word2:");
        String word2 =dataMasuk.nextLine();

        try{
            System.out.print("Enter world3:");
            word3= input.readLine();
        }
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
        System.out.println(word1+ " " + word2 + " " + word3);
    }
}