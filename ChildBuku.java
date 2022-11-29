package com.mycompany.ujianpraktekobjek;

public class ChildBuku extends ParentProduk{
    public int edisi;
    
    public ChildBuku(String judul,String kelas, String penulis, String penerbit, int harga, int edisi){
        super(judul, kelas, penulis, penerbit, harga);
        this.edisi = edisi;
    }
    
    public void getInfoChild(){
        super.getInfo();
        System.out.println("Edisi: " + edisi);
    }
    
    public static void main(String [] args){
        ChildBuku buku1 = new ChildBuku("Pemograman Berorientasi Objek", "XII RPL", "Teguh Purnomo", "Erlangga", 95000, 2020);
        buku1.getInfoChild();
    }
}
