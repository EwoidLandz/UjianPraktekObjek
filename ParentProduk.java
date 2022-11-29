package com.mycompany.ujianpraktekobjek;

public class ParentProduk {
    public String judul,kelas,penulis,penerbit;
    public int harga;
    
    public ParentProduk(String judul, String kelas, String penulis, String penerbit, int harga){
        this.judul = judul;
        this.kelas = kelas;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.harga = harga;
    }
    
    public void getInfo(){
        System.out.println("Data Buku: ");
        System.out.println("Judul: " + judul);
        System.out.println("Kelas: " + kelas);
        System.out.println("Penulis: " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Harga: " + "Rp." + harga);
    }
}
