/*********************************
 ******* @author Mr Exxon ********
 *********************************/

/*
Inti dari program ini adalah
untuk memasukkan data diri dan menampilkannya
terdiri atas :
Nama, Nomor Telepon, dan Domisili

Code masih dirty
*/
package array_v4;
import java.util.Scanner;
public class array_v4 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        Scanner nm = new Scanner(System.in);
        Scanner mau = new Scanner(System.in);
        
        //membuat pilihan menu
        System.out.println("Selection : ");
        System.out.println("1. Input Data\n2. Exit");
        System.out.println("==========================");
            
            //deklarasi array
            int x=100;
            String Nama[]= new String[x];
            String Telp[]= new String[x];
            String Domisili[]= new String[x];

            int banyak;
            System.out.print("Masukan Pilihan data: "); 
            int cari = sc.nextInt();
            
            for(int i=0; i<2; i++)
            {
                switch (cari) 
                {
                    case 1:            
                        System.out.println();

                        System.out.println("data :");

                        System.out.print("Nama : ");
                        Nama[i] = nm.nextLine();
                        System.out.print("Telp : ");
                        Telp[i] = nm.nextLine();
                        System.out.print("Domisili : ");
                        Domisili[i] = nm.nextLine();
                        System.out.println();
                        System.out.println();
                        System.out.print("Finish ? (Y/N)");
                        String pilih= mau.nextLine();
                        if ("N".equals(pilih))
                        {
                            array_v4.main(args);
                        }
                        break;
                    
                    default :
                        System.out.println("Terimakasih");
                        System.exit(0);

                }
                    for(i=0; i<cari; i++)
                        {
                            System.out.println(Nama[i] +" - "+ Telp[i] +" - "+ Domisili[i]);
                        }
                
            }
    }
    
}
