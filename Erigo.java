package com.Pemlan;

import java.util.Scanner;

public class Erigo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Baju baju = new Baju();

        System.out.print("Masukkan jenis baju yang ingin anda beli  : ");
        baju.jenis = in.nextLine();
        System.out.print("Masukkan jumlah baju yang ingin anda beli : ");
        baju.jumlah = in.nextInt();
        in.nextLine();

        baju.hargaA();
        baju.hargaB();
        baju.hargaC();

        baju.display();
    }
}

class Baju {
    String jenis;
    double harga;
    int jumlah;

    public Baju (String a, int b){
        this.jenis = a;
        this.jumlah = b;
    }

    final double bajuA = 100000;
    final double bajuB = 125000;
    final double bajuC = 175000;

    public Baju() {

    }

    void hargaA (){
        this.harga = bajuA;
        if (jumlah > 100){
            harga = 95000;
        }
    }

    void hargaB (){
        this.harga = bajuB;
        if (jumlah > 100){
            harga = 120000;
        }
    }

    void hargaC (){
        this.harga = bajuC;
        if (jumlah > 100){
            harga = 160000;
        }
    }

    void display (){
        if (jenis.equalsIgnoreCase("a")){
            hargaA();
        }else if (jenis.equalsIgnoreCase("b")){
            hargaB();
        }else if (jenis.equalsIgnoreCase("c")){
            hargaC();
        }
        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.printf("Harga per buah       : %.0f\n", harga);
        System.out.printf("Total harga          : %.0f\n", harga*jumlah);
    }
}
