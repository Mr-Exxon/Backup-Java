/*********************************
 ******* @author Mr Exxon ********
 *********************************/
package Switch;

import java.util.Scanner;

public class Switch 
{

    public static void main(String[] args) 
    {
        //deklarasi variable
        int first, second, operator;
        //memasukkan scanner
        Scanner sc = new Scanner(System.in);
        
        //input angka menggunakan scanner method
        System.out.println("Input Fist Number: ");
        first = sc.nextInt();
        System.out.println("Input Second Number: ");
        second = sc.nextInt();
        
        //input operator menggunakan scanner
        System.out.println("Input Operator: ");
        System.out.println("1 : + ");
        System.out.println("2 : - ");
        System.out.println("3 : * ");
        System.out.println("4 : / ");
        System.out.println("5 : % ");
        operator = sc.nextInt();
        
        //inti program dengan switch case method
        String pilihan;
        switch (operator) 
        {
            case 1:  pilihan = "+";
                     System.out.print(first);
                     System.out.print(pilihan);
                     System.out.print(second);
                     System.out.print("=");
                     System.out.print((first+second));
                     break;
                     
            case 2:  pilihan = "-";
                     System.out.print(first);
                     System.out.print(pilihan);
                     System.out.print(second);
                     System.out.print("=");
                     System.out.print((first-second));
                     break;
                     
            case 3:  pilihan = "*";
                     System.out.print(first);
                     System.out.print(pilihan);
                     System.out.print(second);
                     System.out.print("=");
                     System.out.print((first*second));
                     break;
                     
            case 4:  pilihan = "/";
                     System.out.print(first);
                     System.out.print(pilihan);
                     System.out.print(second);
                     System.out.print("=");
                     System.out.print((first/second));
                     break;
            case 5:  pilihan = "%";
                     System.out.print(first);
                     System.out.print(pilihan);
                     System.out.print(second);
                     System.out.print("=");
                     System.out.print((first%second));                     
                     break;
                     
            default: System.out.println("Invalid Operator");
                     break;
        }
    }
    
}
