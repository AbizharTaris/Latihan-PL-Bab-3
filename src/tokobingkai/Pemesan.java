package tokobingkai;

import java.util.Scanner;

public class Pemesan {
    Scanner in = new Scanner(System.in);
    private String ID;
    private String nama;
    private String tanggal;
    private String bingkai;
    private int ukuran;
    
    public void Pemesan(){
        ID = "";
        nama = "";
        tanggal = "";
    }
    public void Pemesan(String id,String n,String t){
        ID = id;
        nama = n;
        tanggal = t;
    }
    public void setID(String id){
        ID = id;
    }
    public void setNama(String n){
        nama = n;
    }
    public void setTanggal(String t){
        tanggal = t;
    }
    
    public void display(){
        System.out.println("ID : "+ID);
        System.out.println("Nama : "+nama);
        System.out.println("Tanggal Pemesanan : "+tanggal);
    }
}
