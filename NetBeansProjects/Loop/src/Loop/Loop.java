/*********************************
 ******* @author Mr Exxon ********
 *********************************/
package Loop;
public class Loop 
{

    public static void main(String[] args) 
    {
        //deklarasi variable
        char j;
        
        //for looping satu
        for (int i=0; i<=5; i++)
        {
         //for looping dua
         for(j=1; j<=i; j++)
         {
          //mengganti output menjadi tanda "*"
          System.out.print("*");
         }
         //spasi
         System.out.println();
        }
    }
    
}
