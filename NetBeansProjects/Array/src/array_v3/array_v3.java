/*********************************
 ******* @author Mr Exxon ********
 *********************************/
/*
Inti dari program ini adalah
untuk mengisi biodata seseorang
Nama, Nomor Telepon, dan Domisili
Untuk Program ini belum finish
*/
package array_v3;

import java.util.Scanner;

public class array_v3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //memasukkan fungsi scanner 
        Scanner sc = new Scanner(System.in); 
        Scanner nm = new Scanner(System.in); 
        
        {
            //deklarasi array
            int x=100, banyak;
            String Nama[]= new String[x];
            String Telp[]= new String[x];
            String Domisili[]= new String[x];

            /*
            membuat pilihan data
            1. input
            2. display
            3. exit
            */
            System.out.print("Masukan Pilihan data: "); 
            int cari = sc.nextInt();
            
            for(int i=0; i<cari; i++)
            {
            
            //switch case method untuk menampilkan daripada pilihan yang sudah dimasukkan    
            switch (cari)
            {
                case 1 :
                    System.out.println();
                    System.out.println("data ke " + (i+1));

                    System.out.print("Nama : ");
                    Nama[i] = nm.nextLine();
                    System.out.print("Telp : ");
                    Telp[i] = nm.nextLine();
                    System.out.print("Domisili : ");
                    Domisili[i] = nm.nextLine();
                    
                    System.out.println();
                    System.out.print("Tambah data ? (1/2)");
                    int milih = sc.nextInt();
                    
                    switch(milih){
                        case 1 :
                        array_v3.main(args);//kembali ke awal
                    }
                    
                    break;
                
                case 2 :    
                    for(i=0; i<cari; i++)
                    {
                    System.out.println(Nama[i] +" - "+ Telp[i] +" - "+ Domisili[i]);
                    }
                    break;
                    
                case 3 :
                    System.out.println("Terimakasih");
                    System.exit(0);
            }
            }
                
        }
    }
    
}
