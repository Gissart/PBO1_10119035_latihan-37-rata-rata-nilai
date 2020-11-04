package com.tugasPBO;
import java.util.Scanner;
//nama = Argya Aulia Fauzandika
//nim = 10119035
//kelas = IF1
//Deskripsi = menghitung rata-rata nilai mahasiswa
public class rataRata {
    public int nilai[], total, jumlah;

    public void input(){
        total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlah = scan.nextInt();
        nilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Nilai mahasiswa ke-"+(i + 1)+" :");
            nilai[i] = scan.nextInt();
            total += nilai[i];
        }
    }
    public static void main(String[] args){
        rataRata obj = new rataRata();
        obj.input();
        System.out.println("maka rata-rata nilainya adalah : "+ obj.avg(obj.total,obj.jumlah));
        System.out.print("Developed by Argya");
    }

    private double avg(double total, double jumlah){
        double rata = total/jumlah;
        return rata;
    }
}
