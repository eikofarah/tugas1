package suratkaisar;
import java.io.*;
import java.util.*;

public class SuratKaisar {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String kata = scan.nextLine();
        int angkageser = scan.nextInt();
        System.out.println(prosesgeser(kata, angkageser));
    }
    public static String prosesgeser(String kt, int angka){
        String hasilgeser = "";
        for(int i=0; i < kt.length();i++) {
            char huruf = kt.charAt(i);
            if(huruf >= 'a' && huruf <= 'z') {
                huruf = (char) (huruf + angka);
                if(huruf > 'z') {
                    huruf = (char) (huruf + 'a'-'z'-1);
                }
                hasilgeser = hasilgeser + huruf;
            } else if(huruf >= 'A' && huruf <= 'Z') {
                huruf = (char) (huruf + angka);
                if(huruf > 'Z') {
                    huruf = (char) (huruf +'A'-'Z'-1);
                }
                hasilgeser = hasilgeser + huruf;
            } else {
                hasilgeser = hasilgeser + huruf;
            }
        }
            return hasilgeser;
        }
    }
