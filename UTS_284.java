/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_284;
import java.util.Scanner;
/**
 *
 * @author budip
 */
public class UTS_284 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        String nama;
        int nim;
        Scanner keyboard = new Scanner (System.in);
        
        System.out.print("Masukkan Nama Mahasiswa : ");
        nama = keyboard.nextLine();
        System.out.print("Masukkan NIM            : ");
        nim = keyboard.nextInt();
        System.out.println("Data yang anda masukkan : " + nama + " dengan NIM " + nim);
        
        
        
        
    }
    
}
