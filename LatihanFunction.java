/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *
 * @author AZZAHRA
 */
public class LatihanFunction {
    
    static void tampilNama(int id){
        String namaPelanggan[]={"ali","budi","dani","edi","umar"};
        System.out.println(namaPelanggan[id-1]);
    }
    static void hitungTarif(int jumlahPakai){
        int harga = 0;
        if(jumlahPakai >0 || jumlahPakai<10){
            jumlahPakai=10;
            harga=jumlahPakai*2000;
        }
        else if(jumlahPakai>=11 && jumlahPakai<=20){
            harga=jumlahPakai*3000;
        }
        else if(jumlahPakai>=21 && jumlahPakai<=30){
            harga=jumlahPakai*4000;
        }
        else if(jumlahPakai>=31){
            harga=jumlahPakai*5000;
        }
    }
}

   