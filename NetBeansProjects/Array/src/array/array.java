/*********************************
 ******* @author Mr Exxon ********
 *********************************/
package array;
public class array {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //deklarasi string kedalam array
        
        //[row size][column size]
        //Array Satu Dimensi
        int[] Class = new int[] {1,2,3,4,5,6,7,8,9,10};
        //Array Multi Dimensi
        String[][] Name = new String[][] {{"a", "b", "c"}, {"d", "e", "f"}};
        
        //display isi dari array yang diinginkan
        for (int c=0; c<Class.length; c++) //Class.length = jumlah isi dari array
        {        
         System.out.print(Class[c] + ", ");
        }
        
        //spasi
        System.out.println();
        System.out.println();
        
        //display array Name menggunakan looping for
        for (String[] Name1 : Name) 
        {
            for (int j = 0; j<=Name.length; j++) 
            {
                System.out.print(Name1[j] + ", ");
            }
        }
    }
    
}
