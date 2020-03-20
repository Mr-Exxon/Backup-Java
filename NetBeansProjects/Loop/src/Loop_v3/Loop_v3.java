/*********************************
 ******* @author Mr Exxon ********
 *********************************/
package Loop_v3;

import java.util.Scanner;

public class Loop_v3 
{

    public static void main(String[] args) 
    {
        //deklarasi variable
    int a, first, beda, batas, banyak, total = 0;
    int memilih;
    
    //memasukkan scanner
    Scanner sc = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);
    
       //memasukan data menggunakan scanner method
       System.out.print("First Number : ");
       first = sc.nextInt();    
       
       System.out.print("beda : ");
       beda = sc.nextInt();   
       
       System.out.print("banyak : ");
       banyak = sc.nextInt(); 
       
       //logika batas
       batas = first + banyak * beda;
       
       //output
       System.out.print("Hasil Bilangan : ");
        for (a=first; a<batas; a+=beda)
        {
            total = total + a;
            System.out.print(a + " ");  
        }
            //memasukkan pilihan untuk switch case
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Apakah ingin menjumlahkan hasil ?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.println(" ");
            System.out.print("Jawaban : ");
            memilih = scan.nextInt();
            
        //switch case method    
        switch(memilih)
        {
            case 1 : 
                System.out.println("Jumlah = " + total);
                break;
            case 2 :
                System.out.println("Thank You");
        }
    }
    
}
