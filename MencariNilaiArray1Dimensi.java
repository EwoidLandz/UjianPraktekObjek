package com.mycompany.ujianpraktekobjek;
import java.util.Scanner;
public class MencariNilaiArray1Dimensi {
    public static int[] numbers = 
    {2,4,6,3,5} , inputan_angka;
    public static Boolean hasilPencarian = false;
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void getNumber(){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
            
        }
    }
}
