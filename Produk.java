package com.mycompany.ujianpraktekobjek;

public class Produk {
    public String judul,kelas,penulis,penerbit;
    public int harga;
    
public static void main(String [] args){
    Produk produk1 = new Produk();
    produk1.judul = "Pemograman Berorientasi Objek";
    produk1.kelas = "XII RPL";
    produk1.penulis = "Teguh Purnomo";
    produk1.penerbit = "Erlangga";
    produk1.harga = 95000;
    
    System.out.println("Data Buku: ");
    System.out.println("Judul: " + produk1.judul);
    System.out.println("Kelas: " + produk1.kelas);
    System.out.println("Penulis: " + produk1.penulis);
    System.out.println("Penerbit: " + produk1.penerbit);
    System.out.println("Harga: " + produk1.harga);
}
}