/*********************************
 ******* @author Mr Exxon ********
 *********************************/

/*
Inti dari program ini adalah
membuat login page
jika User ID dan PAssword tidak sesuai
dengan yang didalam code maka akan muncul
display yang berbeda
*/
package if_else_v2;

import java.util.Scanner;

public class if_else_v2 
{

    public static void main(String[] args) 
    {
        //deklarasi variable
        String user_id, password;
        
        //memasukkan data menggunakan scanner method
        Scanner sc = new Scanner(System.in);
        System.out.println("User ID: ");
        user_id = sc.nextLine();
        System.out.println("PASSWORD: ");
        password = sc.nextLine();
        
       //if else method
       if (("*123#".equals(password)) && ("programmer".equals(user_id)))
       System.out.println("Login Sukses");
       
       else {
       System.out.println("Masukkan User ID dan Password dengan benar");
       }
    }
    
}
