/*********************************
 ******* @author Mr Exxon ********
 *********************************/
package Loop_v2;

import java.util.Scanner;

public class Loop_v2 
{

    public static void main(String[] args) 
    {
        //deklarasi variable
        int banyak, memilih, ganjil = 1, genap = 2;
        //memasukkan scanner
        Scanner sc = new Scanner(System.in);    
        //memasukkan data menggunakan scanner
        System.out.print("Banyak Bilangan : ");
        banyak = sc.nextInt();    
        
        //membuat menu & memasukkan data menggunakan scanner
        System.out.println("Pilihan Jenis Bilangan : ");
        System.out.println("1. Ganjil");
        System.out.println("2. Genap");
        System.out.println("");
        System.out.println("");
        System.out.println("Pilihanmu : ");
        memilih = sc.nextInt();
        System.out.println("");
        
        //switch case method
        /*logika do-while adalah menghasilkan nilai awal dahulu baru masuk kepada
        logika pengulangan*/
        switch(memilih)
        {
         case 1 : 
         do 
         {
          System.out.print(ganjil + ", ");
          ganjil+=2;
         }
         while(ganjil < (banyak*2));
         break;

         case 2 :
         do 
         {
          System.out.print(genap + ", ");
          genap+=2;
         }
         while(genap <= (banyak*2));
         break;

         //output jika tidak memilih 1 & 2
         default :
         System.out.println("Pilihan Tidak Tersedia");

        }
    }
    
}
