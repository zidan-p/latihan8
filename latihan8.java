
package latihanPBO;
import java.util.Scanner;   //import Scanner

public class latihan8 {


    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);   //membuat Scanner baru
        System.out.println("masukan nilai TPA");    // menampilkan niali
        int TPA = masukan.nextInt();    //mendeklarasikan berserta memberi nili varibel
        System.out.println("masukan nilai bahasa ingris"); // menampilkan kalimat
        int BahasaInggris = masukan.nextInt();  // mendeklarasikan beserta memberi nilai pada variabel
        if ((TPA > 85) && (BahasaInggris > 80)){ //kondisi pertama dengan 2 kondisi yang harus bernilai benar agar program di dalamkan dijalankan
        System.out.println("siswa dapat beasiswa");
         
        }
        else //jikia tidak terdapat program  yang berniali benar makan program di bawah akan di jalankan
            System.out.println("siswa tidak dapat beasiswa");
    }
    
}
