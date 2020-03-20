/*********************************
 ******* @author Mr Exxon ********
 *********************************/
package if_else;

import java.util.Scanner;

public class if_else 
{

    public static void main(String[] args) 
    {
       //deklarasi variable String = sejenis kalimat, double = sejenis nilai
       String nama, NIM;
       double algoritma, statistika, pemograman, softwareEnginering, analisisNumerik, matematika, fisika, aljabarLinier;
       //memasukkan fungsi scanner
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Input Name: ");
       nama = sc.nextLine();
       System.out.println("Input NIM: ");
       NIM = sc.nextLine();
        System.out.println();//space
       System.out.println("Input algoritma: ");
       algoritma = sc.nextDouble();
       System.out.println("Input statistika: ");
       statistika = sc.nextDouble();
       System.out.println("Input pemograman: ");
       pemograman = sc.nextDouble();
       System.out.println("Input softwareEnginering: ");
       softwareEnginering = sc.nextDouble();
       System.out.println("Input analisisNumerik: ");
       analisisNumerik = sc.nextDouble();
       System.out.println("Input matematika: ");
       matematika = sc.nextDouble();
       System.out.println("Input fisika: ");
       fisika = sc.nextDouble();
       System.out.println("Input aljabarLinier: ");
       aljabarLinier = sc.nextDouble();
       
       //logika perhitungan
       double ip = algoritma+statistika+pemograman+softwareEnginering+analisisNumerik+matematika+fisika+aljabarLinier;
       double total = ip / 8;//rata-rata nilai
       
       //display nama, nim, dan seluruh nilai
       System.out.println("Name: " + nama);
       System.out.println("NIM: " + NIM);
       System.out.println("algoritma: " + algoritma);
       System.out.println("statistika: " + statistika);
       System.out.println("pemograman: " + pemograman);
       System.out.println("softwareEnginering: " + softwareEnginering);
       System.out.println("analisisNumerik: " + analisisNumerik);
       System.out.println("matematika: " + matematika);
       System.out.println("fisika: " + fisika);
       System.out.println("aljabarLinier: " + aljabarLinier);
       
       
       System.out.println("===========================================================================");
       System.out.println("Name: " + nama);
       System.out.println("NIM: " + NIM);
       System.out.println("=============================Sedang Menghitung=============================");
       System.out.println("=============================Sedang Menghitung=============================");
       System.out.println("                                                                           ");
       System.out.println("Total Indeks Prestasi Anda Semester Ini Adalah " + total + " (satuan =4)");
       System.out.println("                                                                           ");
       
       
       //if else untuk menentukan kalimat sesuai nilai yang diperoleh
       if (total>3){
       System.out.println("====================Semangat Untuk Semester Berikutnya=====================");
       } else{
       
       if (total>2.5){
       System.out.println("=========================Tolong Ditingkatkan Lagi==========================");
       } else{
       
       System.out.println("======Tingkatkan Latihan Dan Harap Lebih Fokus Di Semester Berkutnya======");
       
       }
       }
    }
    
}
