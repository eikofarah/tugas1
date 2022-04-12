package saldonasabah;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class SaldoNasabah {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int saldoawal = scan.nextInt();
        int setoran = scan.nextInt();
        System.out.println(uangakhir(saldoawal, setoran));
    }
    public static double uangakhir (int saldo, int setor){
        int jumlah = saldo + setor;
        int admin = jumlah - 7000;
        double bonus = admin + (admin * 0.0005);
        return bonus;
    }
}