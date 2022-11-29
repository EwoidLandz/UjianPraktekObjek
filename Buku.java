/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujianpraktekobjek;

/**
 *
 * @author PC
 */
public class Buku {
    public String judul,kelas,penulis,penerbit;
    public int harga;
    
    public Buku(String judul,String kelas, String penulis, String penerbit, int harga){
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
    public static void main(String [] args){
        Buku buku1 = new Buku("Pemograman Berorientasi Objek", "XII RPL", "Teguh Purnomo", "Erlangga", 95000);
        buku1.getInfo();
    }
}
