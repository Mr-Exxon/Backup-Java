/*********************************
 ******* @author Mr Exxon ********
 *********************************/
package Switch_v2;

import java.util.Scanner;

public class Switch_v2 
{

    public static void main(String[] args) 
    {
        //deklarasi variable
        String flower;
        //fungsi scanner
        Scanner scan = new Scanner(System.in);

        //membuat menu
        System.out.println("1. Red ");
        System.out.println("2. Yellow ");
        System.out.println("3. Purple ");
        System.out.println("Choose Your Favourite Colour: (Only Number) ");
        flower = scan.nextLine();  
    
        //switch case method
        switch(flower.toLowerCase())
        {
            case "red" :
                System.out.println("Rose");
                break;
            case "yellow" :
                System.out.println("Jasmine");
                break;
            case "purple" :
                System.out.println("Orchid");
                break;
            default :
                System.out.println("Wrong Number");
        }
    }
    
}
