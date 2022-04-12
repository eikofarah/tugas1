package menghitungluas;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class MenghitungLuas {

    public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    int angka = scan.nextInt();
    switch(angka){
        case 1 :
            int sisi = scan.nextInt();
            System.out.println(luaspersegi(sisi));
            break;
        case 2 :
            double alas = scan.nextDouble();
            double tinggi = scan.nextDouble();
            System.out.println(luassegitiga(alas, tinggi));
            break;
        case 3 :
            double jari2 = scan.nextDouble();
            if (jari2 % 7 == 0){
                System.out.println(luaslingkaran(jari2));
                break;
            } else{
                System.out.println(luaslingkaran2(jari2));
                break;
            }
        default:
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
    
    public static int luaspersegi(int s){
        int luaspersegi = s*s;
        return luaspersegi;
    }
    public static int luassegitiga(double a, double t){
        double luassegitiga = a * t / 2;
        int luas = (int) luassegitiga;
        return luas;
    }
    public static double luaslingkaran(double r){
        double luaslingkaran = 22 / 7 * r * r;
        return luaslingkaran;
    }
    public static double luaslingkaran2(double r){
        double luaslingkaran2 = 3.14 * r* r;
        int luas = (int)luaslingkaran2;
        return luas;
    }
}
