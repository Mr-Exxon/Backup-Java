/*********************************
 ******* @author Mr Exxon ********
 *********************************/

/*
Inti dari code ini adalah
untuk menginput daftar nama
dengan batas yang ditentukan
oleh yang menjalankan program
*/
package array_v2;

import java.util.Scanner;

public class array_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int banyak;
        String Name;
        //memasukkan scanner
        Scanner sc = new Scanner(System.in);
        Scanner siswa = new Scanner(System.in);
       
        System.out.print("banyak : ");
        banyak = siswa.nextInt(); 
        
        
        //logika perulangan
        String[] arr = new String[banyak];
        for( int i = 0; i < arr.length; i++ )//arr.length adalah banyak data yang ditampung oleh array
        {
            //memasukkan nama
            System.out.print("Nama : ");
            arr[i] = sc.nextLine();
        }
        
        //untuk hasil akhir
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
    }
    
}
