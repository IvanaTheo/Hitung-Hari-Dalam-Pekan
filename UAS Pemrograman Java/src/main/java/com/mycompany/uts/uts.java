/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
  
/**
 *
 * @author ACER
 */
public class uts {
    public static LocalDate calculateFutureDate(LocalDate inputDate, int numberOfWeeks) {
        // Gunakan metode plusWeeks() untuk menambahkan jumlah pekan ke tanggal inputDate
        return inputDate.plusWeeks(numberOfWeeks);
    }

    public static void main(String[] args) {
        String tgl1 = "";
        String tgl2= "";
        String tgl3 = "";
        int jumlahPekan;
        int pilihan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Algoritma Hitung Pekan");
        System.out.println("Fungsi yang akan digunakan :");
        System.out.println("1. Hitung pekan antara 2 tanggal");
        System.out.println("2. Hitung tanggal terakhir dari pekan yang ditambahkan");
        System.out.println("=========================");
        pilihan = scanner.nextInt();
        switch(pilihan){
            case 1 -> {
                System.out.print("Masukkan Tanggal Pertama (yyyy-mm-dd) : ");
                tgl1 = scanner.next();
                System.out.println("");
                System.out.print("Masukkan Tanggal Kedua (yyyy-mm-dd) :");
                tgl2 = scanner.next();
                
                if(!tgl1.isBlank() && !tgl2.isBlank()){
                    LocalDate dateSatu = LocalDate.parse(tgl1);
                    LocalDate dateDua = LocalDate.parse(tgl2);
                    long weeksBetweenDates = ChronoUnit.WEEKS.between(dateSatu, dateDua);
                    System.out.println("Jumlah pekan antara kedua tanggal: " + weeksBetweenDates + " pekan");
                }   }
            case 2 -> {
                System.out.print("Masukkan tanggal (yyyy-mm-dd) : ");
                tgl3 = scanner.next();
                LocalDate dateTiga = LocalDate.parse(tgl3);
                System.out.print("Masukkan jumlah pekan : ");
                jumlahPekan = scanner.nextInt();
                LocalDate futureDate = calculateFutureDate(dateTiga, jumlahPekan);
                System.out.println("Tanggal terkini setelah " + jumlahPekan + " pekan dari " + dateTiga + " adalah: " + futureDate);
            }
            default -> {
            }
                
        }
              
        
    }
}

//bagian ndi???