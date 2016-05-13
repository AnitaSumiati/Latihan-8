package latihan8;
import java.util.*;
public class Latihan8 {
    public static void main(String[] args) {
  Scanner input=new Scanner (System.in);
   String ulangi;
        do{
        System.out.println("----------------------");
        System.out.println("Pengecheckan Type Data");
        System.out.println("----------------------");
        System.out.print("Masukan Angka :");
        double angka=input.nextDouble();
        LATIHAN lihat=new LATIHAN(angka);
        if(angka%1==0){
            lihat.I1();
        }else{
            lihat.D1();
        }
        System.out.print("Apakah Anda Ingin Mengulangi nya lagi ?(yes/no) : ");
        ulangi = input.next();
        System.out.println();
   } while (!ulangi.equalsIgnoreCase("No"));   
        System.out.println("-------------------------------------------------");
        System.out.println("Anda Telah Keluar dari Program Pengecheckan angka");
        System.out.println("-------------------------------------------------");
        }
    
}
